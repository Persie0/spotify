package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_TrackElapsedJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$TrackElapsed;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_TrackElapsedJsonAdapter extends hk60<AppProtocol$TrackElapsed> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4569a = xl60.C2578b.m91389a("elapsed_time", "duration_ms", "percentage");

    /* JADX INFO: renamed from: b */
    public final hk60 f4570b;

    public AppProtocol_TrackElapsedJsonAdapter(p0i0 p0i0Var) {
        this.f4570b = p0i0Var.m68706f(Integer.class, gbu.f78413a, "elapsedTime");
    }

    @Override // p204p.hk60
    public final AppProtocol$TrackElapsed fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4569a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4570b;
                if (iMo51071K == 0) {
                    num = (Integer) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 1) {
                    num2 = (Integer) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    num3 = (Integer) hk60Var.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$TrackElapsed(num, num2, num3);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$TrackElapsed appProtocol$TrackElapsed) {
        AppProtocol$TrackElapsed appProtocol$TrackElapsed2 = appProtocol$TrackElapsed;
        if (appProtocol$TrackElapsed2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("elapsed_time");
        Integer num = appProtocol$TrackElapsed2.elapsedTime;
        hk60 hk60Var = this.f4570b;
        hk60Var.toJson(rm60Var, num);
        rm60Var.mo56894s("duration_ms");
        hk60Var.toJson(rm60Var, appProtocol$TrackElapsed2.durationMs);
        rm60Var.mo56894s("percentage");
        hk60Var.toJson(rm60Var, appProtocol$TrackElapsed2.percentage);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(46, "GeneratedJsonAdapter(AppProtocol.TrackElapsed)");
    }
}
