package com.eric.sell.util;

import com.eric.sell.vo.ResultVO;

import java.util.List;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/20 13:36
 */
public class ResultVOUtil {
    public static ResultVO success(List list){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(list);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
