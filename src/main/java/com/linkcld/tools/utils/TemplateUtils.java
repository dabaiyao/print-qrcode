package com.linkcld.tools.utils;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by wumh on 2017/3/16.
 * 模板帮助类，主要用于解析消息模板
 */
@Slf4j
public class TemplateUtils {

    private static final String FREEMARKER_TEMPLATE_VERSION = "2.3.21";
    private static final String ENCODING_UTF_8 = "UTF-8";

    private static final Configuration CFG = new Configuration(new Version(FREEMARKER_TEMPLATE_VERSION));

    /**
     * @param templateStr 格式：${name}:您好，您的快递就在今天${time}送到你的手上！ 支持多级的格式如${user.password}
     * @param obj         对象，可接受map，domain等，采用freemarker模板引擎进行解析
     * @return 解析完成的字符串
     * @throws Exception
     */
    public static String formatTemplate(String templateStr, Object obj) throws IOException, TemplateException {
        try {
            final String templateKey = "A";
            StringTemplateLoader stl = new StringTemplateLoader();
            stl.putTemplate(templateKey, templateStr);
            StringWriter writer = new StringWriter();
            synchronized (CFG) {
                CFG.setTemplateLoader(stl);
                CFG.setDefaultEncoding(ENCODING_UTF_8);
                Template template = CFG.getTemplate(templateKey);
                template.process(obj, writer);
                return writer.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("formatTemplate error,", e);
            throw e;
        }
    }

}
