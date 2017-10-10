/**
 * 
 */
package com.demoapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author darshan
 *
 */

@RestController
public class HomeController {

	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String hello() {
		return "Hello";
	}
}
