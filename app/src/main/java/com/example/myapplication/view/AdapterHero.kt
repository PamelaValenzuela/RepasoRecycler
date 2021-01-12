package com.example.myapplication.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.dataclass.Superhero
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class AdapterHero(var mDataSet: List<Superhero>):RecyclerView.Adapter<AdapterHero.ViewHolderHero>() {

    class ViewHolderHero(itemView : View):RecyclerView.ViewHolder(itemView) {
        //hay que especificar que tipo de dato es
    var imageHero: ImageView= itemView.findViewById(R.id.image_hero)
        var textName : TextView =itemView.findViewById(R.id.textnamehero)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHero {
        return ViewHolderHero(LayoutInflater.from(parent.context).inflate(R.layout.hero_viewholder,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolderHero, position: Int) {
        var mHero=mDataSet[position]
        holder.textName.text= mHero.name
        Picasso.get().load(mHero.images.md).into(holder.imageHero)
    }

    override fun getItemCount(): Int {
       return mDataSet.size
    }


}