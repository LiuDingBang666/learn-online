package com.xuecheng.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 分页参数
 *
 * @author LDB
 * @version 1.0
 * @date 2023-05-18 22:31
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("分页参数")
public class PageParams {
    /**
     * 页码
     *
     * @author LDB
     * @date 2023-05-18 22:32
     * @version 1.0
     */
    @ApiModelProperty("页码")
    private Long pageNo = 1L;
    /**
     * 页数
     *
     * @author LDB
     * @date 2023-05-18 22:33
     * @version 1.0
     */
    @ApiModelProperty("页数")
    private Long pageSize = 10L;
}
