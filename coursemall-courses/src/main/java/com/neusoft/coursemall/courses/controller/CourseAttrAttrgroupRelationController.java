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

import com.neusoft.coursemall.courses.entity.CourseAttrAttrgroupRelationEntity;
import com.neusoft.coursemall.courses.service.CourseAttrAttrgroupRelationService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 属性&属性分组关联
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/courseattrattrgrouprelation")
public class CourseAttrAttrgroupRelationController {
    @Autowired
    private CourseAttrAttrgroupRelationService courseAttrAttrgroupRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:courseattrattrgrouprelation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseAttrAttrgroupRelationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("courses:courseattrattrgrouprelation:info")
    public R info(@PathVariable("id") Long id){
		CourseAttrAttrgroupRelationEntity courseAttrAttrgroupRelation = courseAttrAttrgroupRelationService.getById(id);

        return R.ok().put("courseAttrAttrgroupRelation", courseAttrAttrgroupRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:courseattrattrgrouprelation:save")
    public R save(@RequestBody CourseAttrAttrgroupRelationEntity courseAttrAttrgroupRelation){
		courseAttrAttrgroupRelationService.save(courseAttrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:courseattrattrgrouprelation:update")
    public R update(@RequestBody CourseAttrAttrgroupRelationEntity courseAttrAttrgroupRelation){
		courseAttrAttrgroupRelationService.updateById(courseAttrAttrgroupRelation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:courseattrattrgrouprelation:delete")
    public R delete(@RequestBody Long[] ids){
		courseAttrAttrgroupRelationService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
