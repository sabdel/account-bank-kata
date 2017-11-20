package com.bank;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/bank/spec/features/create_account.feature")
public class CucumberIntegrationTest {

}
