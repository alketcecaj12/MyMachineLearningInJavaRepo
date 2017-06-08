package mywekaalgs;
import java.io.BufferedReader;
import java.io.FileReader;

import weka.associations.Apriori;
import weka.core.FastVector;
import weka.core.Instances;

public class AssociationRules{

	public static void main(String args[]) throws Exception{
		
		//load data
		Instances data = new Instances(new BufferedReader(new FileReader("dataset/bank-data.arff")));
		
		//build model
		Apriori model = new Apriori();
		model.buildAssociations(data); 
		FastVector [] fv = model.getAllTheRules();
		System.out.println("length = "+fv.length);
		System.out.println(model);
		
	}

}
