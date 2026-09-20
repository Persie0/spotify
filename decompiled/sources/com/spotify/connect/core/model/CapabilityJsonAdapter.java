package com.spotify.connect.core.model;

import java.util.Map;
import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/connect/core/model/CapabilityJsonAdapter;", "Lp/hk60;", "Lcom/spotify/connect/core/model/Capability;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_connect_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CapabilityJsonAdapter extends hk60<Capability> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3418a = xl60.C2578b.m91389a("id", "defaultTitle", "iconUrl", "redirectUris", "localizedTitle");

    /* JADX INFO: renamed from: b */
    public final hk60 f3419b;

    /* JADX INFO: renamed from: c */
    public final hk60 f3420c;

    /* JADX INFO: renamed from: d */
    public final hk60 f3421d;

    public CapabilityJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f3419b = p0i0Var.m68706f(String.class, gbuVar, "id");
        this.f3420c = p0i0Var.m68706f(RedirectUris.class, gbuVar, "redirectUris");
        this.f3421d = p0i0Var.m68706f(mp91.m62457j(Map.class, String.class, String.class), gbuVar, "localizedTitles");
    }

    @Override // p204p.hk60
    public final Capability fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        RedirectUris redirectUris = null;
        Map map = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f3418a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f3419b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 1) {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 2) {
                    str3 = (String) hk60Var.fromJson(xl60Var);
                } else if (iMo51071K == 3) {
                    redirectUris = (RedirectUris) this.f3420c.fromJson(xl60Var);
                } else if (iMo51071K == 4) {
                    map = (Map) this.f3421d.fromJson(xl60Var);
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        return new Capability(str, str2, str3, redirectUris, map);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Capability capability) {
        Capability capability2 = capability;
        if (capability2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("id");
        String str = capability2.id;
        hk60 hk60Var = this.f3419b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("defaultTitle");
        hk60Var.toJson(rm60Var, capability2.defaultTitle);
        rm60Var.mo56894s("iconUrl");
        hk60Var.toJson(rm60Var, capability2.iconUrl);
        rm60Var.mo56894s("redirectUris");
        this.f3420c.toJson(rm60Var, capability2.redirectUris);
        rm60Var.mo56894s("localizedTitle");
        this.f3421d.toJson(rm60Var, capability2.localizedTitles);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(32, "GeneratedJsonAdapter(Capability)");
    }
}
