package com.george.dev.sftpetclinic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by George on 21/11/2018
 */


@Configuration
@ComponentScan(basePackages = {"com.george.dev.data",
                                "com.george.dev.sftpetclinic"})
public class Config {
}
