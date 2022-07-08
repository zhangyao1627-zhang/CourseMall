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

import com.neusoft.coursemall.courses.entity.CourseCategoryEntity;
import com.neusoft.coursemall.courses.service.CourseCategoryService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 课程的分类:可以是小学初中高中大学
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/coursecategory")
public class CourseCategoryController {
    @Autowired
    private CourseCategoryService courseCategoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:coursecategory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
 //   @RequiresPermissions("courses:coursecategory:info")
    public R info(@PathVariable("catId") Long catId){
		CourseCategoryEntity courseCategory = courseCategoryService.getById(catId);

        return R.ok().put("courseCategory", courseCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:coursecategory:save")
    public R save(@RequestBody CourseCategoryEntity courseCategory){
		courseCategoryService.save(courseCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:coursecategory:update")
    public R update(@RequestBody CourseCategoryEntity courseCategory){
		courseCategoryService.updateById(courseCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:coursecategory:delete")
    public R delete(@RequestBody Long[] catIds){
		courseCategoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
