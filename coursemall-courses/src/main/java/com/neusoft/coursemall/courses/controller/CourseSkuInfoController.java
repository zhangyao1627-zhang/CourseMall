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

import com.neusoft.coursemall.courses.entity.CourseSkuInfoEntity;
import com.neusoft.coursemall.courses.service.CourseSkuInfoService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 主要是sku的相关描述
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/courseskuinfo")
public class CourseSkuInfoController {
    @Autowired
    private CourseSkuInfoService courseSkuInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:courseskuinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseSkuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{skuId}")
 //   @RequiresPermissions("courses:courseskuinfo:info")
    public R info(@PathVariable("skuId") Long skuId){
		CourseSkuInfoEntity courseSkuInfo = courseSkuInfoService.getById(skuId);

        return R.ok().put("courseSkuInfo", courseSkuInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:courseskuinfo:save")
    public R save(@RequestBody CourseSkuInfoEntity courseSkuInfo){
		courseSkuInfoService.save(courseSkuInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:courseskuinfo:update")
    public R update(@RequestBody CourseSkuInfoEntity courseSkuInfo){
		courseSkuInfoService.updateById(courseSkuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:courseskuinfo:delete")
    public R delete(@RequestBody Long[] skuIds){
		courseSkuInfoService.removeByIds(Arrays.asList(skuIds));

        return R.ok();
    }

}
