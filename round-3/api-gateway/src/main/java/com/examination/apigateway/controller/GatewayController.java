package com.examination.apigateway.controller;
import org.springframework.web.bind.annotation.*; import java.util.Map;
@RestController public class GatewayController { @GetMapping("/") public Map<String,String> home(){return Map.of("service","api-gateway","message","Route requests to examination services");} }
