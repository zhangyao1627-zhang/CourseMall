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

import com.neusoft.coursemall.courses.entity.CourseAttrValueEntity;
import com.neusoft.coursemall.courses.service.CourseAttrValueService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * spu属性值
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/courseattrvalue")
public class CourseAttrValueController {
    @Autowired
    private CourseAttrValueService courseAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:courseattrvalue:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseAttrValueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("courses:courseattrvalue:info")
    public R info(@PathVariable("id") Long id){
		CourseAttrValueEntity courseAttrValue = courseAttrValueService.getById(id);

        return R.ok().put("courseAttrValue", courseAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:courseattrvalue:save")
    public R save(@RequestBody CourseAttrValueEntity courseAttrValue){
		courseAttrValueService.save(courseAttrValue);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:courseattrvalue:update")
    public R update(@RequestBody CourseAttrValueEntity courseAttrValue){
		courseAttrValueService.updateById(courseAttrValue);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:courseattrvalue:delete")
    public R delete(@RequestBody Long[] ids){
		courseAttrValueService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
