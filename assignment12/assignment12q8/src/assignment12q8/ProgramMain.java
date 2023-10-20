package assignment12q8;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProgramMain {

	public static void main(String[] args) {
		
		IntStream strm=IntStream.range(1, 10); //1,2,3,4,5,6,7,8,9
		int total=strm.sum();
		System.out.println(total);
		
		IntStream strm2=IntStream.range(1, 10); //1,2,3,4,5,6,7,8,9
		IntSummaryStatistics result=strm2.summaryStatistics();
		System.out.println(result);
		
	}

}
