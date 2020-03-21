package com.weslange.springboot.sylveria.rest;

import com.weslange.springboot.sylveria.SylveriaServerApplication;
import com.weslange.springboot.sylveria.entity.Token;
import com.weslange.springboot.sylveria.service.GamerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping( "/" )
public class TokenRestController {

	private static final Logger logger = LoggerFactory.getLogger( SylveriaServerApplication.class );

	private GamerService gamerService;

	@Autowired
	public TokenRestController( GamerService gamerService ) {
		gamerService = gamerService;
	}

	@PostMapping( "/" )
	public HashMap addEmployee( @RequestBody Token token, HttpServletRequest request ) {

		HashMap<String, String> returnMap = new HashMap();
		returnMap.put( "sylveriaConnectionSuccess", "true" );

		return returnMap;

	}

}










