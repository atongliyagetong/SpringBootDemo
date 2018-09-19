package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "hero")
public class HeroProperties {
    private String name;
    private String skin;
    private Integer age;
    private String content;

    public HeroProperties() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "HeroProperties{" +
                "name='" + name + '\'' +
                ", skin='" + skin + '\'' +
                ", age=" + age +
                ", content='" + content + '\'' +
                '}';
    }
}
