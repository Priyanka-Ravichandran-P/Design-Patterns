package com.lld.designpatterns.concepts.decorative.icecreams;

import com.lld.designpatterns.concepts.decorative.icecreams.cones.ChocolateCone;
import com.lld.designpatterns.concepts.decorative.icecreams.cones.VennilaCone;
import com.lld.designpatterns.concepts.decorative.icecreams.scoops.MangoScoop;
import com.lld.designpatterns.concepts.decorative.icecreams.scoops.StrawberryScoop;
import com.lld.designpatterns.concepts.decorative.icecreams.syrups.BlueberrySyrup;
import com.lld.designpatterns.concepts.decorative.icecreams.syrups.ChocolateSyrup;

public class Client {
	public static void main(String[] args) {
		Icecream ice = new ChocolateSyrup(
				new MangoScoop(
						new StrawberryScoop(
								new ChocolateCone(
										new BlueberrySyrup(
												new VennilaCone())))));
		try {
			System.out.println("Cost of icecream :" + ice.getCost());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Description of icecream :" + ice.getDescription());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
