# 硅谷小智（医疗版）🏥

> 基于Spring Boot + Vue.js + LangChain4j的智能医疗助手系统

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.6-green.svg)](https://spring.io/projects/spring-boot)
[![Vue.js](https://img.shields.io/badge/Vue.js-3.5.13-blue.svg)](https://vuejs.org/)
[![LangChain4j](https://img.shields.io/badge/LangChain4j-1.0.0--beta3-orange.svg)](https://github.com/langchain4j/langchain4j)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## 📖 项目简介

硅谷小智是一个专业的智能医疗助手系统，集成了多种AI大模型（阿里云百炼、OpenAI、Ollama），提供医疗咨询、智能分诊、预约挂号等功能的智能客服系统。

### ✨ 主要特性

- 🏥 **医疗专业化** - 专注于医疗场景的智能助手
- 🤖 **多模型支持** - 支持阿里云百炼、OpenAI、Ollama等多种AI模型
- 💬 **流式对话** - 支持实时流式响应，提供更好的用户体验
- 🧠 **记忆功能** - 基于MongoDB的对话记忆存储
- 🔧 **工具集成** - 集成预约挂号、计算器等实用工具
- 📱 **现代化UI** - 基于Element Plus的现代化前端界面

## 🚀 快速开始

### 环境要求

- JDK 17+
- Node.js 16+
- MySQL 8.0+
- MongoDB 6.0+
- Maven 3.6+

### 后端部署

1. **克隆项目**
   ```bash
   git clone https://github.com/CarVak/Ai-medical-ChatBot.git
   cd Ai-medical-ChatBot
   ```

2. **配置环境变量**
   ```bash
   export Qwen_API_KEY=your_api_key_here
   ```

3. **配置数据库**
   - MySQL: 创建数据库 `guiguxiaozhi`
   - MongoDB: 确保服务运行在 `localhost:27017`

4. **启动后端服务**
   ```bash
   mvn spring-boot:run
   ```

### 前端部署

1. **进入前端目录**
   ```bash
   cd xiaozhi-ui
   ```

2. **安装依赖**
   ```bash
   npm install
   ```

3. **启动开发服务器**
   ```bash
   npm run dev
   ```

4. **构建生产版本**
   ```bash
   npm run build
   ```

## 🛠️ 技术栈

### 后端技术
- **框架**: Spring Boot 3.2.6
- **AI框架**: LangChain4j 1.0.0-beta3
- **数据库**: MySQL 8.0 + MongoDB 6.0
- **ORM**: MyBatis Plus
- **API文档**: Knife4j (Swagger)
- **构建工具**: Maven

### 前端技术
- **框架**: Vue 3.5.13
- **UI组件库**: Element Plus 2.8.4
- **构建工具**: Vite 5.4.8
- **HTTP客户端**: Axios 1.7.7

### AI模型支持
- **阿里云百炼平台**: qwen-plus, text-embedding-v4
- **OpenAI兼容模型**: gpt-4o-mini
- **Ollama本地模型**: deepseek-r1:latest

## 📁 项目结构

```
aiTest/
├── src/main/java/com/wj/aiTest/
│   ├── controller/          # 控制器层
│   ├── assistant/           # AI助手接口
│   ├── config/             # 配置类
│   ├── tools/              # 工具类
│   ├── service/            # 服务层
│   ├── entity/             # 实体类
│   ├── mapper/             # 数据访问层
│   ├── store/              # 存储层
│   └── bean/               # 数据传输对象
├── xiaozhi-ui/             # 前端项目
│   ├── src/components/     # Vue组件
│   ├── src/assets/         # 静态资源
│   └── public/             # 公共文件
└── docs/                   # 项目文档
```

## 🔧 核心功能

### 1. 智能对话系统
- 基于LangChain4j的AI服务
- 支持流式响应
- 集成记忆功能
- 多工具集成

### 2. 预约挂号系统
- 智能预约挂号
- 取消预约功能
- 号源查询
- 数据持久化

### 3. 对话记忆系统
- 基于MongoDB的持久化存储
- 支持对话历史记录
- 自动序列化/反序列化

### 4. 向量检索系统
- 基于Pinecone的向量存储
- 语义检索
- 知识库集成

## 📚 API文档

### 聊天接口
- **URL**: `/xiaozhi/chat`
- **方法**: POST
- **请求体**:
  ```json
  {
    "memoryId": 123456,
    "message": "你好"
  }
  ```
- **响应**: 流式文本响应

启动应用后，访问 `http://localhost:8080/doc.html` 查看完整的API文档。

## 🎯 功能演示

### 医疗咨询
```
用户: 我最近头痛，应该挂哪个科室？
小智: 根据您的症状，建议您挂神经内科。头痛可能的原因包括...
```

### 预约挂号
```
用户: 我想预约明天上午神经内科的号
小智: 好的，请提供您的姓名、身份证号等信息...
```

## 🤝 贡献指南

1. Fork 本仓库
2. 创建特性分支 (`git checkout -b feature/AmazingFeature`)
3. 提交更改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送到分支 (`git push origin feature/AmazingFeature`)
5. 开启 Pull Request

## 📄 许可证

本项目采用 MIT 许可证 - 查看 [LICENSE](LICENSE) 文件了解详情。

## 📞 联系我们

- 项目主页: [https://github.com/CarVak/Ai-medical-ChatBot](https://github.com/CarVak/Ai-medical-ChatBot)
- 问题反馈: [Issues](https://github.com/CarVak/Ai-medical-ChatBot/issues)
- 邮箱: 1808660458@qq.com

## 🙏 致谢

- [LangChain4j](https://github.com/langchain4j/langchain4j) - AI应用开发框架
- [Spring Boot](https://spring.io/projects/spring-boot) - Java应用框架
- [Vue.js](https://vuejs.org/) - 渐进式JavaScript框架
- [Element Plus](https://element-plus.org/) - Vue 3 UI组件库

---

⭐ 如果这个项目对您有帮助，请给我们一个星标！ 