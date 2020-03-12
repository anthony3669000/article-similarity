package com.paic.articlesimilarity.controller;

import com.paic.articlesimilarity.bean.SimilarityDTO;
import info.debatty.java.stringsimilarity.Cosine;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户管理相关接口")
public class ActiclesSimilarityController {
    @ApiOperation("添加用户的接口")
    @PostMapping("/similarity")
    public double similarity(SimilarityDTO similarityDTO){
        Cosine cosine = new Cosine();
        double similarity = cosine.similarity(similarityDTO.getFirst(), similarityDTO.getSecond());
        return similarity;
    }
}
