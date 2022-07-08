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

import com.neusoft.coursemall.courses.entity.CourseSpuInfoEntity;
import com.neusoft.coursemall.courses.service.CourseSpuInfoService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * spu信息
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/coursespuinfo")
public class CourseSpuInfoController {
    @Autowired
    private CourseSpuInfoService courseSpuInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:coursespuinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseSpuInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("courses:coursespuinfo:info")
    public R info(@PathVariable("id") Long id){
		CourseSpuInfoEntity courseSpuInfo = courseSpuInfoService.getById(id);

        return R.ok().put("courseSpuInfo", courseSpuInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:coursespuinfo:save")
    public R save(@RequestBody CourseSpuInfoEntity courseSpuInfo){
		courseSpuInfoService.save(courseSpuInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:coursespuinfo:update")
    public R update(@RequestBody CourseSpuInfoEntity courseSpuInfo){
		courseSpuInfoService.updateById(courseSpuInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:coursespuinfo:delete")
    public R delete(@RequestBody Long[] ids){
		courseSpuInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
