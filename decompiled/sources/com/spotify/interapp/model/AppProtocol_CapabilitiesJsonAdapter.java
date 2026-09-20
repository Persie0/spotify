package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_CapabilitiesJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$Capabilities;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_CapabilitiesJsonAdapter extends hk60<AppProtocol$Capabilities> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4465a = xl60.C2578b.m91389a("can_play_on_demand");

    /* JADX INFO: renamed from: b */
    public final hk60 f4466b;

    public AppProtocol_CapabilitiesJsonAdapter(p0i0 p0i0Var) {
        this.f4466b = p0i0Var.m68706f(Boolean.class, gbu.f78413a, "canPlayOnDemand");
    }

    @Override // p204p.hk60
    public final AppProtocol$Capabilities fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4465a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                bool = (Boolean) this.f4466b.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$Capabilities(bool);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$Capabilities appProtocol$Capabilities) {
        AppProtocol$Capabilities appProtocol$Capabilities2 = appProtocol$Capabilities;
        if (appProtocol$Capabilities2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("can_play_on_demand");
        this.f4466b.toJson(rm60Var, appProtocol$Capabilities2.canPlayOnDemand);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(46, "GeneratedJsonAdapter(AppProtocol.Capabilities)");
    }
}
