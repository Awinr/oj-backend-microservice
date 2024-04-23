package com.shier.ojbackendjudgeservice.judge.codesandbox.impl;


import com.shier.ojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.shier.ojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.shier.ojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.shier.ojbackendmodel.model.codesandbox.JudgeInfo;
import com.shier.ojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.shier.ojbackendmodel.model.enums.QuestionSubmitStatusEnum;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 示例代码沙箱（仅为了跑通业务流程）
 *
 * @author Shier
 */
@Slf4j
public class ExampleCodeSandbox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("示例代码沙箱");
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
