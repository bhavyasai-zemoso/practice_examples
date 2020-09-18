package com.examples.java;

public class Gene
{
	public static void main(String args[]){
	       Gene str=new Gene();
	        str.testSimpleGene();
	    }
	
    public String findSimpleGene(String dna)
    {
        String res="";
        int sIdx=dna.indexOf("ATG");
        int eIdx=dna.indexOf("TAA",sIdx+3);
        if(sIdx==-1){
        	if(eIdx==-1)
        		return "no start and end codon";
        	else
        		return "no start codon";
        }
        if(eIdx==-1)
        {
            return "no end codon";
        }
        res=dna.substring(sIdx,eIdx+3);
        
        if(res.length()%3==0)
        {
            return res;
        }
        return "string length not a multiple of 3";
        
    }
    
    public String findSimpleGene(String dna,String startCodon,String stopCodon)
    {
        String result="";
        String dnac=dna.toUpperCase();
        int sIdx=dnac.indexOf(startCodon);
        if(sIdx==-1){
            return "";
        }
        int eIdx=dnac.indexOf(stopCodon,sIdx+3);
        if(eIdx==-1)
        {
            return "";
        }
        result=dnac.substring(sIdx,eIdx+3);
        
        if(result.length()%3==0)
        {
            char ch=dna.charAt(0);
            
            if(Character.isUpperCase(ch))
                return result;
            else
                return result.toLowerCase();
        }
        return "";
        
    }
  
    public void testSimpleGene()
    {
        String dna1="CCCATGTCAAATGTATAACTG";
        String dna2="CCCTCAATATAACTG";
        String dna3="CCCATGTCAAATGTACTG";
        String dna4="CCCTCAATACTG";
        String dna5="CCCATGTCAAATGTAACTG";
        String dna6="CCCATGTCAAATGTATAACTG";
        String dna7="gatgctataat";
        String res=findSimpleGene(dna1);
        System.out.println("The Gene is "+res);
        res=findSimpleGene(dna2);
        System.out.println("The Gene is "+res);
        res=findSimpleGene(dna3);
        System.out.println("The Gene is "+res);
        res=findSimpleGene(dna4);
        System.out.println("The Gene is "+res);
        res=findSimpleGene(dna5);
        System.out.println("The Gene is "+res);
        res=findSimpleGene(dna6,"ATG","TAA");
        System.out.println("The Gene is "+res);
        res=findSimpleGene(dna7,"ATG","TAA");
        System.out.println("The Gene is "+res);
        
    }
    
}

