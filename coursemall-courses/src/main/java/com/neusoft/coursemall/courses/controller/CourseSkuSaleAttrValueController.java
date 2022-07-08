package com.neusoft.coursemall.courses.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.coursemall.courses.entity.CourseSkuSaleAttrValueEntity;
import com.neusoft.coursemall.courses.service.CourseSkuSaleAttrValueService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 销售的一些信息:sku销售属性&值
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/courseskusaleattrvalue")
public class CourseSkuSaleAttrValueController {
    @Autowired
    private CourseSkuSaleAttrValueService courseSkuSaleAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:courseskusaleattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseSkuSaleAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("courses:courseskusaleattrvalue:info")
    public R info(@PathVariable("id") Long id){
		CourseSkuSaleAttrValueEntity courseSkuSaleAttrValue = courseSkuSaleAttrValueService.getById(id);

        return R.ok().put("courseSkuSaleAttrValue", courseSkuSaleAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:courseskusaleattrvalue:save")
    public R save(@RequestBody CourseSkuSaleAttrValueEntity courseSkuSaleAttrValue){
		courseSkuSaleAttrValueService.save(courseSkuSaleAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:courseskusaleattrvalue:update")
    public R update(@RequestBody CourseSkuSaleAttrValueEntity courseSkuSaleAttrValue){
		courseSkuSaleAttrValueService.updateById(courseSkuSaleAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:courseskusaleattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		courseSkuSaleAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
