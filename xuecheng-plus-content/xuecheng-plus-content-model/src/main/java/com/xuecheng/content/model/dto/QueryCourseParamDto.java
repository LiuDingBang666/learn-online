package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * 查询参数
 *
 * @author LDB
 * @version 1.0
 * @date 2023-05-18 22:36
 */
@Data
@ToString
@ApiModel("课程查询参数")
public class QueryCourseParamDto {
    /**
     * 审核状态
     *
     * @author LDB
     * @date 2023-05-18 22:36
     * @version 1.0
     */
    @ApiModelProperty("审核状态")
    private String auditStatus;
    /**
     * 课程名称
     *
     * @author LDB
     * @date 2023-05-18 22:37
     * @version 1.0
     */
    @ApiModelProperty("课程名称")
    private String courseName;
    /**
     * 发布状态
     *
     * @author LDB
     * @date 2023-05-18 22:37
     * @version 1.0
     */
    @ApiModelProperty("发布状态")
    private String publishStatus;
}
