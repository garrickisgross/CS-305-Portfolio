package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hash")
	public String getChecksum() {
		String uniqueData = "Garrick Gross is a little silly";
		
		String checksum = this.generateChecksum(uniqueData);
		
		return "<h1>Unique Data: </h1>"+ uniqueData + "<br>" + 
			   "<h1>Checksum (SHA 256): </h1>" + checksum;
	}
	
	private String generateChecksum(String in) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			
			byte[] hashedBytes = digest.digest(in.getBytes(StandardCharsets.UTF_8));
			
			return this.bytesToHex(hashedBytes);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("Error initializing MessageDigest", e);
		}
		
	}

	private String bytesToHex(byte[] hashedBytes) {
		StringBuilder sb = new StringBuilder();
		
		for(byte b : hashedBytes) {
			sb.append(String.format("%02x", b));
		}
		
		return sb.toString();
	}
}
