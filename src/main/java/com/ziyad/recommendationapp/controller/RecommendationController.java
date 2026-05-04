package com.ziyad.recommendationapp.controller;

import com.ziyad.recommendationapp.dto.RecommendRequest;
import com.ziyad.recommendationapp.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @PostMapping({"/recommend","/api/recommend"})
    public Map<String,Object> recommend(@RequestBody RecommendRequest request){
        return recommendationService.getRecommendation(
                request.getCity(),
                request.getType(),
                request.getCategory()
        );
    } }
