package com.spotify.interapp.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/interapp/model/AppProtocol_WelcomeDetailsJsonAdapter;", "Lp/hk60;", "Lcom/spotify/interapp/model/AppProtocol$WelcomeDetails;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_interapp_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppProtocol_WelcomeDetailsJsonAdapter extends hk60<AppProtocol$WelcomeDetails> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4588a = xl60.C2578b.m91389a("roles", "app_version", "authprovider", "authid", "authrole", "authmethod", "date_time");

    /* JADX INFO: renamed from: b */
    public final hk60 f4589b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4590c;

    public AppProtocol_WelcomeDetailsJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4589b = p0i0Var.m68706f(AppProtocol$HelloDetailsAppProtocol$Roles.class, gbuVar, "roles");
        this.f4590c = p0i0Var.m68706f(String.class, gbuVar, "appversion");
    }

    @Override // p204p.hk60
    public final AppProtocol$WelcomeDetails fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        AppProtocol$HelloDetailsAppProtocol$Roles appProtocol$HelloDetailsAppProtocol$Roles = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4588a);
            hk60 hk60Var = this.f4590c;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    appProtocol$HelloDetailsAppProtocol$Roles = (AppProtocol$HelloDetailsAppProtocol$Roles) this.f4589b.fromJson(xl60Var);
                    break;
                case 1:
                    str = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 2:
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 3:
                    str3 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 4:
                    str4 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 5:
                    str5 = (String) hk60Var.fromJson(xl60Var);
                    break;
                case 6:
                    str6 = (String) hk60Var.fromJson(xl60Var);
                    break;
            }
        }
        xl60Var.mo51078f();
        return new AppProtocol$WelcomeDetails(appProtocol$HelloDetailsAppProtocol$Roles, str, str2, str3, str4, str5, str6);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, AppProtocol$WelcomeDetails appProtocol$WelcomeDetails) {
        AppProtocol$WelcomeDetails appProtocol$WelcomeDetails2 = appProtocol$WelcomeDetails;
        if (appProtocol$WelcomeDetails2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("roles");
        this.f4589b.toJson(rm60Var, appProtocol$WelcomeDetails2.roles);
        rm60Var.mo56894s("app_version");
        String str = appProtocol$WelcomeDetails2.appversion;
        hk60 hk60Var = this.f4590c;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("authprovider");
        hk60Var.toJson(rm60Var, appProtocol$WelcomeDetails2.authprovider);
        rm60Var.mo56894s("authid");
        hk60Var.toJson(rm60Var, appProtocol$WelcomeDetails2.authid);
        rm60Var.mo56894s("authrole");
        hk60Var.toJson(rm60Var, appProtocol$WelcomeDetails2.authrole);
        rm60Var.mo56894s("authmethod");
        hk60Var.toJson(rm60Var, appProtocol$WelcomeDetails2.authmethod);
        rm60Var.mo56894s("date_time");
        hk60Var.toJson(rm60Var, appProtocol$WelcomeDetails2.dateTime);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(48, "GeneratedJsonAdapter(AppProtocol.WelcomeDetails)");
    }
}
