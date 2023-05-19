package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamDto;
import com.xuecheng.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程信息接口
 *
 * @author LDB
 * @version 1.0
 * @date 2023-05-18 22:42
 */
@Api("课程信息接口")
@RestController
public class CourseBaseInfoController {
    @ApiOperation("分页查询课程信息")
    @PostMapping("/course/list")

    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamDto queryCourseParams) {

        return null;

    }

}
