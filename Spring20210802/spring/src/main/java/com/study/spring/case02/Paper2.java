package com.study.spring.case02;

// Red B5
public class Paper2 {
	private Integer id;
	private Color red;
	private Size b5;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Color getRed() {
		return red;
	}

	public void setRed(Color red) {
		this.red = red;
	}

	public Size getB5() {
		return b5;
	}

	public void setB5(Size b5) {
		this.b5 = b5;
	}

	@Override
	public String toString() {
		return "Paper2 [id=" + id + ", red=" + red + ", b5=" + b5 + "]";
	}

}