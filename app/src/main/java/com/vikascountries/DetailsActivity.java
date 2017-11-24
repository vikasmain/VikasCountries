package com.vikascountries;

import android.content.Intent;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.bumptech.glide.GenericRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.resource.file.FileToStreamDecoder;
import com.caverock.androidsvg.SVG;

import java.io.InputStream;
import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    private static final String TAG = "com.vikascountries";
    TextView title,alpha2code,alpha3code,area,capital,cioc,demonym,gini,nativename,numericcode,codetext,curname,symbo,
    borders,latlg,altspell,callingcode,timezones,toplevel,region,subregion,population,iso1,iso2,natname,lanname,de,es,
    fra,pt,hr,ita,br,ja,nl,fa,acr,acname,othacr,othname;
    String tit,ap2,ap3,cap,cio,demony,nativena,image,regio,subr,numericcod,code,symbol,name,isol1,isol2,nal,natlan,det,
    frt,fat,brt,itt,hrt,ptt,est,jat,nlt,acrr,otacr,otna,nameer;
    Double gin;
    Long ar,popu;
    ImageLoader imageLoader;
    ImageView target;
    ArrayList<String> border,timezone,altspelling,topleveldomain,callingcod,latlng;
    private GenericRequestBuilder<Uri, InputStream, SVG, PictureDrawable> requestBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_layout);

        Intent intent=getIntent();
        tit=intent.getStringExtra("name");
        ap2=intent.getStringExtra("alpha2code");
        ap3=intent.getStringExtra("alpha3code");
        ar=intent.getLongExtra("area",0);

        cap=intent.getStringExtra("capital");
        regio=intent.getStringExtra("region");
        subr=intent.getStringExtra("subregion");
        popu=intent.getLongExtra("population",0);
        cio=intent.getStringExtra("cioc");
        demony=intent.getStringExtra("demonym");
        gin=intent.getDoubleExtra("gini",0);
        nativena=intent.getStringExtra("nativename");
        numericcod=intent.getStringExtra("numericcode");
        image=intent.getStringExtra("flag");
        code=intent.getStringExtra("code");
        name=intent.getStringExtra("name2");
        symbol=intent.getStringExtra("symbol");
        isol1=intent.getStringExtra("iso1");
        isol2=intent.getStringExtra("iso2");
        nal=intent.getStringExtra("lanname");
        natlan=intent.getStringExtra("natname");
        det=intent.getStringExtra("de");
        est=intent.getStringExtra("es");
        frt=intent.getStringExtra("fr");
        jat=intent.getStringExtra("ja");
        itt=intent.getStringExtra("it");
        brt=intent.getStringExtra("br");
        ptt=intent.getStringExtra("pt");
        nlt=intent.getStringExtra("nl");
        hrt=intent.getStringExtra("hr");
        fat=intent.getStringExtra("fa");
        acrr=intent.getStringExtra("acronym");
        nameer=intent.getStringExtra("regname");
        otacr=intent.getStringExtra("othacronym");
        otna=intent.getStringExtra("othname");

        //settig the texts to textviews
        border=intent.getStringArrayListExtra("borders");
        timezone=intent.getStringArrayListExtra("timezones");
        altspelling=intent.getStringArrayListExtra("altSpellings");
        topleveldomain=intent.getStringArrayListExtra("topLevelDomain");
        callingcod=intent.getStringArrayListExtra("callingCodes");
        latlng=intent.getStringArrayListExtra("latlng");
        title=(TextView)findViewById(R.id.textView12);
        toplevel=(TextView)findViewById(R.id.textView13);
        alpha2code=(TextView)findViewById(R.id.textView14);
        alpha3code=(TextView)findViewById(R.id.textView15);
        callingcode=(TextView)findViewById(R.id.textView16);
        capital=(TextView)findViewById(R.id.textView17);
        altspell=(TextView)findViewById(R.id.textView18);
        region=(TextView)findViewById(R.id.textView19);
        subregion=(TextView)findViewById(R.id.textView20);
        population=(TextView)findViewById(R.id.textView21);
        latlg=(TextView)findViewById(R.id.textView22);
        demonym=(TextView)findViewById(R.id.textView23);
        area=(TextView)findViewById(R.id.textView24);
        gini=(TextView)findViewById(R.id.textView25);
        timezones=(TextView)findViewById(R.id.textView26);
        borders=(TextView)findViewById(R.id.textView27);
        nativename=(TextView)findViewById(R.id.textView28);
        numericcode=(TextView)findViewById(R.id.textView29);
        cioc=(TextView)findViewById(R.id.textView30);
        codetext=(TextView)findViewById(R.id.textView31);
        curname=(TextView)findViewById(R.id.textView32);
        symbo=(TextView)findViewById(R.id.textView33);
        iso1=(TextView)findViewById(R.id.textView34);
        iso2=(TextView)findViewById(R.id.textView35);
        lanname=(TextView)findViewById(R.id.textView36);
        de=(TextView)findViewById(R.id.textView37);
        es=(TextView)findViewById(R.id.textView38);
        fra=(TextView)findViewById(R.id.textView39);
        acr=(TextView)findViewById(R.id.textView40);
        acname=(TextView)findViewById(R.id.textView41);
        othacr=(TextView)findViewById(R.id.textView42);
        natname=(TextView)findViewById(R.id.textView43);
        ja=(TextView)findViewById(R.id.textView44);
        ita=(TextView)findViewById(R.id.textView45);
        br=(TextView)findViewById(R.id.textView46);
        pt=(TextView)findViewById(R.id.textView47);
        nl=(TextView)findViewById(R.id.textView48);
        hr=(TextView)findViewById(R.id.textView49);
        fa=(TextView)findViewById(R.id.textView50);
        othname=(TextView)findViewById(R.id.textView52);
        target = (ImageView) findViewById(R.id.thumbnail);






        title.setText(tit);
        alpha2code.setText(ap2);
        alpha3code.setText(ap3);
        area.setText(""+ar);
        capital.setText(cap);
        cioc.setText(cio);
        demonym.setText(demony);
        gini.setText(""+gin);
        nativename.setText(nativena);
        numericcode.setText(""+numericcod);
        borders.setText(""+border);
        timezones.setText(""+timezone);
        altspell.setText(""+altspelling);
        toplevel.setText(""+topleveldomain);
        callingcode.setText(""+callingcod);
        latlg.setText(""+latlng);
        region.setText(regio);
        subregion.setText(subr);
        population.setText(""+popu);
        codetext.setText("Code: "+code);
        symbo.setText("Symbol: "+symbol);
        curname.setText("Name: "+name);
        iso1.setText("ISO639_1: "+isol1);
        iso2.setText("ISO639_2:  "+isol2);
        lanname.setText("Name: "+nal);
        natname.setText("NativeName: "+natlan);
        de.setText("de: "+det);
        es.setText("es: "+est);
        fra.setText("fr: "+frt);
        ja.setText("ja: "+jat);
        br.setText("br: "+brt);
        hr.setText("hr: "+hrt);
        pt.setText("pt: "+ptt);
        nl.setText("nl: "+nlt);
        fa.setText("fa: "+fat);
        ita.setText("it: "+itt);
        acr.setText("acronym: "+acrr);
        othacr.setText("otheracronym: "+otacr);
        othname.setText("othername: "+otna);
        acname.setText("name: "+nameer);
        requestBuilder = Glide.with(this)
                .using(Glide.buildStreamModelLoader(Uri.class, this), InputStream.class)
                .from(Uri.class)
                .as(SVG.class)
                .transcode(new SvgDrawableTranscoder(), PictureDrawable.class)
                .sourceEncoder(new StreamEncoder())
                .cacheDecoder(new FileToStreamDecoder<SVG>(new SvgDecoder()))
                .decoder(new SvgDecoder())
                .animate(android.R.anim.fade_in)
                .listener(new SvgSoftwareLayerSetter<Uri>());
    }

    @Override
    protected void onStart() {
        super.onStart();
        reload();

    }




    private void reload() {
        Log.w(TAG, "reloading");
        loadNet();
    }
    private void loadNet() {
        Uri uri = Uri.parse(image);
        requestBuilder
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                // SVG cannot be serialized so it's not worth to cache it
                .load(uri)
                .into(target);
    }
}
