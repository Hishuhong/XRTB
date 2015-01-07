package com.xrtb.exchanges;
import java.io.IOException;
import java.io.InputStream;

import org.codehaus.jackson.JsonProcessingException;

import com.xrtb.pojo.BidRequest;

/**
 * A Bid request for Nexage.
 * @author Ben M. Faul
 *
 */
public class Mobclix extends BidRequest {
	
	/**
	 * Constructs Mobclix bid request from a file containoing JSON
	 * @param in. String - the File name containing the data.
	 */	
	public Mobclix(String  in) throws JsonProcessingException, IOException {
		super(in);

    }
	/**
	 * Constructs Mobclix bid request from JSON stream in jetty.
	 * @param in. InputStream - the JSON data coming from HTTP.m.
	 */
	public Mobclix(InputStream in) throws JsonProcessingException,
			IOException {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Process special mobclix stuff, sets the exchange name.
	 */
	@Override
	public boolean parseSpecial() {
		this.exchange = "mobclix";
		return true;
	}
}
