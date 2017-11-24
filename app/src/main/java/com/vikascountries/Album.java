package com.vikascountries;

import java.util.ArrayList;

/**
 * Created by dell on 12/30/2016.
 */
public class Album {

String name,alpha2Code,alpha3Code,capital,region,subregion,demonym,nativeName,flag,cioc,numericCode,
        code,name2,symbol,namelan,natname,iso1,iso2,de,es,fra,ja,ita,br,pt,nl,hr,fa,
        acronym,otheracronym,othername,regname;
long area,population;
double gini;

    public String getDe() {
        return de;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getOtheracronym() {
        return otheracronym;
    }

    public void setOtheracronym(String otheracronym) {
        this.otheracronym = otheracronym;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getRegname() {
        return regname;
    }

    public void setRegname(String regname) {
        this.regname = regname;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getFra() {
        return fra;
    }

    public void setFra(String fra) {
        this.fra = fra;
    }

    public String getJa() {
        return ja;
    }

    public void setJa(String ja) {
        this.ja = ja;
    }

    public String getIta() {
        return ita;
    }

    public void setIta(String ita) {
        this.ita = ita;
    }

    public String getBr() {
        return br;
    }

    public void setBr(String br) {
        this.br = br;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    ArrayList<String>  altSpellings,topLevelDomain,timezones,borders;
ArrayList<Double> latlng;
ArrayList<String> callingCodes,curren;

    public ArrayList<String> getCurren() {
        return curren;
    }

    public String getNamelan() {
        return namelan;
    }

    public void setNamelan(String namelan) {
        this.namelan = namelan;
    }

    public String getNatname() {
        return natname;
    }

    public void setNatname(String natname) {
        this.natname = natname;
    }

    public String getIso1() {
        return iso1;
    }

    public void setIso1(String iso1) {
        this.iso1 = iso1;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getCode() {
        return code;

    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setCurren(ArrayList<String> curren) {
        this.curren = curren;
    }

    public Album(String name, String alpha2Code,

                 String alpha3Code, String capital,
                 String region, String subregion,
                 long population, String demonym, long area,
                 double gini, String nativeName,
                 String numericCode, String flag, String cioc)
    {
        this.name=name;
        this.alpha2Code=alpha2Code;
        this.alpha3Code=alpha3Code;
        this.capital=capital;
        this.region=region;
        this.subregion=subregion;
        this.population=population;
        this.demonym=demonym;
        this.area=area;
        this.gini=gini;
        this.nativeName=nativeName;
        this.numericCode=numericCode;
        this.flag=flag;
        this.cioc=cioc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public double getGini() {
        return gini;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public ArrayList<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(ArrayList<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public ArrayList<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(ArrayList<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public ArrayList<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(ArrayList<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public ArrayList<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(ArrayList<Double> latlng) {
        this.latlng = latlng;
    }

    public ArrayList<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(ArrayList<String> timezones) {
        this.timezones = timezones;
    }

    public ArrayList<String> getBorders() {
        return borders;
    }

    public void setBorders(ArrayList<String> borders) {
        this.borders = borders;
    }


}
