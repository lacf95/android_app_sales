package com.example.luisadrian.proyectointegrador.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.luisadrian.proyectointegrador.R;
import com.example.luisadrian.proyectointegrador.models.Cliente;

import java.util.ArrayList;

/**
 * Creado por LuisAdrian el 07/11/2016.
 */

public class AdapterClientes extends RecyclerView.Adapter<AdapterClientes.ViewHolderClientes>{

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private LayoutInflater layoutInflater;

    public AdapterClientes(Context context) {

        layoutInflater = LayoutInflater.from(context);

    }

    public void setClientes(ArrayList<Cliente> clientes) {

        this.clientes = clientes;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolderClientes onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.cliente_template, parent, false);
        ViewHolderClientes viewHolderClientes = new ViewHolderClientes(view);
        return viewHolderClientes;
    }

    @Override
    public void onBindViewHolder(ViewHolderClientes holder, int position) {

        Cliente currentCliente = clientes.get(position);
        holder.lblId.setText(currentCliente.getId());
        holder.lblName.setText(currentCliente.getName());
        holder.lblEmail.setText(currentCliente.getEmail());
        holder.lblPhone.setText(currentCliente.getPhone());
        holder.lblAddress.setText(currentCliente.getAddress());
    }

    @Override
    public int getItemCount() {

        return clientes.size();
    }

    static class ViewHolderClientes extends RecyclerView.ViewHolder {

        TextView lblId;
        TextView lblName;
        TextView lblEmail;
        TextView lblPhone;
        TextView lblAddress;

        public ViewHolderClientes(View itemView) {

            super(itemView);
            lblId = (TextView) itemView.findViewById(R.id.lbl_show_cliente_id);
            lblName = (TextView) itemView.findViewById(R.id.lbl_show_cliente_name);
            lblEmail = (TextView) itemView.findViewById(R.id.lbl_show_cliente_email);
            lblPhone = (TextView) itemView.findViewById(R.id.lbl_show_cliente_phone);
            lblAddress = (TextView) itemView.findViewById(R.id.lbl_show_cliente_address);
        }
    }
}
