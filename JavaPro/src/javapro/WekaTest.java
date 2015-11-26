/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapro;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.clusterers.ClusterEvaluation;
import weka.clusterers.SimpleKMeans;
import weka.core.Instances;
import weka.core.converters.CSVLoader;

/**
 *
 * @author Shuang
 */
public class WekaTest {

    public static Instances createInstances(File file) {
        Instances dataSet = null;
        try {
            CSVLoader loader = new CSVLoader();
            loader.setSource(file);
            dataSet = loader.getDataSet();
        } catch (Exception ex) {
            Logger.getLogger(WekaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataSet;
    }
  
    public static void classify() {
        try {
            NaiveBayes nB = new NaiveBayes();
            Instances ins = createInstances(new File("temp10.csv"));
            ins.setClassIndex(0);
            nB.buildClassifier(ins);
            //evaluation
            Evaluation eval = new Evaluation(ins);
            eval.crossValidateModel(nB, ins, 10, new Random(1));
            System.out.println(eval.toClassDetailsString());
        } catch (Exception ex) {
            Logger.getLogger(WekaTest.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public static void cluster(String str) {
        try {
            Instances data = createInstances(new File("temp11.csv"));
            if (str.equals("salary")) 
                data.deleteAttributeAt(1);
            else if (str.equals("GPA"))
                data.deleteAttributeAt(0);
            else {
                System.out.println("cannot cluster");
                System.exit(0);
            }
            
            SimpleKMeans model = new SimpleKMeans();//simpe em
            model.setNumClusters(2);//number of clusters
            model.buildClusterer(data);
            System.out.println(model);

            //evaluation
            ClusterEvaluation clsEval = new ClusterEvaluation();
            clsEval.setClusterer(model);
            clsEval.evaluateClusterer(data);
            System.out.println(clsEval.getNumClusters());
        } catch (IOException ex) {
            Logger.getLogger(WekaTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(WekaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
     

    
    public static void main(String[] args) throws Exception {
        createCSV.createCSVFile();
        classify();
        cluster("salary");
        cluster("GPA");
    }
    
}
