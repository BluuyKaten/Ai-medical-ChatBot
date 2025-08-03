package com.wj.aiTest;

import com.wj.aiTest.assistant.MemoryChatAssistant;
import com.wj.aiTest.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(4,"今天几号");
        System.out.println(answer);
    }

    @Autowired
    private MemoryChatAssistant memoryChatAssistant;
    @Test
    public void testSystemMessage2() {
        String answer = memoryChatAssistant.chat("我是环环");
        System.out.println(answer);

        String answer2 = memoryChatAssistant.chat("我18了");
        System.out.println(answer2);

        String answer3 = memoryChatAssistant.chat("我是谁");
        System.out.println(answer3);
    }

    @Test
    public void testV() {
        String answer1 = separateChatAssistant.chat2(10, "我是环环");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat2(10, "我是谁");
        System.out.println(answer2);
    }

    @Test
    public void testuserInfo() {

        String username="翠花";
        int age =18;

        String answer1 = separateChatAssistant.chat3(10, "我是谁,我多大了",username,age);
        System.out.println(answer1);
    }
}