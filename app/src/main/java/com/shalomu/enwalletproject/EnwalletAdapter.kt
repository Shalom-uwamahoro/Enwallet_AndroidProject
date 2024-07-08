package com.shalomu.enwalletproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EnwalletAdapter(var enwalletList: List<Enwallet>) :
        RecyclerView.Adapter<EnwalletViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnwalletViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet_list_item,parent,false)
        return EnwalletViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: EnwalletViewHolder, position: Int) {
        val enwallet = enwalletList[position]
        holder.tvIncomeName.text = enwallet.expenseName
        holder.tvIncomeItemPrice.text = enwallet.expensePrice
        holder.tvIncomeDate.text = enwallet.expenseDate

    }

    override fun getItemCount(): Int {
        return enwalletList.size
    }
}


class EnwalletViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvIncomeName = itemView.findViewById<TextView>(R.id.tvIncomeName)
    val tvIncomeItemPrice = itemView.findViewById<TextView>(R.id.tvIncomeItemPrice)
    val tvIncomeDate = itemView.findViewById<TextView>(R.id.tvIncomeDate)
}

