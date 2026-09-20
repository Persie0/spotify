package com.spotify.externalintegration.http;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.wt30;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/externalintegration/http/HydrogenSubtitleJsonAdapter;", "Lp/hk60;", "Lcom/spotify/externalintegration/http/HydrogenSubtitle;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class HydrogenSubtitleJsonAdapter extends hk60<HydrogenSubtitle> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4054a = xl60.C2578b.m91389a("value", "rendering");

    /* JADX INFO: renamed from: b */
    public final hk60 f4055b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4056c;

    public HydrogenSubtitleJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4055b = p0i0Var.m68706f(String.class, gbuVar, "value");
        this.f4056c = p0i0Var.m68706f(wt30.class, gbuVar, "rendering");
    }

    @Override // p204p.hk60
    public final HydrogenSubtitle fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        wt30 wt30Var = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4054a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f4055b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("value__", "value", xl60Var);
                }
            } else if (iMo51071K == 1 && (wt30Var = (wt30) this.f4056c.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("rendering", "rendering", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o("value__", "value", xl60Var);
        }
        if (wt30Var != null) {
            return new HydrogenSubtitle(str, wt30Var);
        }
        throw f0b1.m40461o("rendering", "rendering", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, HydrogenSubtitle hydrogenSubtitle) {
        HydrogenSubtitle hydrogenSubtitle2 = hydrogenSubtitle;
        if (hydrogenSubtitle2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("value");
        this.f4055b.toJson(rm60Var, hydrogenSubtitle2.f4052a);
        rm60Var.mo56894s("rendering");
        this.f4056c.toJson(rm60Var, hydrogenSubtitle2.f4053b);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(38, "GeneratedJsonAdapter(HydrogenSubtitle)");
    }
}
