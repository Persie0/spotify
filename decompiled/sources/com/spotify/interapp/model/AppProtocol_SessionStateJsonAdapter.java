package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_SessionStateJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$SessionState;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_SessionStateJsonAdapter extends hk60<AppProtocol$SessionState> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4545a = xl60.C2578b.m91389a("is_offline", "is_in_forced_offline_mode", "is_logged_in", "connection_type");

    /* JADX INFO: renamed from: b */
    public final hk60 f4546b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4547c;

    public AppProtocol_SessionStateJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4546b = p0i0Var.m68706f(Boolean.class, gbuVar, "isOffline");
        this.f4547c = p0i0Var.m68706f(String.class, gbuVar, "connectionType");
    }

    @Override // p204p.hk60
    public final AppProtocol$SessionState fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4545a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4546b;
                if (iMo51071K == 0) {
                    bool = (Boolean) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 1) {
                    bool2 = (Boolean) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    bool3 = (Boolean) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 3) {
                    str = (String) this.f4547c.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$SessionState(bool, bool2, bool3, str);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$SessionState appProtocol$SessionState) {
        AppProtocol$SessionState appProtocol$SessionState2 = appProtocol$SessionState;
        if (appProtocol$SessionState2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("is_offline");
        Boolean bool = appProtocol$SessionState2.isOffline;
        hk60 hk60Var = this.f4546b;
        hk60Var.toJson(rm60Var, bool);
        rm60Var.mo56894s("is_in_forced_offline_mode");
        hk60Var.toJson(rm60Var, appProtocol$SessionState2.isInForcedOfflineMode);
        rm60Var.mo56894s("is_logged_in");
        hk60Var.toJson(rm60Var, appProtocol$SessionState2.isLoggedIn);
        rm60Var.mo56894s("connection_type");
        this.f4547c.toJson(rm60Var, appProtocol$SessionState2.connectionType);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(46, "GeneratedJsonAdapter(AppProtocol.SessionState)");
    }
}
