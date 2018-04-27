package com.wozu.workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.wozu.workshop.math.Squared;
import com.wozu.workshop.math.StringToIntConverter;

public class App {

	public static void main(String[] args) throws IOException {
		String entered = "";
		while (!entered.toLowerCase().equals("exit")) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("How many iterations to calculate Square? (Type 'Exit' to cancel)");

			entered = br.readLine();
			System.out.println("Entered: " + entered);

			int iterations = new StringToIntConverter(entered).Success() ? new StringToIntConverter(entered).Result()
					: 0;

			String resultOutput = "";
			for (int i = 1; i <= iterations; i++) {
				int squared = new Squared(i).Result();
				resultOutput += String.valueOf(squared) + (i == iterations ? "" : ", ");
			}
			System.out.println(String.valueOf(resultOutput));
		}

	}

}
