package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_AlertJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$Alert;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_AlertJsonAdapter extends hk60<AppProtocol$Alert> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4460a = xl60.C2578b.m91389a("code", "short_text", "long_text");

    /* JADX INFO: renamed from: b */
    public final hk60 f4461b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4462c;

    public AppProtocol_AlertJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4461b = p0i0Var.m68706f(Integer.class, gbuVar, "statusCode");
        this.f4462c = p0i0Var.m68706f(String.class, gbuVar, "shortText");
    }

    @Override // p204p.hk60
    public final AppProtocol$Alert fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Integer num = null;
        String str = null;
        String str2 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4460a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K != 0) {
                hk60 hk60Var = this.f4462c;
                if (iMo51071K == 1) {
                    str = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                }
            } else {
                num = (Integer) this.f4461b.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$Alert(num, str, str2);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$Alert appProtocol$Alert) {
        AppProtocol$Alert appProtocol$Alert2 = appProtocol$Alert;
        if (appProtocol$Alert2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("code");
        this.f4461b.toJson(rm60Var, appProtocol$Alert2.statusCode);
        rm60Var.mo56894s("short_text");
        String str = appProtocol$Alert2.shortText;
        hk60 hk60Var = this.f4462c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("long_text");
        hk60Var.toJson(rm60Var, appProtocol$Alert2.longText);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(39, "GeneratedJsonAdapter(AppProtocol.Alert)");
    }
}
