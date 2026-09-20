package com.spotify.connect.core.model;

import kotlin.Metadata;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/connect/core/model/RedirectUrisJsonAdapter;", "Lp/hk60;", "Lcom/spotify/connect/core/model/RedirectUris;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_connect_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class RedirectUrisJsonAdapter extends hk60<RedirectUris> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3423a = xl60.C2578b.m91389a("android");

    /* JADX INFO: renamed from: b */
    public final hk60 f3424b;

    public RedirectUrisJsonAdapter(p0i0 p0i0Var) {
        this.f3424b = p0i0Var.m68706f(AndroidUris.class, gbu.f78413a, "androidUris");
    }

    @Override // p204p.hk60
    public final RedirectUris fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        AndroidUris androidUris = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f3423a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                androidUris = (AndroidUris) this.f3424b.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        return new RedirectUris(androidUris);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, RedirectUris redirectUris) {
        RedirectUris redirectUris2 = redirectUris;
        if (redirectUris2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("android");
        this.f3424b.toJson(rm60Var, redirectUris2.androidUris);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(34, "GeneratedJsonAdapter(RedirectUris)");
    }
}
