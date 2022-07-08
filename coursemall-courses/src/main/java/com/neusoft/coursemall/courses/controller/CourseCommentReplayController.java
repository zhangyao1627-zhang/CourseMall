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

import com.neusoft.coursemall.courses.entity.CourseCommentReplayEntity;
import com.neusoft.coursemall.courses.service.CourseCommentReplayService;
import com.neusoft.common.utils.PageUtils;
import com.neusoft.common.utils.R;



/**
 * 课程的评价和评论
 *
 * @author zhangyao
 * @email zhangyao1627@gmail.com
 * @date 2022-07-08 09:38:26
 */
@RestController
@RequestMapping("courses/coursecommentreplay")
public class CourseCommentReplayController {
    @Autowired
    private CourseCommentReplayService courseCommentReplayService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("courses:coursecommentreplay:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = courseCommentReplayService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
 //   @RequiresPermissions("courses:coursecommentreplay:info")
    public R info(@PathVariable("id") Long id){
		CourseCommentReplayEntity courseCommentReplay = courseCommentReplayService.getById(id);

        return R.ok().put("courseCommentReplay", courseCommentReplay);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("courses:coursecommentreplay:save")
    public R save(@RequestBody CourseCommentReplayEntity courseCommentReplay){
		courseCommentReplayService.save(courseCommentReplay);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
  //  @RequiresPermissions("courses:coursecommentreplay:update")
    public R update(@RequestBody CourseCommentReplayEntity courseCommentReplay){
		courseCommentReplayService.updateById(courseCommentReplay);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
  //  @RequiresPermissions("courses:coursecommentreplay:delete")
    public R delete(@RequestBody Long[] ids){
		courseCommentReplayService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
