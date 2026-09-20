package com.spotify.listplatform.sortingimpl;

import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.s9k;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/listplatform/sortingimpl/SortingModelJsonAdapter;", "Lp/hk60;", "Lcom/spotify/listplatform/sortingimpl/SortingModel;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_listplatform_sortingimpl-sortingimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SortingModelJsonAdapter extends hk60<SortingModel> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f5117a = xl60.C2578b.m91389a("map");

    /* JADX INFO: renamed from: b */
    public final hk60 f5118b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor f5119c;

    public SortingModelJsonAdapter(p0i0 p0i0Var) {
        this.f5118b = p0i0Var.m68706f(mp91.m62457j(Map.class, s9k.class, String.class), gbu.f78413a, "map");
    }

    @Override // p204p.hk60
    public final SortingModel fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        Map map = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f5117a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                map = (Map) this.f5118b.fromJson(xl60Var);
                i = -2;
            }
        }
        xl60Var.mo51078f();
        if (i == -2) {
            return new SortingModel(map);
        }
        Constructor declaredConstructor = this.f5119c;
        if (declaredConstructor == null) {
            declaredConstructor = SortingModel.class.getDeclaredConstructor(Map.class, Integer.TYPE, f0b1.f64588c);
            this.f5119c = declaredConstructor;
        }
        return (SortingModel) declaredConstructor.newInstance(map, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, SortingModel sortingModel) {
        SortingModel sortingModel2 = sortingModel;
        if (sortingModel2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("map");
        this.f5118b.toJson(rm60Var, sortingModel2.f5116a);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(34, "GeneratedJsonAdapter(SortingModel)");
    }
}
