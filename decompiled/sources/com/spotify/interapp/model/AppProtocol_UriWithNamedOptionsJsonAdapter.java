package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_UriWithNamedOptionsJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$UriWithNamedOptions;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_UriWithNamedOptionsJsonAdapter extends hk60<AppProtocol$UriWithNamedOptions> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4580a = xl60.C2578b.m91389a("uri", "skipToURI", "skipToIndex", "skipToUid", "feature_identifier");

    /* JADX INFO: renamed from: b */
    public final hk60 f4581b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4582c;

    public AppProtocol_UriWithNamedOptionsJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4581b = p0i0Var.m68706f(String.class, gbuVar, "uri");
        this.f4582c = p0i0Var.m68706f(Integer.class, gbuVar, "skipToIndex");
    }

    @Override // p204p.hk60
    public final AppProtocol$UriWithNamedOptions fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4580a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f4581b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 1) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    num = (Integer) this.f4582c.fromJson(xl60Var);
                } else if (iMo51071K == 3) {
                    str3 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 4) {
                    str4 = (String) hk60Var.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$UriWithNamedOptions(str, str2, num, str3, str4);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$UriWithNamedOptions appProtocol$UriWithNamedOptions) {
        AppProtocol$UriWithNamedOptions appProtocol$UriWithNamedOptions2 = appProtocol$UriWithNamedOptions;
        if (appProtocol$UriWithNamedOptions2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("uri");
        String str = appProtocol$UriWithNamedOptions2.uri;
        hk60 hk60Var = this.f4581b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("skipToURI");
        hk60Var.toJson(rm60Var, appProtocol$UriWithNamedOptions2.skipToUri);
        rm60Var.mo56894s("skipToIndex");
        this.f4582c.toJson(rm60Var, appProtocol$UriWithNamedOptions2.skipToIndex);
        rm60Var.mo56894s("skipToUid");
        hk60Var.toJson(rm60Var, appProtocol$UriWithNamedOptions2.skipToUid);
        rm60Var.mo56894s("feature_identifier");
        hk60Var.toJson(rm60Var, appProtocol$UriWithNamedOptions2.featureIdentifier);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(53, "GeneratedJsonAdapter(AppProtocol.UriWithNamedOptions)");
    }
}
