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

import com.neusoft.coursemall.courses.entity.CourseAttrGroupEntity;
import com.neusoft.coursemall.courses.service.CourseAttrGroupService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 课程属性分组:到时候可以分下是哪个单位制作的
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/courseattrgroup")
public class CourseAttrGroupController {
    @Autowired
    private CourseAttrGroupService courseAttrGroupService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:courseattrgroup:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseAttrGroupService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrGroupId}")
 //   @RequiresPermissions("courses:courseattrgroup:info")
    public R info(@PathVariable("attrGroupId") Long attrGroupId){
		CourseAttrGroupEntity courseAttrGroup = courseAttrGroupService.getById(attrGroupId);

        return R.ok().put("courseAttrGroup", courseAttrGroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:courseattrgroup:save")
    public R save(@RequestBody CourseAttrGroupEntity courseAttrGroup){
		courseAttrGroupService.save(courseAttrGroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:courseattrgroup:update")
    public R update(@RequestBody CourseAttrGroupEntity courseAttrGroup){
		courseAttrGroupService.updateById(courseAttrGroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:courseattrgroup:delete")
    public R delete(@RequestBody Long[] attrGroupIds){
		courseAttrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return R.ok();
    }

}
