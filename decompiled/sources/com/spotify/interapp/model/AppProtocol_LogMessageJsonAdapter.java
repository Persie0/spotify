package com.spotify.interapp.model;

import com.spotify.player.model.ContextTrack;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_LogMessageJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$LogMessage;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_LogMessageJsonAdapter extends hk60<AppProtocol$LogMessage> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4511a = xl60.C2578b.m91389a("message", "severity", ContextTrack.Metadata.KEY_TITLE);

    /* JADX INFO: renamed from: b */
    public final hk60 f4512b;

    public AppProtocol_LogMessageJsonAdapter(p0i0 p0i0Var) {
        this.f4512b = p0i0Var.m68706f(String.class, gbu.f78413a, "message");
    }

    @Override // p204p.hk60
    public final AppProtocol$LogMessage fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4511a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4512b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 1) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    str3 = (String) hk60Var.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$LogMessage(str, str2, str3);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$LogMessage appProtocol$LogMessage) {
        AppProtocol$LogMessage appProtocol$LogMessage2 = appProtocol$LogMessage;
        if (appProtocol$LogMessage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("message");
        String str = appProtocol$LogMessage2.message;
        hk60 hk60Var = this.f4512b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("severity");
        hk60Var.toJson(rm60Var, appProtocol$LogMessage2.severity);
        rm60Var.mo56894s(ContextTrack.Metadata.KEY_TITLE);
        hk60Var.toJson(rm60Var, appProtocol$LogMessage2.com.spotify.player.model.ContextTrack.Metadata.KEY_TITLE java.lang.String);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(44, "GeneratedJsonAdapter(AppProtocol.LogMessage)");
    }
}
