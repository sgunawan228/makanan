package com.example.aplikasimobilebagon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class makananAdapter extends RecyclerView.Adapter<makananAdapter.makananViewHolder> {

    private ArrayList<makanan> dataList;
    //getcontext
    private Context mcon;
    public makananAdapter(Context con, ArrayList<makanan> dataList){
        mcon = con;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public makananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_makanan, parent, false);
        return new makananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull makananViewHolder holder, final int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtDesc.setText(dataList.get(position).getDeskripsi());
        holder.txtHrg.setText(dataList.get(position).getHarga());
        holder.gambar.setImageResource(mcon.getResources().getIdentifier(dataList.get(position).getGambar(), "drawable", mcon.getPackageName()));
        //add onclick (set itemview as onclick)
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast myMsg = Toast.makeText(mcon, dataList.get(position).getNama(),Toast.LENGTH_SHORT);
//                myMsg.show();
                //send data to detail_activity
                String[] mydata = {dataList.get(position).getNama(), dataList.get(position).getDeskripsi(),
                                    dataList.get(position).getHarga(), dataList.get(position).getGambar()};
                Intent detail = new Intent(mcon, detail_activity.class);
                detail.putExtra("MYDATA", mydata);
                mcon.startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class makananViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtDesc, txtHrg, txtGbr;
        private ImageView gambar;
        public makananViewHolder(View itemView){
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txtNamaMakanan);
            txtDesc = (TextView) itemView.findViewById(R.id.txtDescMakanan);
            txtHrg = (TextView) itemView.findViewById(R.id.txtHrgMakanan);
            gambar = (ImageView) itemView.findViewById(R.id.GbrCard);
//            txtGbr = (TextView) itemView.findViewById(R.id.txtGbrMakanan);
        }
    }


}
