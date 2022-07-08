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

import com.neusoft.coursemall.courses.entity.CourseSpuImagesEntity;
import com.neusoft.coursemall.courses.service.CourseSpuImagesService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * spu图片
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/coursespuimages")
public class CourseSpuImagesController {
    @Autowired
    private CourseSpuImagesService courseSpuImagesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:coursespuimages:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseSpuImagesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("courses:coursespuimages:info")
    public R info(@PathVariable("id") Long id){
		CourseSpuImagesEntity courseSpuImages = courseSpuImagesService.getById(id);

        return R.ok().put("courseSpuImages", courseSpuImages);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:coursespuimages:save")
    public R save(@RequestBody CourseSpuImagesEntity courseSpuImages){
		courseSpuImagesService.save(courseSpuImages);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:coursespuimages:update")
    public R update(@RequestBody CourseSpuImagesEntity courseSpuImages){
		courseSpuImagesService.updateById(courseSpuImages);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:coursespuimages:delete")
    public R delete(@RequestBody Long[] ids){
		courseSpuImagesService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
