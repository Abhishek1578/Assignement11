package minmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMAxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> minmax=Arrays.asList(20,27,30,33,37,40,44,48,50,55,60,66,71,73,79,81,83,85,86,90);
		Optional<Integer> minvalues=minmax.stream()
		.min(Comparator.comparing(Integer::intValue));
		if(minvalues.isPresent())
		{
			System.out.println("minvalue is "+minvalues);
		}
		Optional<Integer> maxvalues=minmax.stream()
				.max(Comparator.comparing(Integer::intValue));
		if(maxvalues.isPresent())
		{
			System.out.println("max values is "+maxvalues);
		}

	}

}
