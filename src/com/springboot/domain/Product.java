/**
 * 
 */
package com.springboot.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author patejiga
 *
 */
@XmlRootElement
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5873511131870695961L;
	private String name;
	private String desc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
