package com.example.team46;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class TeamMembers extends AppCompatActivity {
    private RecyclerView mMembers;
    public MemberRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_members);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        ArrayList<Members> members = initMembers();

        mMembers = findViewById(R.id.member_list);
        RecyclerView.LayoutManager memberManager = new LinearLayoutManager(this);
        mMembers.setLayoutManager(memberManager);

        mAdapter = new MemberRecyclerAdapter(members);
        mMembers.setAdapter(mAdapter);


    }

    private ArrayList<Members> initMembers() {
        ArrayList<Members> list = new ArrayList<>();
        list.add(new Members("Wilfred Omuvwie", "Bayelsa State", "https://res.cloudinary.com/dawillzy/image/upload/v1571331860/samples/IMG_20190801_182311_pbtyep.jpg"));
        list.add(new Members ("Chika Ani", "Portharcourt", "https://res.cloudinary.com/dawillzy/image/upload/v1571326675/chika_ani_vlkjca.jpg"));
        list.add(new Members("Plang Dakon", "Jos", "https://res.cloudinary.com/dawillzy/image/upload/v1571326675/dakon_plang_josiah_t2vp1h.jpg"));
        list.add(new Members("Adigun Alo", "Abia", "https://res.cloudinary.com/dawillzy/image/upload/v1571326675/adigun_alo_xumrey.jpg"));
        list.add(new Members("Omotola Ibukunoluwa", "Jos", "https://res.cloudinary.com/dawillzy/image/upload/v1571326553/omotola_ibukunoluwa_jos_jcgidf.jpg"));
        list.add(new Members("Abdulsalam Opeyemi", "Lagos", "https://res.cloudinary.com/dawillzy/image/upload/v1571332228/abdulsalam_opeyemi_lag_azxdjz.jpg"));
        list.add(new Members("Emmanuel Ani Linus", "Enugu", "https://res.cloudinary.com/dawillzy/image/upload/v1571326552/emmanuel_ani_linus_enugu_nw3ppd.jpg"));
        list.add(new Members("Umar Saidu Auna", "Kano", "https://res.cloudinary.com/dawillzy/image/upload/v1571326552/umar_saidu_auna_kano_mksprq.png"));
        list.add(new Members("Ligali Farouk", "Abuja", "https://res.cloudinary.com/dawillzy/image/upload/v1571326552/ligali_farouk_abj_dvkhbp.jpg"));
        list.add(new Members("Oluwawibe Christian", "Lagos", "https://res.cloudinary.com/dawillzy/image/upload/v1571326552/oluwawibe_christian_lagos_yydu4y.jpg"));
        list.add(new Members("Maduabughichi Achilefu", "Portharcourt", "https://res.cloudinary.com/dawillzy/image/upload/v1571326552/maduabughichi_achilefu_ph_kmaszn.jpg"));
        list.add(new Members("Ibrahim Lasisi", "Ogun State", "https://res.cloudinary.com/dawillzy/image/upload/v1571326552/ibrahim_lasisi_ogun_marck7.jpg"));
        list.add(new Members("Gabriel Edet", "Akwa Ibom State", "https://res.cloudinary.com/dawillzy/image/upload/v1571331860/samples/gabriel_beydie.jpg"));

        return list;
    }

}
