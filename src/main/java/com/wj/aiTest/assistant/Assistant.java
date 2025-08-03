package com.wj.aiTest.assistant;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

@AiService(wiringMode = AiServiceWiringMode.EXPLICIT
        ,chatModel = "qwenChatModel"
        ,chatMemory = "")
public interface Assistant {

    String chat(String userMessage);
}
