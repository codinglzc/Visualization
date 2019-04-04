package com.cgcl.common.componet;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/**
 * <p>
 * 解决Jackson 差8小时的问题
 * </p>
 *
 * @author Liu Cong
 * @since Created in 2019/3/29
 */
@Component
public class JacksonObjectMapper extends ObjectMapper {

    private static final long serialVersionUID = 1321869929186048657L;

    private static final Locale CHINA = Locale.CHINA;

    public JacksonObjectMapper() {
        this.setLocale(CHINA);
        this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", CHINA));
        this.setTimeZone(TimeZone.getTimeZone("GMT+8"));
    }
}
