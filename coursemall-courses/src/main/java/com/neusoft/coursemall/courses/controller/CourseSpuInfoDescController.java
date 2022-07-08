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

import com.neusoft.coursemall.courses.entity.CourseSpuInfoDescEntity;
import com.neusoft.coursemall.courses.service.CourseSpuInfoDescService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * spu信息介绍
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/coursespuinfodesc")
public class CourseSpuInfoDescController {
    @Autowired
    private CourseSpuInfoDescService courseSpuInfoDescService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:coursespuinfodesc:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseSpuInfoDescService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{spuId}")
 //   @RequiresPermissions("courses:coursespuinfodesc:info")
    public R info(@PathVariable("spuId") Long spuId){
		CourseSpuInfoDescEntity courseSpuInfoDesc = courseSpuInfoDescService.getById(spuId);

        return R.ok().put("courseSpuInfoDesc", courseSpuInfoDesc);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:coursespuinfodesc:save")
    public R save(@RequestBody CourseSpuInfoDescEntity courseSpuInfoDesc){
		courseSpuInfoDescService.save(courseSpuInfoDesc);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:coursespuinfodesc:update")
    public R update(@RequestBody CourseSpuInfoDescEntity courseSpuInfoDesc){
		courseSpuInfoDescService.updateById(courseSpuInfoDesc);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:coursespuinfodesc:delete")
    public R delete(@RequestBody Long[] spuIds){
		courseSpuInfoDescService.removeByIds(Arrays.asList(spuIds));

        return R.ok();
    }

}
