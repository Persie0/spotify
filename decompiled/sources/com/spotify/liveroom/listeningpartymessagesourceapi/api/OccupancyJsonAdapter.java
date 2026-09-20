package com.spotify.liveroom.listeningpartymessagesourceapi.api;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/OccupancyJsonAdapter;", "Lp/hk60;", "Lcom/spotify/liveroom/listeningpartymessagesourceapi/api/Occupancy;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_liveroom_listeningpartymessagesourceapi-listeningpartymessagesourceapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OccupancyJsonAdapter extends hk60<Occupancy> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f5237a = xl60.C2578b.m91389a("partyUri", "totalOccupancy", "leanbackOccupancy", "interactiveOccupancy", "isInteractiveFull");

    /* JADX INFO: renamed from: b */
    public final hk60 f5238b;

    /* JADX INFO: renamed from: c */
    public final hk60 f5239c;

    /* JADX INFO: renamed from: d */
    public final hk60 f5240d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f5241e;

    public OccupancyJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f5238b = p0i0Var.m68706f(String.class, gbuVar, "partyUri");
        this.f5239c = p0i0Var.m68706f(Integer.class, gbuVar, "totalOccupancy");
        this.f5240d = p0i0Var.m68706f(Boolean.class, gbuVar, "isInteractiveFull");
    }

    @Override // p204p.hk60
    public final Occupancy fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f5237a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f5238b.fromJson(xl60Var);
                i &= -2;
            } else if (iMo51071K == 1) {
                num = (Integer) this.f5239c.fromJson(xl60Var);
                i &= -3;
            } else if (iMo51071K == 2) {
                num2 = (Integer) this.f5239c.fromJson(xl60Var);
                i &= -5;
            } else if (iMo51071K == 3) {
                num3 = (Integer) this.f5239c.fromJson(xl60Var);
                i &= -9;
            } else if (iMo51071K == 4) {
                bool = (Boolean) this.f5240d.fromJson(xl60Var);
                i &= -17;
            }
        }
        xl60Var.mo51078f();
        if (i == -32) {
            Boolean bool2 = bool;
            Integer num4 = num3;
            return new Occupancy(str, num, num2, num4, bool2);
        }
        Boolean bool3 = bool;
        Integer num5 = num3;
        Integer num6 = num2;
        Integer num7 = num;
        String str2 = str;
        Constructor declaredConstructor = this.f5241e;
        if (declaredConstructor == null) {
            declaredConstructor = Occupancy.class.getDeclaredConstructor(String.class, Integer.class, Integer.class, Integer.class, Boolean.class, Integer.TYPE, f0b1.f64588c);
            this.f5241e = declaredConstructor;
        }
        return (Occupancy) declaredConstructor.newInstance(str2, num7, num6, num5, bool3, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Occupancy occupancy) {
        Occupancy occupancy2 = occupancy;
        if (occupancy2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("partyUri");
        this.f5238b.toJson(rm60Var, occupancy2.f5227a);
        rm60Var.mo56894s("totalOccupancy");
        Integer num = occupancy2.f5228b;
        hk60 hk60Var = this.f5239c;
        hk60Var.toJson(rm60Var, num);
        rm60Var.mo56894s("leanbackOccupancy");
        hk60Var.toJson(rm60Var, occupancy2.f5229c);
        rm60Var.mo56894s("interactiveOccupancy");
        hk60Var.toJson(rm60Var, occupancy2.f5230d);
        rm60Var.mo56894s("isInteractiveFull");
        this.f5240d.toJson(rm60Var, occupancy2.f5231e);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(31, "GeneratedJsonAdapter(Occupancy)");
    }
}
