package com.wj.aiTest;



import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.community.model.dashscope.WanxImageModel;
import dev.langchain4j.data.image.Image;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.data.message.CustomMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.chat.request.ChatRequest;
import dev.langchain4j.model.chat.request.ResponseFormat;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.output.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import static dev.langchain4j.model.chat.request.ResponseFormat.JSON;

@SpringBootTest
public class LLMTest {

    @Test
    public void testGPTDemo(){
        // ChatLanguageModel qwenModel = QwenChatModel.builder()
        //         .apiKey("sk-387230ce7d7749658897715ce3121baf")
        //         .modelName("qwen-max")
        //         .build();

        // ChatLanguageModel model  = OllamaChatModel.builder()
        //         .baseUrl("http://localhost:11434")
        //         .modelName("deepseek-r1:latest")
        //         .responseFormat(JSON)
        //         .temperature(0.8)
        //         .timeout(Duration.ofSeconds(60))
        //         .build();

        // String answer = model.chat("你是谁");
        // System.out.println(answer);

//        ChatLanguageModel model = OllamaChatModel.builder()
//                .baseUrl("http://localhost:11434")
//                .modelName("deepseek-r1:latest")
//                .responseFormat(JSON)
//                .build();
//
//        String json = model.chat("你是谁");
//        System.out.println(json);
//    }

//     {
//         2
//           "result": true,
//           "msg": "success",   
//           "data": {
//             "name": "DeepSeek-R1",
//             "avatar": "https://example.com/avatar.png",   
//               "system_message": "You are an AI assistant owned by DeepSeek. You will be provided with a system message and you must act according to it.\n\nAlways ensure that the person using you has a great experience, regardless of their requests.\n\nBe friendly, avoid being verbose, and do your best to provide accurate information.\n\nDo not pretend to have any abilities or knowledge you don't actually possess.\n\nFollow all instructions provided by the user.",
//               "model": "DeepSeek-R1",
//               "description": "I am an AI assistant created by DeepSeek. I can help answer questions, assist with tasks, and provide information on various topics."
//           }
//         }

    }
//    @Autowired
//    private OpenAiChatModel openAiChatModel;
//
//    @Test
//    public void testSpringboot(){
//        String answer = openAiChatModel.chat("你是谁");
//        System.out.println(answer);
//    }


    // @Autowired
    // private OllamaChatModel model2;

    // @Test
    // public void testSpringboot(){
    //      String answer = model2.chat("你是谁");
    //      System.out.println(answer);
    // }

    /**
    * 通义千问大模型
    */
    @Autowired
    private ChatLanguageModel  qwenChatModel;
    @Test
    public void testDashScopeQwen() {
    //向模型提问
    String answer = qwenChatModel.chat("你好");
    //输出结果
    System.out.println(answer);
    }

    @Test
    public void testDashScopeWanx(){
        WanxImageModel wanxImageModel = WanxImageModel.builder()
                .modelName("wan2.2-t2i-plus")
                .apiKey(System.getenv("Qwen_API_KEY"))
                .build();
        Response<Image> response = wanxImageModel.generate("奇幻森林精灵：在一片弥漫着轻柔薄雾的古老森林深处，阳光透过茂密枝叶洒下金色光斑。一位身材娇小、长着透明薄翼的精灵少女站在一朵硕大的蘑菇上。她有着海藻般的绿色长发，发间点缀着蓝色的小花，皮肤泛着珍珠般的微光。身上穿着由翠绿树叶和白色藤蔓编织而成的连衣裙，手中捧着一颗散发着柔和光芒的水晶球，周围环绕着五彩斑斓的蝴蝶，脚下是铺满苔藓的地面，蘑菇和蕨类植物丛生，营造出神秘而梦幻的氛围。");
                System.out.println(response.content().url());
    }
}
