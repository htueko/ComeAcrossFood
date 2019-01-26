package io.htueko.comeacrossfood.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import de.hdodenhof.circleimageview.CircleImageView
import io.htueko.comeacrossfood.R

class TopAdapter(private val image: ArrayList<Int>) : RecyclerView.Adapter<TopAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_card_top, parent, false)
        val rotate = AnimationUtils.loadAnimation(parent.context, R.anim.rotate_anim)
        view.startAnimation(rotate)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return image.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val image: CircleImageView = itemView.findViewById(R.id.imgView_card_top)
    }

}