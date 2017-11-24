package com.vikascountries;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.vikascountries.app.AppController;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{
    // private static final String url = "http://192.168.56.1/albumfinal.json";

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private AlbumAdapter albumAdapter;
    RequestQueue queue;

    //private String url="https://app-1486707345.000webhostapp.com/mrbean.json";
    private ArrayList<Album> list=new ArrayList<>();
//    private ArrayList<Currency> curr=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        list=new ArrayList<>();
        albumAdapter=new AlbumAdapter(this,list);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(albumAdapter);

        queue= AppController.getInstance().getRequestQueue();

        preparealbums();

    }

    public  void preparealbums(){
        String url="https://restcountries.eu/rest/v2/all";


        JsonArrayRequest movieReq = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d(TAG, response.toString());


                        // Parsing json
                        for (int i = 0; i < response.length(); i++) {
                            try {

                                JSONObject obj = response.getJSONObject(i);
                                Album movie = new Album(obj.getString("name"),
                                        obj.getString("alpha2Code"),obj.getString("alpha3Code"),
                                        obj.getString("capital"),
                                        obj.getString("region"),obj.getString("subregion"),
                                        obj.getLong("population"),
                                        obj.getString("demonym"),obj.getLong("area"),obj.getDouble("gini"),

                                        obj.getString("nativeName"),obj.getString("numericCode"),
                                        obj.getString("flag"),obj.getString("cioc")
                                );
                                JSONArray cur=obj.getJSONArray("currencies");
                                String co="",na="",symb="";
                                for(int k=0;k<cur.length();k++)
                                {
                                 JSONObject nakol=cur.getJSONObject(k);
                                 co=nakol.getString("code");
                                 na=nakol.getString("name");
                                 symb=nakol.getString("symbol");
                                }
                                movie.setCode(co);
                                movie.setName2(na);
                                movie.setSymbol(symb);
                                JSONArray lan=obj.getJSONArray("languages");

                                String iso1="",iso2="",namelan="",natname="";
                                for(int k=0;k<lan.length();k++)
                                {
                                    JSONObject nakol=lan.getJSONObject(k);
                                    iso1=nakol.getString("iso639_1");
                                    iso2=nakol.getString("iso639_2");
                                    namelan=nakol.getString("name");
                                    natname=nakol.getString("nativeName");
                                }
                                movie.setIso1(iso1);
                                movie.setIso2(iso2);
                                movie.setNamelan(namelan);
                                movie.setNatname(natname);
                                String de="",es="",ja="",ita="",fra="",br="",nl="",pt="",hr="",fa="";
                                JSONObject alltowerslist=obj.getJSONObject("translations");

                                    de=alltowerslist.getString("de");
                                    es=alltowerslist.getString("es");
                                    fra=alltowerslist.getString("fr");
                                    ja=alltowerslist.getString("ja");
                                    ita=alltowerslist.getString("it");
                                    br=alltowerslist.getString("br");
                                    pt=alltowerslist.getString("pt");
                                    nl=alltowerslist.getString("nl");
                                    hr=alltowerslist.getString("hr");
                                    fa=alltowerslist.getString("fa");

                                movie.setDe(de);
                                movie.setEs(es);
                                movie.setFra(fra);
                                movie.setJa(ja);
                                movie.setIta(ita);
                                movie.setBr(br);
                                movie.setPt(pt);
                                movie.setNl(nl);
                                movie.setHr(hr);
                                movie.setFa(fa);
                                JSONArray regionalBlocs=obj.getJSONArray("regionalBlocs");

                                String acronym="",nameregional="",othacronym="",othnames="";
                                for(int k=0;k<regionalBlocs.length();k++)
                                {
                                    JSONObject nakol=regionalBlocs.getJSONObject(k);
                                    acronym=nakol.getString("acronym");
                                    nameregional=nakol.getString("name");
                                    othacronym=nakol.getString("otherAcronyms");
                                    othnames=nakol.getString("otherNames");


                                }
                                movie.setAcronym(acronym);
                                movie.setRegname(nameregional);
                                movie.setOtheracronym(othacronym);
                                movie.setOthername(othnames);
                                JSONArray topleveldomain = obj.getJSONArray("topLevelDomain");
                                ArrayList<String> topdomain = new ArrayList<String>();
                                for (int j = 0; j < topleveldomain.length(); j++) {
                                    topdomain.add((String) topleveldomain.get(j));
                                }
                                movie.setTopLevelDomain(topdomain);
                                JSONArray callingcodes = obj.getJSONArray("callingCodes");
                                ArrayList<String> call = new ArrayList<String>();
                                for (int j = 0; j < callingcodes.length(); j++) {
                                    call.add((String) callingcodes.get(j));
                                }
                                movie.setCallingCodes(call);
                                JSONArray spelling = obj.getJSONArray("altSpellings");
                                ArrayList<String> spell = new ArrayList<String>();
                                for (int j = 0; j < spelling.length(); j++) {
                                    spell.add((String) spelling.get(j));
                                }
                                movie.setAltSpellings(spell);
                                JSONArray latln = obj.getJSONArray("latlng");
                                ArrayList<Double> lat = new ArrayList<Double>();
                                for (int j = 0; j < latln.length(); j++) {
                                    lat.add((Double) latln.get(j));
                                }
                                movie.setLatlng(lat);
                                JSONArray zones = obj.getJSONArray("timezones");
                                ArrayList<String> tzo = new ArrayList<String>();
                                for (int j = 0; j < zones.length(); j++) {
                                    tzo.add((String) zones.get(j));
                                }
                                movie.setTimezones(tzo);
                                JSONArray bor = obj.getJSONArray("borders");
                                ArrayList<String> bord = new ArrayList<String>();
                                for (int j = 0; j < bor.length(); j++) {
                                    bord.add((String) bor.get(j));
                                }
                                movie.setBorders(bord);



                           /*     JSONArray genreArry = obj.getJSONArray("genre");
                                ArrayList<String> genre = new ArrayList<String>();
                                for (int j = 0; j < genreArry.length(); j++) {
                                    genre.add((String) genreArry.get(j));
                                }
                                movie.setGenre(genre);
                             */   list.add(movie);

                            }
                            catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                        // notifying list adapter about data changes
                        // so that it renders the list view with updated data
                        albumAdapter.notifyDataSetChanged();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());


            }
        });

        // Adding request to request queue
        queue.add(movieReq);

    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        newText=newText.toLowerCase();
        ArrayList<Album> arrayListp=new ArrayList<>();
        for(Album album:list){
           String name=album.getName().toLowerCase();
           if(name.contains(newText))
               arrayListp.add(album);
        }
        albumAdapter.setfilter(arrayListp);
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);

        MenuItem menuItem=menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) MenuItemCompat.getActionView(menuItem);
        searchView.setQueryHint("Search Country name");
        searchView.setOnQueryTextListener(this);
        return true;
    }


}
