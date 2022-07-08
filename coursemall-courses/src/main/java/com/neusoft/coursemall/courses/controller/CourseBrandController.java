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

import com.neusoft.coursemall.courses.entity.CourseBrandEntity;
import com.neusoft.coursemall.courses.service.CourseBrandService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 品牌
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/coursebrand")
public class CourseBrandController {
    @Autowired
    private CourseBrandService courseBrandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:coursebrand:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseBrandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
 //   @RequiresPermissions("courses:coursebrand:info")
    public R info(@PathVariable("brandId") Long brandId){
		CourseBrandEntity courseBrand = courseBrandService.getById(brandId);

        return R.ok().put("courseBrand", courseBrand);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:coursebrand:save")
    public R save(@RequestBody CourseBrandEntity courseBrand){
		courseBrandService.save(courseBrand);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:coursebrand:update")
    public R update(@RequestBody CourseBrandEntity courseBrand){
		courseBrandService.updateById(courseBrand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:coursebrand:delete")
    public R delete(@RequestBody Long[] brandIds){
		courseBrandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
