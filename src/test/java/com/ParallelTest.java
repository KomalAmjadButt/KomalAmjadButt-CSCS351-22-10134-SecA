package com;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.network.Network;
import org.testng.annotations.Test;

import java.util.Optional;

public class ParallelTest extends BaseDriver {


    @Test
    public void searchTest() {
        devTools.createSession();
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        devTools.addListener(Network.requestWillBeSent(), entry -> {
            System.out.println("Request URL is: " + entry.getRequest().getUrl());
            System.out.println("Request Type is: " + entry.getRequest().getMethod());
        });
        driver.get(baseUrl);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("sqa engineer");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
        driver.findElement(By.linkText("Wikipedia")).click();
    }
}
