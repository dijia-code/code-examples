package me.dj.test.codegen;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.util.Collections;

public class SysModuleCodeGenerator {

    public static void main(String[] args) {

        String finalProjectPath = "D:\\IdeaProjects\\code-examples\\mybatisplus-demo\\codegen";

        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/mybatis_test?characterEncoding=utf-8", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("tdj") // 设置作者
                            .fileOverride()
                            .disableOpenDir()
                            .outputDir(finalProjectPath + "/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("me.dj.models") // 设置父包名
                            .moduleName("sys") // 设置父包模块名
                            .entity("model.entity")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, finalProjectPath + "/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("sys_dept", "sys_role", "sys_roles_depts", "sys_user", "sys_users_roles")
                            .addTablePrefix("sys_");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
