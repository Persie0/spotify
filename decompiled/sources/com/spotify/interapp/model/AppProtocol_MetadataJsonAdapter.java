package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_MetadataJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$Metadata;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_MetadataJsonAdapter extends hk60<AppProtocol$Metadata> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4515a = xl60.C2578b.m91389a("is_explicit_content", "is_19_plus_content", "duration_ms", "time_left_ms", "is_played");

    /* JADX INFO: renamed from: b */
    public final hk60 f4516b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4517c;

    public AppProtocol_MetadataJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4516b = p0i0Var.m68706f(Boolean.class, gbuVar, "isExplicitContent");
        this.f4517c = p0i0Var.m68706f(Long.class, gbuVar, "duration");
    }

    @Override // p204p.hk60
    public final AppProtocol$Metadata fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        Boolean bool2 = null;
        Long l = null;
        Long l2 = null;
        Boolean bool3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4515a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4516b;
                if (iMo51071K == 0) {
                    bool = (Boolean) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K != 1) {
                    hk60 hk60Var2 = this.f4517c;
                    if (iMo51071K == 2) {
                        l = (Long) hk60Var2.fromJson(xl60Var);
                    } else if (iMo51071K == 3) {
                        l2 = (Long) hk60Var2.fromJson(xl60Var);
                    } else if (iMo51071K == 4) {
                        bool3 = (Boolean) hk60Var.fromJson(xl60Var);
                    }
                } else {
                    bool2 = (Boolean) hk60Var.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$Metadata(bool, bool2, l, l2, bool3);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$Metadata appProtocol$Metadata) {
        AppProtocol$Metadata appProtocol$Metadata2 = appProtocol$Metadata;
        if (appProtocol$Metadata2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("is_explicit_content");
        Boolean bool = appProtocol$Metadata2.isExplicitContent;
        hk60 hk60Var = this.f4516b;
        hk60Var.toJson(rm60Var, bool);
        rm60Var.mo56894s("is_19_plus_content");
        hk60Var.toJson(rm60Var, appProtocol$Metadata2.is19PlusContent);
        rm60Var.mo56894s("duration_ms");
        Long l = appProtocol$Metadata2.duration;
        hk60 hk60Var2 = this.f4517c;
        hk60Var2.toJson(rm60Var, l);
        rm60Var.mo56894s("time_left_ms");
        hk60Var2.toJson(rm60Var, appProtocol$Metadata2.timeLeft);
        rm60Var.mo56894s("is_played");
        hk60Var.toJson(rm60Var, appProtocol$Metadata2.isPlayed);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(42, "GeneratedJsonAdapter(AppProtocol.Metadata)");
    }
}
