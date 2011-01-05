package com.siriusit.worskshop.batch;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;

import com.siriusit.worskshop.batch.domain.Ansatt;


/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 */
public class SimpleItemWriter implements ItemWriter<Object> {

	private static final Log log = LogFactory.getLog(SimpleItemWriter.class);
	
	/**
	 * @see ItemWriter#write(Object)
	 */
	public void write(List<? extends Object> data) throws Exception {
		Ansatt ansatt = (Ansatt) data.get(0);
		if (ansatt.getFnr().equalsIgnoreCase("01018001011")) throw new Exception("feil fnr");
		System.out.println("\n\n\n" + data.size());
		
		
	}

}
