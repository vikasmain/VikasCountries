package com.vikascountries;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import java.util.ArrayList;

/**
 * Created by dell on 12/30/2016.
 */
public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.MyViewHolder> {
      Context context;
      ArrayList<Album> albumList=new ArrayList<>();

    public class MyViewHolder extends RecyclerView.ViewHolder  {
      public TextView gl,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14;
          Context cptx;
          ImageLoader imageLoader;

          public NetworkImageView thumbnail;
      ArrayList<Album> albumList=new ArrayList<>();

      public MyViewHolder(View itemView) {
          super(itemView);
          this.albumList=albumList;

//          thumbnail = (NetworkImageView) itemView.findViewById(R.id.thumbnail);
//          thumbnail.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
//          thumbnail.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
//          try
//          {
    //         SVG svg = SVG.getFromResource(this, R.raw.album);
//              Drawable drawable = new PictureDrawable(svg.renderToPicture());
//              thumbnail.setImageDrawable(drawable);
//          }
//          catch(SVGParseException e)
//          {
//
//          }


          gl=(TextView)itemView.findViewById(R.id.goi);


//          g2=(TextView)itemView.findViewById(R.id.goi1);
//          g3=(TextView)itemView.findViewById(R.id.goi2);
//          g4=(TextView)itemView.findViewById(R.id.goi3);
//          g5=(TextView)itemView.findViewById(R.id.goi4);
//          g6=(TextView)itemView.findViewById(R.id.goi5);
//          g7=(TextView)itemView.findViewById(R.id.goi6);
//          g8=(TextView)itemView.findViewById(R.id.goi7);
//          g9=(TextView)itemView.findViewById(R.id.goi8);
//          g10=(TextView)itemView.findViewById(R.id.goi10);
//          g11=(TextView)itemView.findViewById(R.id.goi11);
//          g12=(TextView)itemView.findViewById(R.id.goi12);
//          g13=(TextView)itemView.findViewById(R.id.goi13);
//          g14=(TextView)itemView.findViewById(R.id.goi14);


      }





  }
    public AlbumAdapter(Context context, ArrayList<Album> albumList){
        this.context=context;
        this.albumList=albumList;
    }
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewtype){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_card,parent,false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final AlbumAdapter.MyViewHolder holder, final int position) {
       final Album album = albumList.get(position);

       //        if (holder.imageLoader == null)
//            holder.imageLoader = AppController.getInstance().getImageLoader();
//        holder.thumbnail.setImageUrl(album.getFlag(),holder.imageLoader);
        holder.gl.setText(album.getName());
//        holder.g2.setText(album.getAlpha2Code());
//        holder.g3.setText(album.getAlpha3Code());
//        holder.g4.setText(album.getCapital());
//        holder.g5.setText(album.getCioc());
//        holder.g6.setText(album.getDemonym());
//        holder.g7.setText(album.getRegion());
//        holder.g8.setText(album.getSubregion());
//        holder.g9.setText(album.getCioc());
//        holder.g10.setText(album.getNativeName());
//        holder.g11.setText(""+album.getArea());
//        holder.g12.setText(""+album.getGini());
//
//        holder.g13.setText(""+album.getNumericCode());
//        holder.g14.setText(""+album.getTopLevelDomain());
                holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,DetailsActivity.class);
                intent.putExtra("name",album.getName());
                intent.putExtra("alpha2code",album.getAlpha2Code());
                intent.putExtra("alpha3code",album.getAlpha3Code());
                intent.putExtra("area",album.getArea());
                intent.putExtra("capital",album.getCapital());
                intent.putExtra("cioc",album.getCioc());
                intent.putExtra("demonym",album.getDemonym());
                intent.putExtra("gini",album.getGini());
                intent.putExtra("nativename",album.getNativeName());
                intent.putExtra("numericcode",album.getNumericCode());
                intent.putExtra("flag",album.getFlag());
                intent.putExtra("topLevelDomain",album.getTopLevelDomain());
                intent.putExtra("callingCodes",album.getCallingCodes());
                intent.putExtra("altSpellings",album.getAltSpellings());
                intent.putExtra("latlng",album.getLatlng());
                intent.putExtra("borders",album.getBorders());
                intent.putExtra("timezones",album.getTimezones());
                intent.putExtra("region",album.getRegion());
                intent.putExtra("subregion",album.getSubregion());
                intent.putExtra("population",album.getPopulation());
                intent.putExtra("code",album.getCode());
                intent.putExtra("name2",album.getName2());
                intent.putExtra("symbol",album.getSymbol());
                intent.putExtra("iso1",album.getIso1());
                intent.putExtra("iso2",album.getIso2());
                intent.putExtra("lanname",album.getNamelan());
                intent.putExtra("natname",album.getNatname());
                intent.putExtra("de",album.getDe());
                intent.putExtra("es",album.getEs());
                intent.putExtra("fr",album.getFra());
                intent.putExtra("ja",album.getJa());
                intent.putExtra("it",album.getIta());
                intent.putExtra("br",album.getBr());
                intent.putExtra("pt",album.getPt());
                intent.putExtra("nl",album.getNl());
                intent.putExtra("hr",album.getHr());
                intent.putExtra("fa",album.getFa());
                intent.putExtra("acronym",album.getAcronym());
                intent.putExtra("regname",album.getRegname());
                intent.putExtra("othacronym",album.getOtheracronym());
                intent.putExtra("othname",album.getOthername());
                //                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
//                intent.putExtra("alpha2code",album.getAlpha2Code());
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }

public void setfilter(ArrayList<Album> newlist){
    albumList=new ArrayList<>();
    albumList.addAll(newlist);
    notifyDataSetChanged();
}

}
