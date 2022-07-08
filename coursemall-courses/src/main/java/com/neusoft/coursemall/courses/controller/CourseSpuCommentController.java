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

import com.neusoft.coursemall.courses.entity.CourseSpuCommentEntity;
import com.neusoft.coursemall.courses.service.CourseSpuCommentService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 课程评价
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/coursespucomment")
public class CourseSpuCommentController {
    @Autowired
    private CourseSpuCommentService courseSpuCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:coursespucomment:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseSpuCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("courses:coursespucomment:info")
    public R info(@PathVariable("id") Long id){
		CourseSpuCommentEntity courseSpuComment = courseSpuCommentService.getById(id);

        return R.ok().put("courseSpuComment", courseSpuComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:coursespucomment:save")
    public R save(@RequestBody CourseSpuCommentEntity courseSpuComment){
		courseSpuCommentService.save(courseSpuComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:coursespucomment:update")
    public R update(@RequestBody CourseSpuCommentEntity courseSpuComment){
		courseSpuCommentService.updateById(courseSpuComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:coursespucomment:delete")
    public R delete(@RequestBody Long[] ids){
		courseSpuCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
