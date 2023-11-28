package com.mcet.campus_connect

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MessageAdapter(val context: Context, val messageList: ArrayList<Message> ) :
    RecyclerView.Adapter<ViewHolder>{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentMessage =messageList[position]

        if(holder.javaClass == SentViewHolder::class.java) {
            //stuf of send View holder
            val viewHolder =holder as SentViewHolder
            holder.sentMessage.text =currentMessage.message
        }
        else{
            // stuf of receive  view holder
            val viewHolder = holder as ReceiveViewHolder
            holder.receiveMessage.text =currentMessage.message
        }
    }

    class SentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
      val sentMessage =itemView.findViewById<TextView>(R.id.txt_sent_message)
    }
    class ReceiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val receiveMessage =itemView.findViewById<TextView>(R.id.txt_receive_message)

    }

}