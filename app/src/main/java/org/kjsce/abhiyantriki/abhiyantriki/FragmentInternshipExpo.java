package org.kjsce.abhiyantriki.abhiyantriki;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

public class FragmentInternshipExpo extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_internship_expo, container, false);

        //Attach onClickListener to Know More
        TextView knowMore=v.findViewById(R.id.know);
        knowMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://drive.google.com/drive/folders/1E-ylz6EYvcXZyBIuvHprw12JSssOIodw";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        //Attach onClickListener to Participate As Company
        TextView participateCompany=v.findViewById(R.id.company);
        participateCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://docs.google.com/forms/d/e/1FAIpQLSdz6z2V_ySsPIWrxU3Xlpo0xHpbNYLjVoiwYZQ9NbDEiJp0_A/closedform";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        //Attach onClickListener to Participate As Student
        TextView participateStudent=v.findViewById(R.id.student);
        knowMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://docs.google.com/forms/d/e/1FAIpQLSeKxktX9hiG5thb7jnrm3lpKyPFva4P9CXu_WWC6wmL6p6AfQ/closedform";
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        return v;
    }
}
