package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_ImageIdentifierJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$ImageIdentifier;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_ImageIdentifierJsonAdapter extends hk60<AppProtocol$ImageIdentifier> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4496a = xl60.C2578b.m91389a("id", "height", "width", "image_type");

    /* JADX INFO: renamed from: b */
    public final hk60 f4497b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4498c;

    public AppProtocol_ImageIdentifierJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4497b = p0i0Var.m68706f(String.class, gbuVar, "id");
        this.f4498c = p0i0Var.m68706f(Integer.class, gbuVar, "height");
    }

    @Override // p204p.hk60
    public final AppProtocol$ImageIdentifier fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4496a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4497b;
                if (iMo51071K != 0) {
                    hk60 hk60Var2 = this.f4498c;
                    if (iMo51071K == 1) {
                        num = (Integer) hk60Var2.fromJson(xl60Var);
                    } else if (iMo51071K == 2) {
                        num2 = (Integer) hk60Var2.fromJson(xl60Var);
                    } else if (iMo51071K == 3) {
                        str2 = (String) hk60Var.fromJson(xl60Var);
                    }
                } else {
                    str = (String) hk60Var.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$ImageIdentifier(str, num, num2, str2);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$ImageIdentifier appProtocol$ImageIdentifier) {
        AppProtocol$ImageIdentifier appProtocol$ImageIdentifier2 = appProtocol$ImageIdentifier;
        if (appProtocol$ImageIdentifier2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("id");
        String str = appProtocol$ImageIdentifier2.id;
        hk60 hk60Var = this.f4497b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("height");
        Integer num = appProtocol$ImageIdentifier2.height;
        hk60 hk60Var2 = this.f4498c;
        hk60Var2.toJson(rm60Var, num);
        rm60Var.mo56894s("width");
        hk60Var2.toJson(rm60Var, appProtocol$ImageIdentifier2.width);
        rm60Var.mo56894s("image_type");
        hk60Var.toJson(rm60Var, appProtocol$ImageIdentifier2.imageType);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(49, "GeneratedJsonAdapter(AppProtocol.ImageIdentifier)");
    }
}
