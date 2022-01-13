package com.byu.utsbayu;

import static com.byu.utsbayu.R.string.jangseldesc;

import android.content.Context;

import com.byu.utsbayu.model.Belalang;
import com.byu.utsbayu.model.Hewan;
import com.byu.utsbayu.model.Jangkrik;
import com.byu.utsbayu.model.Kupukupu;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Jangkrik> initDataJangkrik(Context ctx) {
        List<Jangkrik> jangkriks = new ArrayList<>();
        jangkriks.add(new Jangkrik(ctx.getString(R.string.jangkrikkal), ctx.getString(R.string.bebatuan),
                ctx.getString(R.string.jangdes), R.drawable.jangkrik1));
        jangkriks.add(new Jangkrik(ctx.getString(R.string.jangkal), ctx.getString(R.string.jerami),
                ctx.getString(R.string.jangkaldesc), R.drawable.jangkrik2));
        jangkriks.add(new Jangkrik(ctx.getString(R.string.janglung), ctx.getString(R.string.sawah),
                ctx.getString(R.string.janglungdesc), R.drawable.jangkrik3));
        jangkriks.add(new Jangkrik(ctx.getString(R.string.janglam), ctx.getString(R.string.alam),
                ctx.getString(R.string.janglamdesc), R.drawable.jangkrik4));
        jangkriks.add(new Jangkrik(ctx.getString(R.string.jangsel), ctx.getString(R.string.indo),
                ctx.getString(jangseldesc), R.drawable.jangkrik5));
        jangkriks.add(new Jangkrik(ctx.getString(R.string.jangmad), ctx.getString(R.string.jamaika),
                ctx.getString(R.string.jangmaddesc), R.drawable.jangkrik6));
        return jangkriks;
    }

    private static List<Belalang> initDataBelalang(Context ctx) {
        List<Belalang> belalangs = new ArrayList<>();
        belalangs.add(new Belalang(ctx.getString(R.string.belkay), ctx.getString(R.string.hutan),
                ctx.getString(R.string.descbelkay), R.drawable.belalang1));
        belalangs.add(new Belalang(ctx.getString(R.string.belsem), ctx.getString(R.string.cina),
                ctx.getString(R.string.descbelsem), R.drawable.belalang2));
        belalangs.add(new Belalang(ctx.getString(R.string.belhij), ctx.getString(R.string.sawah),
                ctx.getString(R.string.descbelhij), R.drawable.belalang3));
        belalangs.add(new Belalang(ctx.getString(R.string.belbat), ctx.getString(R.string.batu),
                ctx.getString(R.string.desbelbat), R.drawable.belalang4));
        belalangs.add(new Belalang(ctx.getString(R.string.beldan), ctx.getString(R.string.daun),
                ctx.getString(R.string.desbeldat), R.drawable.belalang5));
        belalangs.add(new Belalang(ctx.getString(R.string.clad), ctx.getString(R.string.dunia),
                ctx.getString(R.string.desclad), R.drawable.belalang6));
        return belalangs;
    }

    private static List<Kupukupu> initDataKupukupu(Context ctx) {
        List<Kupukupu> kupukupus = new ArrayList<>();
        kupukupus.add(new Kupukupu(ctx.getString(R.string.kupuraja), ctx.getString(R.string.berazil),
                ctx.getString(R.string.deskupuraja), R.drawable.bf1));
        kupukupus.add(new Kupukupu(ctx.getString(R.string.kupusayap), ctx.getString(R.string.ekuador),
                ctx.getString(R.string.deskupusayap), R.drawable.bf2));
        kupukupus.add(new Kupukupu(ctx.getString(R.string.kupuspic), ctx.getString(R.string.nikaragua),
                ctx.getString(R.string.deskupuspic), R.drawable.bf3));
        kupukupus.add(new Kupukupu(ctx.getString(R.string.kupukaiser), ctx.getString(R.string.amerikateang),
                ctx.getString(R.string.deskupukaisar), R.drawable.bf4));
        kupukupus.add(new Kupukupu(ctx.getString(R.string.kupucey), ctx.getString(R.string.kolombia),
                ctx.getString(R.string.deskupucey), R.drawable.bf5));
        kupukupus.add(new Kupukupu(ctx.getString(R.string.kupuswallo), ctx.getString(R.string.jamaika),
                ctx.getString(R.string.deskupuswallo), R.drawable.bf6));
        return kupukupus;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataJangkrik(ctx));
        hewans.addAll(initDataBelalang(ctx));
        hewans.addAll(initDataKupukupu(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
