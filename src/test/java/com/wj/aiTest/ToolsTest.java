package com.wj.aiTest;

import com.wj.aiTest.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ToolsTest {
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    public void testCalculatorTools() {
        String answer = separateChatAssistant.chat4(2, "1+2等于几，475695037565的平方根是多 少？");
//答案：3，689706.4865
                System.out.println(answer);
        String answer2 = separateChatAssistant.chat4(3, "1+2等于几，475695037565的平方根是多 少？");
//答案：3，689706.4865
        System.out.println(answer2);
    }
}
