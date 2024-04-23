package com.shier.ojbackendjudgeservice.judge.strategy;


import com.shier.ojbackendmodel.model.codesandbox.JudgeInfo;

/**
 * 判题策略
 * @author Shier
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}