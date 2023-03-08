// ##########################################################################
// ##             M. Necki script to create sample sheets                  ##
// ########################################################################## 

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import com.opencsv.CSVWriter;



public class prepare_ss_files{
    
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) throws InterruptedException{

        Map<String, String> Nextera_Indexes_i7 = new HashMap<>();
        
        Nextera_Indexes_i7.put("N701","TAAGGCGA");
        Nextera_Indexes_i7.put("N702","CGTACTAG");
        Nextera_Indexes_i7.put("N703","AGGCAGAA");
        Nextera_Indexes_i7.put("N704","TCCTGAGC");
        Nextera_Indexes_i7.put("N705","GGACTCCT");
        Nextera_Indexes_i7.put("N706","TAGGCATG");
        Nextera_Indexes_i7.put("N707","CTCTCTAC");
        Nextera_Indexes_i7.put("N708","CAGAGAGG");
        Nextera_Indexes_i7.put("N709","GCTACGCT");
        Nextera_Indexes_i7.put("N710","CGAGGCTG");
        Nextera_Indexes_i7.put("N711","AAGAGGCA");
        Nextera_Indexes_i7.put("N712","GTAGAGGA");
        Nextera_Indexes_i7.put("N714","GCTCATGA");
        Nextera_Indexes_i7.put("N715","ATCTCAGG");
        Nextera_Indexes_i7.put("N716","ACTCGCTA");
        Nextera_Indexes_i7.put("N718","GGAGCTAC");
        Nextera_Indexes_i7.put("N719","GCGTAGTA");
        Nextera_Indexes_i7.put("N720","CGGAGCCT");
        Nextera_Indexes_i7.put("N721","TACGCTGC");
        Nextera_Indexes_i7.put("N722","ATGCGCAG");
        Nextera_Indexes_i7.put("N723","TAGCGCTC");
        Nextera_Indexes_i7.put("N724","ACTGAGCG");
        Nextera_Indexes_i7.put("N726","CCTAAGAC");
        Nextera_Indexes_i7.put("N727","CGATCAGT");
        Nextera_Indexes_i7.put("N728","TGCAGCTA");
        Nextera_Indexes_i7.put("N729","TCGACGTC");


        Map<String, String> Nextera_Indexes_i5_G1 = new HashMap<>();

        Nextera_Indexes_i5_G1.put("S501","TAGATCGC");
        Nextera_Indexes_i5_G1.put("S502","CTCTCTAT");
        Nextera_Indexes_i5_G1.put("S503","TATCCTCT");
        Nextera_Indexes_i5_G1.put("S504","AGAGTAGA");
        Nextera_Indexes_i5_G1.put("S505","GTAAGGAG");
        Nextera_Indexes_i5_G1.put("S506","ACTGCATA");
        Nextera_Indexes_i5_G1.put("S507","AAGGAGTA");
        Nextera_Indexes_i5_G1.put("S508","CTAAGCCT");
        Nextera_Indexes_i5_G1.put("S510","CGTCTAAT");
        Nextera_Indexes_i5_G1.put("S511","TCTCTCCG");
        Nextera_Indexes_i5_G1.put("S513","TCGACTAG");
        Nextera_Indexes_i5_G1.put("S515","TTCTAGCT");
        Nextera_Indexes_i5_G1.put("S516","CCTAGAGT");
        Nextera_Indexes_i5_G1.put("S517","GCGTAAGA");
        Nextera_Indexes_i5_G1.put("S518","CTATTAAG");
        Nextera_Indexes_i5_G1.put("S520","AAGGCTAT");
        Nextera_Indexes_i5_G1.put("S521","GAGCCTTA");
        Nextera_Indexes_i5_G1.put("S522","TTATGCGA");


        Map<String, String> Nextera_Indexes_i5_G2 = new HashMap<>();

        Nextera_Indexes_i5_G2.put("S501","GCGATCTA");
        Nextera_Indexes_i5_G2.put("S502","ATAGAGAG");
        Nextera_Indexes_i5_G2.put("S503","AGAGGATA");
        Nextera_Indexes_i5_G2.put("S504","TCTACTCT");
        Nextera_Indexes_i5_G2.put("S505","CTCCTTAC");
        Nextera_Indexes_i5_G2.put("S506","TATGCAGT");
        Nextera_Indexes_i5_G2.put("S507","TACTCCTT");
        Nextera_Indexes_i5_G2.put("S508","AGGCTTAG");
        Nextera_Indexes_i5_G2.put("S510","ATTAGACG");
        Nextera_Indexes_i5_G2.put("S511","CGGAGAGA");
        Nextera_Indexes_i5_G2.put("S513","CTAGTCGA");
        Nextera_Indexes_i5_G2.put("S515","AGCTAGAA");
        Nextera_Indexes_i5_G2.put("S516","ACTCTAGG");
        Nextera_Indexes_i5_G2.put("S517","TCTTACGC");
        Nextera_Indexes_i5_G2.put("S518","CTTAATAG");
        Nextera_Indexes_i5_G2.put("S520","ATAGCCTT");
        Nextera_Indexes_i5_G2.put("S521","TAAGGCTC");
        Nextera_Indexes_i5_G2.put("S522","TCGCATAA");



        Map<String, String> TruSeq_DNA_Indexes_i7 = new HashMap<>();
        
        TruSeq_DNA_Indexes_i7.put("D701","ATTACTCG");
        TruSeq_DNA_Indexes_i7.put("D702","TCCGGAGA");
        TruSeq_DNA_Indexes_i7.put("D703","CGCTCATT");
        TruSeq_DNA_Indexes_i7.put("D704","GAGATTCC");
        TruSeq_DNA_Indexes_i7.put("D705","ATTCAGAA");
        TruSeq_DNA_Indexes_i7.put("D706","GAATTCGT");
        TruSeq_DNA_Indexes_i7.put("D707","CTGAAGCT");
        TruSeq_DNA_Indexes_i7.put("D708","TAATGCGC");
        TruSeq_DNA_Indexes_i7.put("D709","CGGCTATG");
        TruSeq_DNA_Indexes_i7.put("D710","TCCGCGAA");
        TruSeq_DNA_Indexes_i7.put("D711","TCTCGCGC");
        TruSeq_DNA_Indexes_i7.put("D712","AGCGATAG");
        

        Map<String, String> TruSeq_DNA_Indexes_i5_G1 = new HashMap<>();

        TruSeq_DNA_Indexes_i5_G1.put("D501","TATAGCCT");
        TruSeq_DNA_Indexes_i5_G1.put("D502","ATAGAGGC");
        TruSeq_DNA_Indexes_i5_G1.put("D503","CCTATCCT");
        TruSeq_DNA_Indexes_i5_G1.put("D504","GGCTCTGA");
        TruSeq_DNA_Indexes_i5_G1.put("D505","AGGCGAAG");
        TruSeq_DNA_Indexes_i5_G1.put("D506","TAATCTTA");
        TruSeq_DNA_Indexes_i5_G1.put("D507","CAGGACGT");
        TruSeq_DNA_Indexes_i5_G1.put("D508","GTACTGAC");

        Map<String, String> TruSeq_DNA_Indexes_i5_G2 = new HashMap<>();

        TruSeq_DNA_Indexes_i5_G2.put("D501","AGGCTATA");
        TruSeq_DNA_Indexes_i5_G2.put("D502","GCCTCTAT");
        TruSeq_DNA_Indexes_i5_G2.put("D503","AGGATAGG");
        TruSeq_DNA_Indexes_i5_G2.put("D504","TCAGAGCC");
        TruSeq_DNA_Indexes_i5_G2.put("D505","CTTCGCCT");
        TruSeq_DNA_Indexes_i5_G2.put("D506","TAAGATTA");
        TruSeq_DNA_Indexes_i5_G2.put("D507","ACGTCCTG");
        TruSeq_DNA_Indexes_i5_G2.put("D508","GTCAGTAC");


        Map<String, String> AmpliSeq_DNA_Indexes_i7 = new HashMap<>();

        AmpliSeq_DNA_Indexes_i7.put("Q7005","GTGAATAT");
        AmpliSeq_DNA_Indexes_i7.put("Q7006","ACAGGCGC");
        AmpliSeq_DNA_Indexes_i7.put("Q7007","CATAGAGT");
        AmpliSeq_DNA_Indexes_i7.put("Q7008","TGCGAGAC");
        AmpliSeq_DNA_Indexes_i7.put("Q7015","TCTCTACT");
        AmpliSeq_DNA_Indexes_i7.put("Q7016","CTCTCGTC");
        AmpliSeq_DNA_Indexes_i7.put("Q7017","CCAAGTCT");
        AmpliSeq_DNA_Indexes_i7.put("Q7018","TTGGACTC");
        AmpliSeq_DNA_Indexes_i7.put("Q7023","GCAGAATT");
        AmpliSeq_DNA_Indexes_i7.put("Q7024","ATGAGGCC");
        AmpliSeq_DNA_Indexes_i7.put("Q7025","ACTAAGAT");
        AmpliSeq_DNA_Indexes_i7.put("Q7026","GTCGGAGC");
        AmpliSeq_DNA_Indexes_i7.put("Q7027","AGCCTCAT");
        AmpliSeq_DNA_Indexes_i7.put("Q7028","GATTCTGC");
        AmpliSeq_DNA_Indexes_i7.put("Q7029","TCGTAGTG");
        AmpliSeq_DNA_Indexes_i7.put("Q7030","CTACGACA");
        AmpliSeq_DNA_Indexes_i7.put("Q7035","ATGGCATG");
        AmpliSeq_DNA_Indexes_i7.put("Q7036","GCAATGCA");
        AmpliSeq_DNA_Indexes_i7.put("Q7039","CTTATCGG");
        AmpliSeq_DNA_Indexes_i7.put("Q7040","TCCGCTAA");
        AmpliSeq_DNA_Indexes_i7.put("Q7041","GATCTATC");
        AmpliSeq_DNA_Indexes_i7.put("Q7042","AGCTCGCT");
        AmpliSeq_DNA_Indexes_i7.put("Q7047","ACACTAAG");
        AmpliSeq_DNA_Indexes_i7.put("Q7048","GTGTCGGA");

        
        Map<String, String> AmpliSeq_DNA_Indexes_i5_G1 = new HashMap<>();

        AmpliSeq_DNA_Indexes_i5_G1.put("Q5001","AGCGCTAG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5002","GATATCGA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5003","CGCAGACG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5004","TATGAGTA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5007","ACATAGCG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5008","GTGCGATA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5009","CCAACAGA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5010","TTGGTGAG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5013","AACCGCGG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5014","GGTTATAA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5017","CTAGCTTG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5018","TCGATCCA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5025","ATACCAAG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5026","GCGTTGGA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5027","CTTCACGG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5028","TCCTGTAA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5029","CCTCGGTA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5030","TTCTAACG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5031","CGCTCGTG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5032","TATCTACA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5035","CATTGTTG");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5036","TGCCACCA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5039","ACGCCGCA");
        AmpliSeq_DNA_Indexes_i5_G1.put("Q5040","GTATTATG");



        Map<String, String> AmpliSeq_DNA_Indexes_i5_G2 = new HashMap<>();

        AmpliSeq_DNA_Indexes_i5_G2.put("Q5001","CTAGCGCT");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5002","TCGATATC");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5003","CGTCTGCG");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5004","TACTCATA");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5007","CGCTATGT");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5008","TATCGCAC");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5009","TCTGTTGG");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5010","CTCACCAA");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5013","CCGCGGTT");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5014","TTATAACC");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5017","CAAGCTAG");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5018","TGGATCGA");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5025","CTTGGTAT");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5026","TCCAACGC");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5027","CCGTGAAG");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5028","TTACAGGA");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5029","TACCGAGG");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5030","CGTTAGAA");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5031","CACGAGCG");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5032","TGTAGATA");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5035","CAACAATG");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5036","TGGTGGCA");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5039","TGCGGCGT");
        AmpliSeq_DNA_Indexes_i5_G2.put("Q5040","CATAATAC");


        Map<String, String> Agilent_SureSelect_i7 = new HashMap<>();

        Agilent_SureSelect_i7.put("1_A01", "CAAGGTGA");
        Agilent_SureSelect_i7.put("2_B01", "TAGACCAA");
        Agilent_SureSelect_i7.put("3_C01", "AGTCGCGA");
        Agilent_SureSelect_i7.put("4_D01", "CGGTAGAG");
        Agilent_SureSelect_i7.put("5_E01", "TCAGCATC");
        Agilent_SureSelect_i7.put("6_F01", "AGAAGCAA");
        Agilent_SureSelect_i7.put("7_G01", "GCAGGTTC");
        Agilent_SureSelect_i7.put("8_H01", "AAGTGTCT");
        Agilent_SureSelect_i7.put("9_A02", "CTACCGAA");
        Agilent_SureSelect_i7.put("10_B02", "TAGAGCTC");
        Agilent_SureSelect_i7.put("11_C02", "ATGTCAAG");
        Agilent_SureSelect_i7.put("12_D02", "GCATCATA");
        Agilent_SureSelect_i7.put("13_E02", "GACTTGAC");
        Agilent_SureSelect_i7.put("14_F02", "CTACAATG");
        Agilent_SureSelect_i7.put("15_G02", "TCTCAGCA");
        Agilent_SureSelect_i7.put("16_H02", "AGACACAC");
        Agilent_SureSelect_i7.put("17_A03", "CAGGTCTG");
        Agilent_SureSelect_i7.put("18_B03", "AATACGCG");
        Agilent_SureSelect_i7.put("19_C03", "GCACACAT");
        Agilent_SureSelect_i7.put("20_D03", "CTTGCATA");
        Agilent_SureSelect_i7.put("21_E03", "ATCCTCTT");
        Agilent_SureSelect_i7.put("22_F03", "GCACCTAA");
        Agilent_SureSelect_i7.put("23_G03", "TGCTGCTC");
        Agilent_SureSelect_i7.put("24_H03", "TGGCACCA");
        Agilent_SureSelect_i7.put("25_A04", "AGATGGAT");
        Agilent_SureSelect_i7.put("26_B04", "GAATTGTG");
        Agilent_SureSelect_i7.put("27_C04", "GAGCACTG");
        Agilent_SureSelect_i7.put("28_D04", "GTTGCGGA");
        Agilent_SureSelect_i7.put("29_E04", "AATGGAAC");
        Agilent_SureSelect_i7.put("30_F04", "TCAGAGGT");
        Agilent_SureSelect_i7.put("31_G04", "GCAACAAT");
        Agilent_SureSelect_i7.put("32_H04", "GTCGATCG");
        Agilent_SureSelect_i7.put("33_A05", "ATGGTAGC");
        Agilent_SureSelect_i7.put("34_B05", "CGCCAATT");
        Agilent_SureSelect_i7.put("35_C05", "GACAATTG");
        Agilent_SureSelect_i7.put("36_D05", "ATATTCCG");
        Agilent_SureSelect_i7.put("37_E05", "TCTACCTC");
        Agilent_SureSelect_i7.put("38_F05", "TCGTCGTG");
        Agilent_SureSelect_i7.put("39_G05", "ATGAGAAC");
        Agilent_SureSelect_i7.put("40_H05", "GTCCTATA");
        Agilent_SureSelect_i7.put("41_A06", "AATGACCA");
        Agilent_SureSelect_i7.put("42_B06", "CAGACGCT");
        Agilent_SureSelect_i7.put("43_C06", "TCGAACTG");
        Agilent_SureSelect_i7.put("44_D06", "CGCTTCCA");
        Agilent_SureSelect_i7.put("45_E06", "TATTCCTG");
        Agilent_SureSelect_i7.put("46_F06", "CAAGTTAC");
        Agilent_SureSelect_i7.put("47_G06", "CAGAGCAG");
        Agilent_SureSelect_i7.put("48_H06", "CGCGCAAT");
        Agilent_SureSelect_i7.put("49_A07", "TGAGGAGT");
        Agilent_SureSelect_i7.put("50_B07", "ATGACGAA");
        Agilent_SureSelect_i7.put("51_C07", "TACGGCGA");
        Agilent_SureSelect_i7.put("52_D07", "AGCGAGTT");
        Agilent_SureSelect_i7.put("53_E07", "TGTATCAC");
        Agilent_SureSelect_i7.put("54_F07", "GATCGCCT");
        Agilent_SureSelect_i7.put("55_G07", "GACTCAAT");
        Agilent_SureSelect_i7.put("56_H07", "CAGCTTGC");
        Agilent_SureSelect_i7.put("57_A08", "AGCTGAAG");
        Agilent_SureSelect_i7.put("58_B08", "AGCTGAAG");
        Agilent_SureSelect_i7.put("59_C08", "TATGCCGC");
        Agilent_SureSelect_i7.put("60_D08", "TCAGCTCA");
        Agilent_SureSelect_i7.put("61_E08", "AACTGCAA");
        Agilent_SureSelect_i7.put("62_F08", "ATTAGGAG");
        Agilent_SureSelect_i7.put("63_G08", "CAGCAATA");
        Agilent_SureSelect_i7.put("64_H08", "GCCAAGCT");
        Agilent_SureSelect_i7.put("65_A09", "GCCAAGCT");
        Agilent_SureSelect_i7.put("66_B09", "GTGCAACG");
        Agilent_SureSelect_i7.put("67_C09", "AGTAACGC");
        Agilent_SureSelect_i7.put("68_D09", "CATAGCCA");
        Agilent_SureSelect_i7.put("69_E09", "CATAGCCA");
        Agilent_SureSelect_i7.put("70_F09", "TTAGTGCG");
        Agilent_SureSelect_i7.put("71_G09", "TCGATACA");
        Agilent_SureSelect_i7.put("72_H09", "ATAGTGAC");
        Agilent_SureSelect_i7.put("73_A10", "AACGCATT");
        Agilent_SureSelect_i7.put("74_B10", "CAGTTGCG");
        Agilent_SureSelect_i7.put("75_C10", "TGCCTCGA");
        Agilent_SureSelect_i7.put("76_D10", "AAGGCTTA");
        Agilent_SureSelect_i7.put("77_E10", "GCAATGAA");
        Agilent_SureSelect_i7.put("78_F10", "AAGAACCT");
        Agilent_SureSelect_i7.put("79_G10", "CTGTGCCT");
        Agilent_SureSelect_i7.put("80_H10", "TACGTAGC");
        Agilent_SureSelect_i7.put("81_A11", "AAGTGGAC");
        Agilent_SureSelect_i7.put("82_B11", "CAACCGTG");
        Agilent_SureSelect_i7.put("83_C11", "CTGTTGTT");
        Agilent_SureSelect_i7.put("84_D11", "GCACGATG");
        Agilent_SureSelect_i7.put("85_E11", "GTACGGAC");
        Agilent_SureSelect_i7.put("86_F11", "CTCCAAGC");
        Agilent_SureSelect_i7.put("87_G11", "TAGTCTGA");
        Agilent_SureSelect_i7.put("88_H11", "TTCGCCGT");
        Agilent_SureSelect_i7.put("89_A12", "GAACTAAG");
        Agilent_SureSelect_i7.put("90_B12", "AAGCCATC");
        Agilent_SureSelect_i7.put("91_C12", "AACTCTTG");
        Agilent_SureSelect_i7.put("92_D12", "GTAGTCAT");
        Agilent_SureSelect_i7.put("93_E12", "CTCGCTAG");
        Agilent_SureSelect_i7.put("94_F12", "AGTCTTCA");
        Agilent_SureSelect_i7.put("95_G12", "TCAAGCTA");
        Agilent_SureSelect_i7.put("96_H12", "CTTATCCT");

        Map<String, String> Agilent_SureSelect_i5_G1 = new HashMap<>();

        Agilent_SureSelect_i5_G1.put("1_A01", "ATGGTTAG");
        Agilent_SureSelect_i5_G1.put("2_B01", "CAAGGTGA");
        Agilent_SureSelect_i5_G1.put("3_C01", "TAGACCAA");
        Agilent_SureSelect_i5_G1.put("4_D01", "AGTCGCGA");
        Agilent_SureSelect_i5_G1.put("5_E01", "AAGGAGCG");
        Agilent_SureSelect_i5_G1.put("6_F01", "TCAGCATC");
        Agilent_SureSelect_i5_G1.put("7_G01", "AGAAGCAA");
        Agilent_SureSelect_i5_G1.put("8_H01", "GCAGGTTC");
        Agilent_SureSelect_i5_G1.put("9_A02", "AAGTGTCT");
        Agilent_SureSelect_i5_G1.put("10_B02", "CTACCGAA");
        Agilent_SureSelect_i5_G1.put("11_C02", "TAGAGCTC");
        Agilent_SureSelect_i5_G1.put("12_D02", "ATGTCAAG");
        Agilent_SureSelect_i5_G1.put("13_E02", "GCATCATA");
        Agilent_SureSelect_i5_G1.put("14_F02", "GACTTGAC");
        Agilent_SureSelect_i5_G1.put("15_G02", "CTACAATG");
        Agilent_SureSelect_i5_G1.put("16_H02", "TCTCAGCA");
        Agilent_SureSelect_i5_G1.put("17_A03", "AGACACAC");
        Agilent_SureSelect_i5_G1.put("18_B03", "CAGGTCTG");
        Agilent_SureSelect_i5_G1.put("19_C03", "AATACGCG");
        Agilent_SureSelect_i5_G1.put("20_D03", "GCACACAT");
        Agilent_SureSelect_i5_G1.put("21_E03", "GCACACAT");
        Agilent_SureSelect_i5_G1.put("22_F03", "ATCCTCTT");
        Agilent_SureSelect_i5_G1.put("23_G03", "GCACCTAA");
        Agilent_SureSelect_i5_G1.put("24_H03", "TGCTGCTC");
        Agilent_SureSelect_i5_G1.put("25_A04", "TGGCACCA");
        Agilent_SureSelect_i5_G1.put("26_B04", "AGATGGAT");
        Agilent_SureSelect_i5_G1.put("27_C04", "GAATTGTG");
        Agilent_SureSelect_i5_G1.put("28_D04", "GAGCACTG");
        Agilent_SureSelect_i5_G1.put("29_E04", "GTTGCGGA");
        Agilent_SureSelect_i5_G1.put("30_F04", "AATGGAAC");
        Agilent_SureSelect_i5_G1.put("31_G04", "TCAGAGGT");
        Agilent_SureSelect_i5_G1.put("32_H04", "GCAACAAT");
        Agilent_SureSelect_i5_G1.put("33_A05", "GTCGATCG");
        Agilent_SureSelect_i5_G1.put("34_B05", "ATGGTAGC");
        Agilent_SureSelect_i5_G1.put("35_C05", "CGCCAATT");
        Agilent_SureSelect_i5_G1.put("36_D05", "GACAATTG");
        Agilent_SureSelect_i5_G1.put("37_E05", "ATATTCCG");
        Agilent_SureSelect_i5_G1.put("38_F05", "TCTACCTC");
        Agilent_SureSelect_i5_G1.put("39_G05", "TCGTCGTG");
        Agilent_SureSelect_i5_G1.put("40_H05", "TCGTCGTG");
        Agilent_SureSelect_i5_G1.put("41_A06", "GTCCTATA");
        Agilent_SureSelect_i5_G1.put("42_B06", "AATGACCA");
        Agilent_SureSelect_i5_G1.put("43_C06", "CAGACGCT");
        Agilent_SureSelect_i5_G1.put("44_D06", "TCGAACTG");
        Agilent_SureSelect_i5_G1.put("45_E06", "CGCTTCCA");
        Agilent_SureSelect_i5_G1.put("46_F06", "TATTCCTG");
        Agilent_SureSelect_i5_G1.put("47_G06", "CAAGTTAC");
        Agilent_SureSelect_i5_G1.put("48_H06", "CAGAGCAG");
        Agilent_SureSelect_i5_G1.put("49_A07", "CGCGCAAT");
        Agilent_SureSelect_i5_G1.put("50_B07", "TGAGGAGT");
        Agilent_SureSelect_i5_G1.put("51_C07", "ATGACGAA");
        Agilent_SureSelect_i5_G1.put("52_D07", "TACGGCGA");
        Agilent_SureSelect_i5_G1.put("53_E07", "AGCGAGTT");
        Agilent_SureSelect_i5_G1.put("54_F07", "TGTATCAC");
        Agilent_SureSelect_i5_G1.put("55_G07", "GATCGCCT");
        Agilent_SureSelect_i5_G1.put("56_H07", "GACTCAAT");
        Agilent_SureSelect_i5_G1.put("57_A08", "CAGCTTGC");
        Agilent_SureSelect_i5_G1.put("58_B08", "AGCTGAAG");
        Agilent_SureSelect_i5_G1.put("59_C08", "ATTCCGTG");
        Agilent_SureSelect_i5_G1.put("60_D08", "TATGCCGC");
        Agilent_SureSelect_i5_G1.put("61_E08", "TCAGCTCA");
        Agilent_SureSelect_i5_G1.put("62_F08", "AACTGCAA");
        Agilent_SureSelect_i5_G1.put("63_G08", "ATTAGGAG");
        Agilent_SureSelect_i5_G1.put("64_H08", "CAGCAATA");
        Agilent_SureSelect_i5_G1.put("65_A09", "GCCAAGCT");
        Agilent_SureSelect_i5_G1.put("66_B09", "TCCGTTAA");
        Agilent_SureSelect_i5_G1.put("67_C09", "GTGCAACG");
        Agilent_SureSelect_i5_G1.put("68_D09", "AGTAACGC");
        Agilent_SureSelect_i5_G1.put("69_E09", "CATAGCCA");
        Agilent_SureSelect_i5_G1.put("70_F09", "CACTAGTA");
        Agilent_SureSelect_i5_G1.put("71_G09", "TTAGTGCG");
        Agilent_SureSelect_i5_G1.put("72_H09", "TCGATACA");
        Agilent_SureSelect_i5_G1.put("73_A10", "ATAGTGAC");
        Agilent_SureSelect_i5_G1.put("74_B10", "AACGCATT");
        Agilent_SureSelect_i5_G1.put("75_C10", "CAGTTGCG");
        Agilent_SureSelect_i5_G1.put("76_D10", "TGCCTCGA");
        Agilent_SureSelect_i5_G1.put("77_E10", "AAGGCTTA");
        Agilent_SureSelect_i5_G1.put("78_F10", "GCAATGAA");
        Agilent_SureSelect_i5_G1.put("79_G10", "AAGAACCT");
        Agilent_SureSelect_i5_G1.put("80_H10", "CTGTGCCT");
        Agilent_SureSelect_i5_G1.put("81_A11", "TACGTAGC");
        Agilent_SureSelect_i5_G1.put("82_B11", "AAGTGGAC");
        Agilent_SureSelect_i5_G1.put("83_C11", "CAACCGTG");
        Agilent_SureSelect_i5_G1.put("84_D11", "CTGTTGTT");
        Agilent_SureSelect_i5_G1.put("85_E11", "GCACGATG");
        Agilent_SureSelect_i5_G1.put("86_F11", "GTACGGAC");
        Agilent_SureSelect_i5_G1.put("87_G11", "CTCCAAGC");
        Agilent_SureSelect_i5_G1.put("88_H11", "TAGTCTGA");
        Agilent_SureSelect_i5_G1.put("89_A12", "ATACGAAG");
        Agilent_SureSelect_i5_G1.put("90_B12", "GAGATTCA");
        Agilent_SureSelect_i5_G1.put("91_C12", "AAGCCATC");
        Agilent_SureSelect_i5_G1.put("92_D12", "AACTCTTG");
        Agilent_SureSelect_i5_G1.put("93_E12", "GTAGTCAT");
        Agilent_SureSelect_i5_G1.put("94_F12", "CAGTATCA");
        Agilent_SureSelect_i5_G1.put("95_G12", "CTTCGTAC");
        Agilent_SureSelect_i5_G1.put("96_H12", "TCAAGCTA");


        Map<String, String> Agilent_SureSelect_i5_G2 = new HashMap<>();

        Agilent_SureSelect_i5_G2.put("1_A01", "CTAACCAT");
        Agilent_SureSelect_i5_G2.put("2_B01", "TCACCTTG");
        Agilent_SureSelect_i5_G2.put("3_C01", "TTGGTCTA");
        Agilent_SureSelect_i5_G2.put("4_D01", "TCGCGACT");
        Agilent_SureSelect_i5_G2.put("5_E01", "CGCTCCTT");
        Agilent_SureSelect_i5_G2.put("6_F01", "GATGCTGA");
        Agilent_SureSelect_i5_G2.put("7_G01", "TTGCTTCT");
        Agilent_SureSelect_i5_G2.put("8_H01", "GAACCTGC");
        Agilent_SureSelect_i5_G2.put("9_A02", "AGACACTT");
        Agilent_SureSelect_i5_G2.put("10_B02", "TTCGGTAG");
        Agilent_SureSelect_i5_G2.put("11_C02", "GAGCTCTA");
        Agilent_SureSelect_i5_G2.put("12_D02", "CTTGACAT");
        Agilent_SureSelect_i5_G2.put("13_E02", "TATGATGC");
        Agilent_SureSelect_i5_G2.put("14_F02", "GTCAAGTC");
        Agilent_SureSelect_i5_G2.put("15_G02", "CATTGTAG");
        Agilent_SureSelect_i5_G2.put("16_H02", "TGCTGAGA");
        Agilent_SureSelect_i5_G2.put("17_A03", "GTGTGTCT");
        Agilent_SureSelect_i5_G2.put("18_B03", "CAGACCTG");
        Agilent_SureSelect_i5_G2.put("19_C03", "CGCGTATT");
        Agilent_SureSelect_i5_G2.put("20_D03", "ATGTGTGC");
        Agilent_SureSelect_i5_G2.put("21_E03", "TATGCAAG");
        Agilent_SureSelect_i5_G2.put("22_F03", "AAGAGGAT");
        Agilent_SureSelect_i5_G2.put("23_G03", "TTAGGTGC");
        Agilent_SureSelect_i5_G2.put("24_H03", "GAGCAGCA");
        Agilent_SureSelect_i5_G2.put("25_A04", "TGGTGCCA");
        Agilent_SureSelect_i5_G2.put("26_B04", "ATCCATCT");
        Agilent_SureSelect_i5_G2.put("27_C04", "CACAATTC");
        Agilent_SureSelect_i5_G2.put("28_D04", "CAGTGCTC");
        Agilent_SureSelect_i5_G2.put("29_E04", "TCCGCAAC");
        Agilent_SureSelect_i5_G2.put("30_F04", "GTTCCATT");
        Agilent_SureSelect_i5_G2.put("31_G04", "ACCTCTGA");
        Agilent_SureSelect_i5_G2.put("32_H04", "ATTGTTGC");
        Agilent_SureSelect_i5_G2.put("33_A05", "CGATCGAC");
        Agilent_SureSelect_i5_G2.put("34_B05", "GCTACCAT");
        Agilent_SureSelect_i5_G2.put("35_C05", "AATTGGCG");
        Agilent_SureSelect_i5_G2.put("36_D05", "CAATTGTC");
        Agilent_SureSelect_i5_G2.put("37_E05", "CGGAATAT");
        Agilent_SureSelect_i5_G2.put("38_F05", "GAGGTAGA");
        Agilent_SureSelect_i5_G2.put("39_G05", "CACGACGA");
        Agilent_SureSelect_i5_G2.put("40_H05", "GTTCTCAT");
        Agilent_SureSelect_i5_G2.put("41_A06", "TATAGGAC");
        Agilent_SureSelect_i5_G2.put("42_B06", "TGGTCATT");
        Agilent_SureSelect_i5_G2.put("43_C06", "AGCGTCTG");
        Agilent_SureSelect_i5_G2.put("44_D06", "CAGTTCGA");
        Agilent_SureSelect_i5_G2.put("45_E06", "TGGAAGCG");
        Agilent_SureSelect_i5_G2.put("46_F06", "CAGGAATA");
        Agilent_SureSelect_i5_G2.put("47_G06", "GTAACTTG");
        Agilent_SureSelect_i5_G2.put("48_H06", "CTGCTCTG");
        Agilent_SureSelect_i5_G2.put("49_A07", "ATTGCGCG");
        Agilent_SureSelect_i5_G2.put("50_B07", "ACTCCTCA");
        Agilent_SureSelect_i5_G2.put("51_C07", "TTCGTCAT");
        Agilent_SureSelect_i5_G2.put("52_D07", "TCGCCGTA");
        Agilent_SureSelect_i5_G2.put("53_E07", "AACTCGCT");
        Agilent_SureSelect_i5_G2.put("54_F07", "GTGATACA");
        Agilent_SureSelect_i5_G2.put("55_G07", "AGGCGATC");
        Agilent_SureSelect_i5_G2.put("56_H07", "ATTGAGTC");
        Agilent_SureSelect_i5_G2.put("57_A08", "GCAAGCTG");
        Agilent_SureSelect_i5_G2.put("58_B08", "CTTCAGCT");
        Agilent_SureSelect_i5_G2.put("59_C08", "CACGGAAT");
        Agilent_SureSelect_i5_G2.put("60_D08", "GCGGCATA");
        Agilent_SureSelect_i5_G2.put("61_E08", "TGAGCTGA");
        Agilent_SureSelect_i5_G2.put("62_F08", "TTGCAGTT");
        Agilent_SureSelect_i5_G2.put("63_G08", "CTCCTAAT");
        Agilent_SureSelect_i5_G2.put("64_H08", "TATTGCTG");
        Agilent_SureSelect_i5_G2.put("65_A09", "AGCTTGGC");
        Agilent_SureSelect_i5_G2.put("66_B09", "TTAACGGA");
        Agilent_SureSelect_i5_G2.put("67_C09", "CGTTGCAC");
        Agilent_SureSelect_i5_G2.put("68_D09", "GCGTTACT");
        Agilent_SureSelect_i5_G2.put("69_E09", "TGGCTATG");
        Agilent_SureSelect_i5_G2.put("70_F09", "TACTAGTG");
        Agilent_SureSelect_i5_G2.put("71_G09", "CGCACTAA");
        Agilent_SureSelect_i5_G2.put("72_H09", "TGTATCGA");
        Agilent_SureSelect_i5_G2.put("73_A10", "GTCACTAT");
        Agilent_SureSelect_i5_G2.put("74_B10", "AATGCGTT");
        Agilent_SureSelect_i5_G2.put("75_C10", "CGCAACTG");
        Agilent_SureSelect_i5_G2.put("76_D10", "TCGAGGCA");
        Agilent_SureSelect_i5_G2.put("77_E10", "TAAGCCTT");
        Agilent_SureSelect_i5_G2.put("78_F10", "TTCATTGC");
        Agilent_SureSelect_i5_G2.put("79_G10", "AGGTTCTT");
        Agilent_SureSelect_i5_G2.put("80_H10", "AGGCACAG");
        Agilent_SureSelect_i5_G2.put("81_A11", "GCTACGTA");
        Agilent_SureSelect_i5_G2.put("82_B11", "GTCCACTT");
        Agilent_SureSelect_i5_G2.put("83_C11", "CACGGTTG");
        Agilent_SureSelect_i5_G2.put("84_D11", "AACAACAG");
        Agilent_SureSelect_i5_G2.put("85_E11", "CATCGTGC");
        Agilent_SureSelect_i5_G2.put("86_F11", "GTCCGTAC");
        Agilent_SureSelect_i5_G2.put("87_G11", "GCTTGGAG");
        Agilent_SureSelect_i5_G2.put("88_H11", "TCAGACTA");
        Agilent_SureSelect_i5_G2.put("89_A12", "CTTCGTAT");
        Agilent_SureSelect_i5_G2.put("90_B12", "TGAATCTC");
        Agilent_SureSelect_i5_G2.put("91_C12", "GATGGCTT");
        Agilent_SureSelect_i5_G2.put("92_D12", "CAAGAGTT");
        Agilent_SureSelect_i5_G2.put("93_E12", "ATGACTAC");
        Agilent_SureSelect_i5_G2.put("94_F12", "TGATACTG");
        Agilent_SureSelect_i5_G2.put("95_G12", "GTACGAAG");
        Agilent_SureSelect_i5_G2.put("96_H12", "GTACGAAG");

        Map<String, String> NEBnext_multiplex_i7 = new HashMap<>();

        NEBnext_multiplex_i7.put("1", "CACTGTAG");
        NEBnext_multiplex_i7.put("2", "GTGCACGA");
        NEBnext_multiplex_i7.put("3", "AAGCGACT");
        NEBnext_multiplex_i7.put("4", "TGATAGGC");
        NEBnext_multiplex_i7.put("5", "ACGAATCC");
        NEBnext_multiplex_i7.put("6", "GTCTGAGT");
        NEBnext_multiplex_i7.put("7", "ATTACCCA");
        NEBnext_multiplex_i7.put("8", "GACTTGTG");
        NEBnext_multiplex_i7.put("9", "TTCAATAG");
        NEBnext_multiplex_i7.put("10", "GTTTGCTC");
        NEBnext_multiplex_i7.put("11", "ACCGGAGT");
        NEBnext_multiplex_i7.put("12", "CTTGACGA");
        NEBnext_multiplex_i7.put("13", "TGTTCGCC");
        NEBnext_multiplex_i7.put("14", "ACAAGGCA");
        NEBnext_multiplex_i7.put("15", "CCTGTCAA");
        NEBnext_multiplex_i7.put("16", "CCATCCGC");
        NEBnext_multiplex_i7.put("17", "ATGGCTGT");
        NEBnext_multiplex_i7.put("18", "AAGGCGTA");
        NEBnext_multiplex_i7.put("19", "AGGTAGGA");
        NEBnext_multiplex_i7.put("20", "TCGCGCAA");
        NEBnext_multiplex_i7.put("21", "AAGGAAGG");
        NEBnext_multiplex_i7.put("22", "GCACACAA");
        NEBnext_multiplex_i7.put("23", "TCCCACGA");
        NEBnext_multiplex_i7.put("24", "ACCAACAG");


        Map<String, String> NEBnext_multiplex_i5_G1 = new HashMap<>();

        NEBnext_multiplex_i5_G1.put("1", "AAGCGACT");
        NEBnext_multiplex_i5_G1.put("2", "TGATAGGC");
        NEBnext_multiplex_i5_G1.put("3", "ACGAATCC");
        NEBnext_multiplex_i5_G1.put("4", "GTCTGAGT");
        NEBnext_multiplex_i5_G1.put("5", "ATTACCCA");
        NEBnext_multiplex_i5_G1.put("6", "GACTTGTG");
        NEBnext_multiplex_i5_G1.put("7", "CACTGTAG");
        NEBnext_multiplex_i5_G1.put("8", "GTGCACGA");
        NEBnext_multiplex_i5_G1.put("9", "TCCCACGA");
        NEBnext_multiplex_i5_G1.put("10", "ACCAACAG");
        NEBnext_multiplex_i5_G1.put("11", "AAGGAAGG");
        NEBnext_multiplex_i5_G1.put("12", "GCACACAA");
        NEBnext_multiplex_i5_G1.put("13", "AGGTAGGA");
        NEBnext_multiplex_i5_G1.put("14", "TCGCGCAA");
        NEBnext_multiplex_i5_G1.put("15", "ATGGCTGT");
        NEBnext_multiplex_i5_G1.put("16", "AAGGCGTA");
        NEBnext_multiplex_i5_G1.put("17", "CCTGTCAA");
        NEBnext_multiplex_i5_G1.put("18", "CCATCCGC");
        NEBnext_multiplex_i5_G1.put("19", "TGTTCGCC");
        NEBnext_multiplex_i5_G1.put("20", "ACAAGGCA");
        NEBnext_multiplex_i5_G1.put("21", "ACCGGAGT");
        NEBnext_multiplex_i5_G1.put("22", "CTTGACGA");
        NEBnext_multiplex_i5_G1.put("23", "TTCAATAG");
        NEBnext_multiplex_i5_G1.put("24", "GTTTGCTC");



        Map<String, String> NEBnext_multiplex_i5_G2 = new HashMap<>();

        NEBnext_multiplex_i5_G2.put("1", "AGTCGCTT");
        NEBnext_multiplex_i5_G2.put("2", "GCCTATCA");
        NEBnext_multiplex_i5_G2.put("3", "GGATTCGT");
        NEBnext_multiplex_i5_G2.put("4", "ACTCAGAC");
        NEBnext_multiplex_i5_G2.put("5", "TGGGTAAT");
        NEBnext_multiplex_i5_G2.put("6", "CACAAGTC");
        NEBnext_multiplex_i5_G2.put("7", "CTACAGTG");
        NEBnext_multiplex_i5_G2.put("8", "TCGTGCAC");
        NEBnext_multiplex_i5_G2.put("9", "TCGTGGGA");
        NEBnext_multiplex_i5_G2.put("10", "CTGTTGGT");
        NEBnext_multiplex_i5_G2.put("11", "CCTTCCTT");
        NEBnext_multiplex_i5_G2.put("12", "TTGTGTGC");
        NEBnext_multiplex_i5_G2.put("13", "TCCTACCT");
        NEBnext_multiplex_i5_G2.put("14", "TTGCGCGA");
        NEBnext_multiplex_i5_G2.put("15", "ACAGCCAT");
        NEBnext_multiplex_i5_G2.put("16", "TACGCCTT");
        NEBnext_multiplex_i5_G2.put("17", "TTGACAGG");
        NEBnext_multiplex_i5_G2.put("18", "GCGGATGG");
        NEBnext_multiplex_i5_G2.put("19", "GGCGAACA");
        NEBnext_multiplex_i5_G2.put("20", "TGCCTTGT");
        NEBnext_multiplex_i5_G2.put("21", "ACTCCGGT");
        NEBnext_multiplex_i5_G2.put("22", "TCGTCAAG");
        NEBnext_multiplex_i5_G2.put("23", "CTATTGAA");
        NEBnext_multiplex_i5_G2.put("24", "GAGCAAAC");


        Map<String, String> Dovetail_DNA_Indexes_i7 = new HashMap<>();

        Dovetail_DNA_Indexes_i7.put("UDI1", "CTGATCGT");
        Dovetail_DNA_Indexes_i7.put("UDI2", "ACTCTCGA");
        Dovetail_DNA_Indexes_i7.put("UDI3", "TGAGCTAG");
        Dovetail_DNA_Indexes_i7.put("UDI4", "GAGACGAT");
        Dovetail_DNA_Indexes_i7.put("UDI5", "CTTGTCGA");
        Dovetail_DNA_Indexes_i7.put("UDI6", "TTCCAAGG");
        Dovetail_DNA_Indexes_i7.put("UDI7", "CGCATGAT");
        Dovetail_DNA_Indexes_i7.put("UDI8", "ACGGAACA");


        Map<String, String> Dovetail_DNA_Indexes_i5_G1 = new HashMap<>();

        Dovetail_DNA_Indexes_i5_G1.put("UDI1", "GCGCATAT");
        Dovetail_DNA_Indexes_i5_G1.put("UDI2", "CTGTACCA");
        Dovetail_DNA_Indexes_i5_G1.put("UDI3", "GAACGGTT");
        Dovetail_DNA_Indexes_i5_G1.put("UDI4", "ACCGGTTA");
        Dovetail_DNA_Indexes_i5_G1.put("UDI5", "CGATGTTC");
        Dovetail_DNA_Indexes_i5_G1.put("UDI6", "CTACAAGG");
        Dovetail_DNA_Indexes_i5_G1.put("UDI7", "AAGCCTGA");
        Dovetail_DNA_Indexes_i5_G1.put("UDI8", "ACGAGAAC");



        Map<String, String> Dovetail_DNA_Indexes_i5_G2 = new HashMap<>();

        Dovetail_DNA_Indexes_i5_G2.put("UDI1", "CTGATCGT");
        Dovetail_DNA_Indexes_i5_G2.put("UDI2", "ACTCTCGA");
        Dovetail_DNA_Indexes_i5_G2.put("UDI3", "TGAGCTAG");
        Dovetail_DNA_Indexes_i5_G2.put("UDI4", "GAGACGAT");
        Dovetail_DNA_Indexes_i5_G2.put("UDI5", "CTTGTCGA");
        Dovetail_DNA_Indexes_i5_G2.put("UDI6", "TTCCAAGG");
        Dovetail_DNA_Indexes_i5_G2.put("UDI7", "CGCATGAT");
        Dovetail_DNA_Indexes_i5_G2.put("UDI8", "ACGGAACA");


        // ##########################################################################
        // ##             Welcome screen and start of a program                    ##
        // ##########################################################################      


        System.out.println("");

        System.out.print(" -------------------------Illumina Sample Sheet creator ( author M.Necki )-------------------------"
        + "\n| A script that allows you to generate sample sheet from the arguments given at the project input. |"
        + "\n| The script consists of a written explanation of the instructions to be followed and the input    |"
        + "\n| part, where you enter the data needed for the sample sheet.                                      |"
        + "\n| Some input options are not required and can be skipped by pressing the \"Enter\" key               |"
        + "\n|                                                                                                  |"
        + "\n|                                                                                                  |"
        + "\n| This program uses openCSV dependency.                                                            |"
        + "\n| It can be downloaded from: https://sourceforge.net/projects/opencsv/                             |"
        + "\n| Please consider installing it.                                                                   |"
        + "\n|                                                                                                  |"
        + "\n --------------------------------------------------------------------------------------------------\n");

        System.out.println("");
        System.out.println("###################################### SPECIFY OUTPUT FILE #########################################");
        System.out.println("");    

        
        
        System.out.print(" ------------------------------------------ Output file -------------------------------------------"
        + "\n| Please enter the name and the absolute path to the csv file from the sample sheet that has not   |"
        + "\n| yet been created.                                                                                |"
        + "\n|                                                                                                  |"
        + "\n| It is recommended that you name your sample sheet with the barcode number of the reagent         |"
        + "\n| cartridge followed by *.csv extension. The barcode number is on the reagent cartridge label      |"
        + "\n| directly below the barcode. If the barcode number is not known, use a preferred name for the     |"
        + "\n| sample sheet followed by *.csv.                                                                  |"
        + "\n|                                                                                                  |"
        + "\n| For example if you want to create a file with sample sheet called myfile.csv in directory named  |"
        + "\n| \"C:\\\\Users\\\\data\"  then you have to  type in the command line following phrase:                  | "
        + "\n| \"C:\\\\Users\\\\data\\\\myfile.csv\".                                                                   |"
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String filepath = in.nextLine();

        System.out.println("");
        System.out.println("########################################### [HEADER] ###############################################");
        System.out.println("");
        
        System.out.print(" --------------------------------------- Investigator name ----------------------------------------"
        + "\n| Please enter the name of the Investigator (optional field):                                      |"
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String invest_name = in.nextLine();


        System.out.print(" ------------------------------------------ Project name ------------------------------------------"
        + "\n| Please enter the name of the project (optional field):                                           |"
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String project_name = in.nextLine();


        System.out.print(" ---------------------------------------- Experiment name -----------------------------------------"
        + "\n| Please enter the name of the experiment (optional field):                                        |"
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String exp_name = in.nextLine();



        System.out.print(" -------------------------------------------Workflow-----------------------------------------------"
        +  "\n| The next step of the program will be to select the workflow used in the SBS procedure.           |"
        + "\n| There are 11 different workflows to choose from as listed below:                                 |"
        + "\n|                                                                                                  |"
        + "\n| * \"Amplicon - DS\"                                                                                |"
        + "\n| * \"Assembly\"                                                                                     |"
        + "\n| * \"Enrichment\"                                                                                   |"
        + "\n| * \"Generate FASTQ\"                                                                               |"
        + "\n| * \"LibraryQC\"                                                                                    |"
        + "\n| * \"Metagenomics\"                                                                                 |"
        + "\n| * \"PCR Amplicon\"                                                                                 |"
        + "\n| * \"Resequencing\"                                                                                 |"
        + "\n| * \"Small RNA\"                                                                                    |"
        + "\n| * \"Targeted RNA\"                                                                                 |"
        + "\n| * \"TruSeq Amplicon\"                                                                              |"
        + "\n|                                                                                                  |"
        + "\n| Select the appropriate workflow by typing its name and pressing the \"Enter\" key:                 |"   
        + "\n -------------------------------------------------------------------------------------------------- \n"   );
    
        String workflow = in.nextLine();

        String[] avb_workflows = {"Amplicon - DS", "Assembly", "Enrichment", "Generate FASTQ",
                                  "LibraryQC", "Metagenomics", "PCR Amplicon", "Resequencing",
                                  "Small RNA", "Targeted RNA", "TruSeq Amplicon"};


        // ##########################################################################
        // ## checking the conditions for the correctness of entered workflow data ##
        // ##########################################################################      


        while(Arrays.asList(avb_workflows).contains(workflow) == false){
            
            System.out.print(" --------------------------------------- Error in the program -------------------------------------"
            + "\n| An incorrect workflow name was entered!                                                          |"
            + "\n| Check the correctness of the given name and enter it again                                       |"
            + "\n --------------------------------------------------------------------------------------------------");

            System.out.println("");
            
            workflow = in.nextLine();
        }


        System.out.print(" ------------------------------------------- Application ------------------------------------------"
        + "\n| Please enter the application name (optional field):                                              |"
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String app_name = in.nextLine();



        System.out.print(" ------------------------------------------- Instrument -------------------------------------------"
        + "\n| Please enter the name of instrument (required field):                                            |"
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String ins_name = in.nextLine();

        String[] instruments_G2 = {"iSeq","NovaSeq 6000 v1.5", "MiniSeq", "NextSeq 500",
        "NextSeq 550","HiSeq 3000", "HiSeq 4000", "HiSeq X",
        "NextSeq 2000 v1.0"};

        //String[] instruments_G1 = {"NovaSeq 6000 v1.0", "MiSeq", "HiSeq 2000",
        //"HiSeq 2500", "NextSeq 2000 v2.0"};  
       

        int flaga = 0;

        if(Arrays.stream(instruments_G2).anyMatch(ins_name::equals)){
            flaga = flaga+1;
        }
        else {
        flaga = 0;
        }

        
        System.out.print(" ------------------------------------------- Assay name -------------------------------------------"
        + "\n| Please enter the name of the assay (optional field):                                             |"
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String assay_name = in.nextLine();



        System.out.print(" ----------------------------------------- Index adapters -----------------------------------------"
        + "\n| Please enter the name of index adapters (required field):                                        |"
        + "\n| Indexes can be selected from Nextera, AmpliSeq, TruSeq, NEB multiplex, Dovetail and SureSelect   |" 
        + "\n| kits. Please choose appropriate index adapters now:                                              |"
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String adapt_name = in.nextLine();



        System.out.print(" ------------------------------------------- Chemistry --------------------------------------------"
        + "\n| Please enter chemistry name.                                                                     |"
        + "\n| It is optional for non-indexed or single-indexed TruSeq RNA or TruSeq DNA libraries.             |"
        + "\n| It is required for any workflows that use dual indexing, such as Nextera and TruSeq Custom       |"   
        + "\n| Amplicon. Enter \"amplicon\" in this field.                                                        |" 
        + "\n --------------------------------------------------------------------------------------------------\n");
      
        String chem_name = in.nextLine();


        // ###########################################################################
        // ## checking the conditions for the correctness of entered chemistry data ##
        // ###########################################################################   

        while((chem_name.equals("amplicon") || chem_name.equals("Amplicon") || chem_name.equals("")) == false){
            
            System.out.print(" --------------------------------------- Error in the program -------------------------------------"
            + "\n| An invalid chemistry name was entered!                                                           |"
            + "\n| The chemistry field should either have no value or have an \"amplicon\" value                      |"
            + "\n| Check the correctness of the given name and enter it again                                       |"
            + "\n --------------------------------------------------------------------------------------------------");

            System.out.println("");
            
            chem_name = in.nextLine();
        }




        // ##########################################################################
        // ##                             [Reads] part                             ##
        // ##########################################################################  



        System.out.println("");
        System.out.println("########################################### [READS] ###############################################");
        System.out.println("");


        System.out.print(" -----------------------------------------------[Reads]--------------------------------------------"
        + "\n| The number of reads and their type should be given.                                              |"
        + "\n| For single indexing use the abbreviation SI.                                                     |"
        + "\n| If you want to choose double indexing use the abbreviation DI.                                   |"
        + "\n| The number of reads should be separated by a space from the index mode abbreviation.             |" 
        + "\n| For example \"DI 100 100\" means Dual indexing mode with a number of 100 reads per index.          |"
        + "\n| Enter information about reads now:                                                               |"
        + "\n --------------------------------------------------------------------------------------------------\n");

        String[] reads = in.nextLine().trim().split(" ");

        // #########################################################################
        // ## checking the conditions for the correctness of entered [reads] data ##
        // #########################################################################
        
        int flagg = 0;
        do 
        {
            switch(reads.length){
                case 1:
                    System.out.print(" --------------------------------------- Error in the program -------------------------------------"
                    + "\n| No numeric values specified!                                                                     |"
                    + "\n| Enter [Reads] arguments again.                                                                   |"
                    + "\n --------------------------------------------------------------------------------------------------");
    
                    System.out.println("");
                    reads = in.nextLine().trim().split(" ");
                    break;
                        
                case 2:
                    if(Arrays.asList(reads).contains("DI")){
                        System.out.print(" --------------------------------------- Error in the program -------------------------------------"
                        + "\n| Only one numeric value was specified. There is still one missing!                                |"
                        + "\n| Enter [Reads] arguments again.                                                                   |"
                        + "\n --------------------------------------------------------------------------------------------------");
            
                        System.out.println("");
                        reads = in.nextLine().trim().split(" ");
                        break;
                    }
                    else{
                        flagg += 1;
                        break;
                    }
                case 3:
                    if(Arrays.asList(reads).contains("SI")){ 
                        System.out.print(" --------------------------------------- Error in the program -------------------------------------"
                        + "\n| Too many values for single indexing!                                                             |"
                        + "\n| Enter [Reads] arguments again.                                                                   |"
                        + "\n --------------------------------------------------------------------------------------------------");
            
                        System.out.println("");
                        reads = in.nextLine().trim().split(" "); 
                        break;
                    }
                    else{
                        flagg += 1;
                        break;
                    }

                default:
                    System.out.print(" --------------------------------------- Error in the program -------------------------------------"
                    + "\n| The wrong number of arguments was specified.                                                     |"
                    + "\n| Enter [Reads] arguments again.                                                                   |"
                    + "\n --------------------------------------------------------------------------------------------------");
    
                    System.out.println("");
                    reads = in.nextLine().trim().split(" ");
                    break;

            }
        } 
        while(flagg == 0);



        // ##########################################################################
        // ##                             [Data] part                              ##
        // ##########################################################################  



        System.out.println("");
        System.out.println("########################################### [DATA] ###############################################");
        System.out.println("");

        System.out.println(" ------------------------------------------------------------");
        System.out.println("| Do you want lane to be specified, enter \"Yes\" or \"No\"      |");
        System.out.println(" ------------------------------------------------------------");
        String lane_yn = in.nextLine();

        System.out.println(" --------------------------------------------------------------");
        System.out.println("| Do you want sample_name to be specified, enter \"Yes\" or \"No\" |");
        System.out.println(" --------------------------------------------------------------");
        String sam_name_yn = in.nextLine();

        System.out.println(" ---------------------------------------------------------------");
        System.out.println("| Do you want sample_plate to be specified, enter \"Yes\" or \"No\" |");
        System.out.println(" ---------------------------------------------------------------");
        String sam_plate_yn = in.nextLine();

        System.out.println(" --------------------------------------------------------------");
        System.out.println("| Do you want sample_well to be specified, enter \"Yes\" or \"No\" |");
        System.out.println(" --------------------------------------------------------------");
        String sam_well_yn = in.nextLine();

        System.out.println(" -------------------------------------------------------------------");
        System.out.println("| Do you want index_plate_well to be specified, enter \"Yes\" or \"No\" |");
        System.out.println(" -------------------------------------------------------------------");
        String ind_well_yn = in.nextLine();

        System.out.println(" -----------------------------------------------------------------");
        System.out.println("| Do you want sample_project to be specified, enter \"Yes\" or \"No\" |");
        System.out.println(" -----------------------------------------------------------------");
        String sam_project_yn = in.nextLine();

        System.out.println(" --------------------------------------------------------------");
        System.out.println("| Do you want description to be specified, enter \"Yes\" or \"No\" |");
        System.out.println(" --------------------------------------------------------------");
        String description_yn = in.nextLine();

        System.out.print(" -----------------------------------------------[Data]---------------------------------------------"
        + "\n| In this part of the program you will be asked to provide information regarding \"Date\" field.     |"
        + "\n| There are information that are optional and not required when creating a sample sheet,           |"
        + "\n| for example, the lane column or the description column. You will have to choose which data you   |"
        + "\n| want to include and which you don't. Sample_ID field is always required. i7 and i5 index         |" 
        + "\n| sequences should not be specified.                                                               |"
        + "\n|                                                                                                  |"
        + "\n| Each column's information is loaded line by line. For example, if we specified that we want to   |"
        + "\n| provide information on a sample name, sample project and description, we use a system with dual  |"
        + "\n| indexing and we selected \"TruSeq RNA CD indexes\" as the index adapters then the input data       |"
        + "\n| could look like this:                                                                            |"
        + "\n| Id_01 sample_name1 D704 D505 sample_project1 descrip1                                            |"
        + "\n| Id_02 sample_name2 D710 D501 sample_project1 descrip2                                            |"
        + "\n| Id_03 sample_name3 D712 D502 sample_project1 descrip3                                            |"
        + "\n| Id_04 sample_name4 D704 D501 sample_project1 descrip4                                            |"
        + "\n| Enter information about data now:                                                                |"
        + "\n --------------------------------------------------------------------------------------------------\n");

        List<String> index_adaptList = new ArrayList<>();
        
        if(adapt_name.startsWith("Nextera")){
            index_adaptList.add("Nextera");
        }
        else if(adapt_name.startsWith("Ampli")){
            index_adaptList.add("AmpliSeq");
        }
        else if(adapt_name.startsWith("Tru")){
            index_adaptList.add("TruSeq");
        }
        else if(adapt_name.startsWith("Dove")){
            index_adaptList.add("Dovetail");
        }
        else if(adapt_name.startsWith("NEB")){
            index_adaptList.add("NEBNext");
        }
        else if(adapt_name.startsWith("Sure")){
            index_adaptList.add("Sureselect");
        }

        String[] adapters = new String[ index_adaptList.size() ];
        index_adaptList.toArray(adapters);


        String line = null;
        List<String[]> data = new ArrayList<String[]>();


        while ((line = in.nextLine( )).length( ) > 0)  
        {   
          String[] tab = line.trim().split(" ");
          List<String> wordList = new ArrayList<String>(Arrays.asList(tab)); 
          int flag = 0;
          int index = -1;
          int index1 = -1;
          for(String s: tab){
            if(reads[0].equals("DI")){
                for(String t: adapters){
                switch(t){
                    case "Nextera":
                        for(String key : Nextera_Indexes_i7.keySet()){
                            if(s.equals(key) && flag==0){
                                String index_i7 = Nextera_Indexes_i7.get(key);
                                for (int i=0;i<tab.length;i++) {
                                    if (tab[i].equals(s)) {
                                        index = i;
                                        //System.out.println(index);
                                        break;
                                    }
                                }
                                wordList.add(index+1, index_i7);
                                flag = flag + 1;
                            }
                        }
                        if(flaga == 0){
                        for(String key: Nextera_Indexes_i5_G1.keySet()){
                                if(s.equals(key) && !tab[index].equals(s)){
                                    String index_i5 = Nextera_Indexes_i5_G1.get(key);
                                    for(int j=0;j<tab.length;j++){
                                        if(tab[j].equals(s)){
                                            //System.out.println(tab[j]);
                                            index1 = j;
                                            //System.out.println(index1);
                                            break;
                                        }
                                    }
                                    
                                    
                                    wordList.add(index1+2, index_i5);
                                    
                                }
                            
                            
                           
                        }
                    }
                    else{
                        for(String key: Nextera_Indexes_i5_G2.keySet()){
                            if(s.equals(key) && !tab[index].equals(s)){
                                String index_i5 = Nextera_Indexes_i5_G2.get(key);
                                for(int j=0;j<tab.length;j++){
                                    if(tab[j].equals(s)){
                                        //System.out.println(tab[j]);
                                        index1 = j;
                                        //System.out.println(index1);
                                        break;
                                    }
                                }
                                
                                
                                wordList.add(index1+2, index_i5);
                                
                            }
                        
                        
                       
                    }
                    }



                       // String[] linia = new String[wordList.size()];
                       // linia = wordList.toArray(linia);
                       // data.add(linia);
                    case "TruSeq":
                        for(String key : TruSeq_DNA_Indexes_i7.keySet()){
                            if(s.equals(key) && flag==0){
                                String index_i7 = TruSeq_DNA_Indexes_i7.get(key);
                                for (int i=0;i<tab.length;i++) {
                                    if (tab[i].equals(s)) {
                                    index = i;
                                    //System.out.println(index);
                                    break;
                                    }
                                }
                            wordList.add(index+1, index_i7);
                            flag = flag + 1;
                            }
                        }
                        if(flaga == 0){
                            for(String key: TruSeq_DNA_Indexes_i5_G1.keySet()){
                                if(s.equals(key) && !tab[index].equals(s)){
                                    String index_i5 = TruSeq_DNA_Indexes_i5_G1.get(key);
                                    for(int j=0;j<tab.length;j++){
                                        if(tab[j].equals(s)){
                                        //System.out.println(tab[j]);
                                        index1 = j;
                                        //System.out.println(index1);
                                        break;
                                    }
                                }
                                
                                
                                wordList.add(index1+2, index_i5);
                                
                            }
                        
                        
                       
                        }
                        }
                        else{
                            for(String key: TruSeq_DNA_Indexes_i5_G2.keySet()){
                                if(s.equals(key) && !tab[index].equals(s)){
                                    String index_i5 = TruSeq_DNA_Indexes_i5_G2.get(key);
                                    for(int j=0;j<tab.length;j++){
                                        if(tab[j].equals(s)){
                                    //System.out.println(tab[j]);
                                            index1 = j;
                                    //System.out.println(index1);
                                            break;
                                }
                            }
                            
                            
                            wordList.add(index1+2, index_i5);
                            
                            }
                    
                    
                   
                            }
                            }
                        
                        case "AmpliSeq":

                            for(String key : AmpliSeq_DNA_Indexes_i7.keySet()){
                                if(s.equals(key) && flag==0){
                                    String index_i7 = AmpliSeq_DNA_Indexes_i7.get(key);
                                    for (int i=0;i<tab.length;i++) {
                                        if (tab[i].equals(s)) {
                                            index = i;
                                    //System.out.println(index);
                                            break;
                                        }
                                    }
                                wordList.add(index+1, index_i7);
                                flag = flag + 1;
                                }
                            }
                            if(flaga == 0){
                                for(String key: AmpliSeq_DNA_Indexes_i5_G1.keySet()){
                                    if(s.equals(key) && !tab[index].equals(s)){
                                        String index_i5 = AmpliSeq_DNA_Indexes_i5_G1.get(key);
                                        for(int j=0;j<tab.length;j++){
                                            if(tab[j].equals(s)){
                                                //System.out.println(tab[j]);
                                                index1 = j;
                                                //System.out.println(index1);
                                                break;
                                    }
                                }
                                
                                
                                wordList.add(index1+2, index_i5);
                                
                            }
                        
                        
                       
                        }
                        }
                        else{
                            for(String key: AmpliSeq_DNA_Indexes_i5_G2.keySet()){
                                if(s.equals(key) && !tab[index].equals(s)){
                                    String index_i5 = AmpliSeq_DNA_Indexes_i5_G2.get(key);
                                    for(int j=0;j<tab.length;j++){
                                        if(tab[j].equals(s)){
                                    //System.out.println(tab[j]);
                                            index1 = j;
                                    //System.out.println(index1);
                                            break;
                                }
                            }
                            
                            
                            wordList.add(index1+2, index_i5);
                            
                            }
                    
                    
                   
                            }
                            }

                        case "NEBNext":

                            for(String key : NEBnext_multiplex_i7.keySet()){
                                if(s.equals(key) && flag==0){
                                    String index_i7 = NEBnext_multiplex_i7.get(key);
                                    for (int i=0;i<tab.length;i++) {
                                        if (tab[i].equals(s)) {
                                            index = i;
                                            //System.out.println(index);
                                            break;
                                        }
                                    }
                                wordList.add(index+1, index_i7);
                                flag = flag + 1;
                                }
                            }
                            if(flaga == 0){
                                for(String key: NEBnext_multiplex_i5_G1.keySet()){
                                    if(s.equals(key) && !tab[index].equals(s)){
                                        String index_i5 = NEBnext_multiplex_i5_G1.get(key);
                                        for(int j=0;j<tab.length;j++){
                                            if(tab[j].equals(s)){
                                                //System.out.println(tab[j]);
                                                index1 = j;
                                                //System.out.println(index1);
                                                break;
                                    }
                                }
                            
                            
                                wordList.add(index1+2, index_i5);
                            
                            }
                    
                    
                   
                        }
                        }
                        else{
                            for(String key: NEBnext_multiplex_i5_G2.keySet()){
                                if(s.equals(key) && !tab[index].equals(s)){
                                    String index_i5 = NEBnext_multiplex_i5_G2.get(key);
                                    for(int j=0;j<tab.length;j++){
                                        if(tab[j].equals(s)){
                                            //System.out.println(tab[j]);
                                            index1 = j;
                                            //System.out.println(index1);
                                            break;
                                }
                            }
                        
                        
                            wordList.add(index1+2, index_i5);
                        
                            }
                
                
               
                            }
                            }

                        case "Dovetail":
                            
                            for(String key : Dovetail_DNA_Indexes_i7.keySet()){
                                if(s.equals(key) && flag==0){
                                    String index_i7 = Dovetail_DNA_Indexes_i7.get(key);
                                    for (int i=0;i<tab.length;i++) {
                                        if (tab[i].equals(s)) {
                                            index = i;
                                            //System.out.println(index);
                                            break;
                                        }
                                    }
                                wordList.add(index+1, index_i7);
                                flag = flag + 1;
                                }
                            }
                            if(flaga == 0){
                                for(String key: Dovetail_DNA_Indexes_i5_G1.keySet()){
                                    if(s.equals(key) && !tab[index].equals(s)){
                                        String index_i5 = Dovetail_DNA_Indexes_i5_G1.get(key);
                                        for(int j=0;j<tab.length;j++){
                                            if(tab[j].equals(s)){
                                                //System.out.println(tab[j]);
                                                index1 = j;
                                                //System.out.println(index1);
                                                break;
                                    }
                                }
                        
                        
                                wordList.add(index1+2, index_i5);
                        
                            }
                
                
               
                        }
                        }
                        else{
                            for(String key: Dovetail_DNA_Indexes_i5_G2.keySet()){
                                if(s.equals(key) && !tab[index].equals(s)){
                                    String index_i5 = Dovetail_DNA_Indexes_i5_G2.get(key);
                                    for(int j=0;j<tab.length;j++){
                                        if(tab[j].equals(s)){
                                            //System.out.println(tab[j]);
                                            index1 = j;
                                            //System.out.println(index1);
                                            break;
                                }
                            }
                    
                    
                            wordList.add(index1+2, index_i5);
                    
                            }
            
            
           
                            }
                            }

                        case "SureSelect":
                            
                            for(String key : Agilent_SureSelect_i7.keySet()){
                                if(s.equals(key) && flag==0){
                                    String index_i7 = Agilent_SureSelect_i7.get(key);
                                    for (int i=0;i<tab.length;i++) {
                                        if (tab[i].equals(s)) {
                                            index = i;
                                            //System.out.println(index);
                                            break;
                                        }
                                    }
                                wordList.add(index+1, index_i7);
                                flag = flag + 1;
                                }
                            }
                            if(flaga == 0){
                                for(String key: Agilent_SureSelect_i5_G1.keySet()){
                                    if(s.equals(key) && !tab[index].equals(s)){
                                        String index_i5 = Agilent_SureSelect_i5_G1.get(key);
                                        for(int j=0;j<tab.length;j++){
                                            if(tab[j].equals(s)){
                                                //System.out.println(tab[j]);
                                                index1 = j;
                                                //System.out.println(index1);
                                            break;
                                }
                            }
                    
                    
                            wordList.add(index1+2, index_i5);
                    
                        }
            
            
           
                    }
                    }
                    else{
                        for(String key: Agilent_SureSelect_i5_G2.keySet()){
                            if(s.equals(key) && !tab[index].equals(s)){
                                String index_i5 = Agilent_SureSelect_i5_G2.get(key);
                                for(int j=0;j<tab.length;j++){
                                    if(tab[j].equals(s)){
                                        //System.out.println(tab[j]);
                                        index1 = j;
                                        //System.out.println(index1);
                                        break;
                            }
                        }
                
                
                        wordList.add(index1+2, index_i5);
                
                        }
        
        
       
                        }
                        }
                }
            }
            }
            else {
                for(String t: adapters){
                switch(t){
                    case "Nextera":
                        for(String key : Nextera_Indexes_i7.keySet()){
                            if(s.equals(key)){
                                String index_i7 = Nextera_Indexes_i7.get(key);
                                for (int i=0;i<tab.length;i++) {
                                    if (tab[i].equals(s)) {
                                        index = i;
                                        break;
                                    }
                                }
                                wordList.add(index+1, index_i7);
                            }
                        }
                        //String[] linia = new String[wordList.size()];
                        //linia = wordList.toArray(linia);
                        //data.add(linia);
                    case "TruSeq":
                        for(String key : TruSeq_DNA_Indexes_i7.keySet()){
                            if(s.equals(key)){
                                String index_i7 = TruSeq_DNA_Indexes_i7.get(key);
                                for (int i=0;i<tab.length;i++) {
                                    if (tab[i].equals(s)) {
                                        index = i;
                                        break;
                                    }
                                }
                                wordList.add(index+1, index_i7);
                            }
                        }
                    case "AmpliSeq":
                        for(String key : AmpliSeq_DNA_Indexes_i7.keySet()){
                            if(s.equals(key)){
                                String index_i7 = AmpliSeq_DNA_Indexes_i7.get(key);
                                for (int i=0;i<tab.length;i++) {
                                    if (tab[i].equals(s)) {
                                        index = i;
                                        break;
                                    }
                                }
                                wordList.add(index+1, index_i7);
                            }
                        }
                    case "NEBNext":
                        for(String key : NEBnext_multiplex_i7.keySet()){
                            if(s.equals(key)){
                                String index_i7 = NEBnext_multiplex_i7.get(key);
                                for (int i=0;i<tab.length;i++) {
                                    if (tab[i].equals(s)) {
                                        index = i;
                                        break;
                                    }
                                }
                                wordList.add(index+1, index_i7);
                            }
                        }
                    case "Dovetail":
                        for(String key : Dovetail_DNA_Indexes_i7.keySet()){
                            if(s.equals(key)){
                                String index_i7 = Dovetail_DNA_Indexes_i7.get(key);
                                for (int i=0;i<tab.length;i++) {
                                    if (tab[i].equals(s)) {
                                        index = i;
                                        break;
                                    }
                                }
                                wordList.add(index+1, index_i7);
                            }
                        }
                    case "SureSelect XT HS2":
                        for(String key : Dovetail_DNA_Indexes_i7.keySet()){
                            if(s.equals(key)){
                                String index_i7 = Dovetail_DNA_Indexes_i7.get(key);
                                for (int i=0;i<tab.length;i++) {
                                    if (tab[i].equals(s)) {
                                        index = i;
                                        break;
                                    }
                                }
                                wordList.add(index+1, index_i7);
                            }
                        }
                }
            }
            }

          }
          String[] linia = new String[wordList.size()];
          linia = wordList.toArray(linia);
          data.add(linia);

        }
    

        System.out.println("");
        System.out.println("################################# Your file is being created #####################################");
        System.out.println("");

        long startTime = System.currentTimeMillis();
        long duration = (10 * 1000);
    
        do {
            System.out.println("#...");
            Thread.sleep(2000);
        } while ((System.currentTimeMillis() - startTime) < duration);
        
     
        System.out.println("");
        System.out.println("#################################### Your file is ready! ########################################");
        System.out.println("");
       

        // ##########################################################################
        // ##                           Saving to csv part                         ##
        // ##########################################################################  

        
        File file = new File(filepath);

        try {
            FileWriter outputfile = new FileWriter(file);
        
            CSVWriter writer = new CSVWriter(outputfile);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

            String[] header = {"[Header]"};
            String[] date = {"Date", LocalDate.now().format(formatter)};

            writer.writeNext(header);
            
            if(!(exp_name.isEmpty())){
                String[] experiment = {"Experiment name", exp_name};
                writer.writeNext(experiment);
            }
            
                       
            writer.writeNext(date);


            String[] workflow_d = {"Workflow", workflow};

            writer.writeNext(workflow_d);

            if(!(invest_name.isEmpty())){
                String[] investigator = {"Investigator", invest_name};
                writer.writeNext(investigator);
            }
            
            
            if(!(project_name.isEmpty())){
                String[] project = {"Project", project_name};
                writer.writeNext(project);
            }


            if(!(app_name.isEmpty())){
                String[] application = {"Application", app_name};
                writer.writeNext(application);
            }


            if(!(ins_name.isEmpty())){
                String[] instrument = {"Instrument", ins_name};
                writer.writeNext(instrument);
            }


            if(!(assay_name.isEmpty())){
                String[] assay = {"Assay", assay_name};
                writer.writeNext(assay);
            }


            if(!(adapt_name.isEmpty())){
                String[] adapter = {"Index Adapters", adapt_name};
                writer.writeNext(adapter);
            }



            if(!(chem_name.isEmpty())){
                String[] chemistry = {"Chemistry", chem_name};
                writer.writeNext(chemistry);
            }


            String[] przerwa = {"\n"};


            writer.writeNext(przerwa);

            String[] reads_r = {"[Reads]"};

            writer.writeNext(reads_r);

            if(reads[0].equals("SI")){
                String[] reads_SI = {reads[1]};
                writer.writeNext(reads_SI);
            }
            else{
                String[] reads_DI1 = {reads[1]};
                String[] reads_DI2 = {reads[2]};
                writer.writeNext(reads_DI1);
                writer.writeNext(reads_DI2);
            }



            writer.writeNext(przerwa);

            
            String[] data_d = {"[Data]"};

            
            writer.writeNext(data_d);

            List<String> lista_data = new ArrayList<String>();
                    
            if(lane_yn.equals("Yes")){
                lista_data.add("Lane");

            }

            lista_data.add("Sample_ID");

            if(sam_name_yn.equals("Yes")){
                lista_data.add("Sample_Name");
            }

            if(sam_plate_yn.equals("Yes")){
                lista_data.add("Sample_Plate");
            }

            if(sam_well_yn.equals("Yes")){
                lista_data.add("Sample_Well");
            }

            if(ind_well_yn.equals("Yes")){
                lista_data.add("Index_Plate_Well");
            }


            lista_data.add("I7_Index_ID");
            lista_data.add("index");

            if(reads[0].equals("DI")){
                lista_data.add("I5_Index_ID");
                lista_data.add("index2");
            }


            if(sam_project_yn.equals("Yes")){
                lista_data.add("Sample_Project");
            }


            if(description_yn.equals("Yes")){
                lista_data.add("Description");
            }

            String[] output = lista_data.toArray(new String[lista_data.size()]);

            writer.writeNext(output);
            
            writer.writeAll(data);

         
            writer.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
}