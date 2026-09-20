package com.spotify.interapp.model;

import java.util.List;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_UrisJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$Uris;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_UrisJsonAdapter extends hk60<AppProtocol$Uris> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4586a = xl60.C2578b.m91389a("uris");

    /* JADX INFO: renamed from: b */
    public final hk60 f4587b;

    public AppProtocol_UrisJsonAdapter(p0i0 p0i0Var) {
        this.f4587b = p0i0Var.m68706f(mp91.m62457j(List.class, String.class), gbu.f78413a, "uris");
    }

    @Override // p204p.hk60
    public final AppProtocol$Uris fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        List list = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4586a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                list = (List) this.f4587b.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$Uris(list);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$Uris appProtocol$Uris) {
        AppProtocol$Uris appProtocol$Uris2 = appProtocol$Uris;
        if (appProtocol$Uris2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("uris");
        this.f4587b.toJson(rm60Var, appProtocol$Uris2.uris);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(38, "GeneratedJsonAdapter(AppProtocol.Uris)");
    }
}
