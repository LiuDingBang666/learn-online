package com.xuecheng.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果
 *
 * @author LDB
 * @version 1.0
 * @date 2023-05-18 22:31
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("分页结果")
public class PageResult<T> implements Serializable {
    /**
     * 数据项
     *
     * @author LDB
     * @date 2023-05-18 22:39
     * @version 1.0
     */
    @ApiModelProperty("数据项")
    private List<T> items;
    /**
     * 总数
     *
     * @author LDB
     * @date 2023-05-18 22:39
     * @version 1.0
     */
    @ApiModelProperty("总数")
    private Long counts;
    /**
     * 页码
     *
     * @author LDB
     * @date 2023-05-18 22:39
     * @version 1.0
     */
    @ApiModelProperty("页码")
    private Long page;
    /**
     * 每页大小
     *
     * @author LDB
     * @date 2023-05-18 22:39
     * @version 1.0
     */
    @ApiModelProperty("每页大小")
    private Long pageSize;
}
