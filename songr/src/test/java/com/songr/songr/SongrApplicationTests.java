package com.songr.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testConstructor(){
		Album test = new Album("testing Album","name","count","length of songs","URL for the album image");

		assertEquals("testing Album",test.getTitle());
		test.setTitle("new Title");
		assertEquals("new Title",test.getTitle());

		assertEquals("name",test.getArtist());
		test.setArtist("new Name");
		assertEquals("new Name",test.getArtist());

		assertEquals("count",test.getSongCount());
		test.setSongCount("new Count");
		assertEquals("new Count",test.getSongCount());

		assertEquals("length of songs",test.getLength());
		test.setLength("new length");
		assertEquals("new length",test.getLength());

		assertEquals("URL for the album image",test.getImageUrl());
		test.setImageUrl("new URL");
		assertEquals("new URL",test.getImageUrl());
	}

}
