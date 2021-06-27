package com.van.designpattern.standardpattern.建造者;

import org.apache.commons.lang3.StringUtils;

public class ResourceConfig {
    private String name;
    private int minIdle;
    private int maxIdle;

    private ResourceConfig(Builder builder) {
        this.name = builder.name;
        this.minIdle = builder.minIdle;
        this.maxIdle = builder.maxIdle;
    }

    public static class Builder {
        private static final int DEFAULT_MIN_IDLE = 0;
        private static final int DEFAULT_MAX_IDLE = 8;

        private String name;
        private int minIdle = DEFAULT_MIN_IDLE;
        private int maxIdle = DEFAULT_MAX_IDLE;

        public ResourceConfig build() {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("name can't be blank");
            }
            if (minIdle > maxIdle) {
                throw new IllegalArgumentException("minIdle can't bigger than maxIdle");
            }
            return new ResourceConfig(this);
        }

        public Builder setName(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("name can't be blank");
            }
            this.name = name;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("minIdle can't less than zero");
            }
            this.minIdle = minIdle;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("maxIdle can't less than zero");
            }
            this.maxIdle = maxIdle;
            return this;
        }

    }

    public static void main(String[] args) {
        ResourceConfig van = new Builder().setName("van")
                .setMaxIdle(8)
                .setMinIdle(-1)
                .build();
    }

}
