package com.mcet.campus_connect

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdatpter(val context: Context,val userList: ArrayList<user> ):
    RecyclerView.Adapter<UserAdatpter.UserViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view:View =LayoutInflater.from(context).inflate(R.layout.user_layot,parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val currentUser =userList[position]
        holder.textName. text =currentUser.name
    }
    class UserViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
         val textName =itemView.findViewById<TextView>(R.id.txt_name)
    }

}