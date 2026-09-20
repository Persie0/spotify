package com.spotify.thestage.vtec.datasource;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.kyx;
import p204p.p0i0;
import p204p.rm60;
import p204p.vi7;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/datasource/SiteJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/datasource/Site;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SiteJsonAdapter extends hk60<Site> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6712a = xl60.C2578b.m91389a("lookupToken", "url", "authType", kyx.f127931b, "hasAudio", "enableLegacySharing", "hidePlayer", "legacyBackBehavior", "enableCheckout", "restoreOnKilled", "enableMediaDevices");

    /* JADX INFO: renamed from: b */
    public final hk60 f6713b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6714c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6715d;

    /* JADX INFO: renamed from: e */
    public final hk60 f6716e;

    /* JADX INFO: renamed from: f */
    public volatile Constructor f6717f;

    public SiteJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6713b = p0i0Var.m68706f(String.class, gbuVar, "lookupToken");
        this.f6714c = p0i0Var.m68706f(vi7.class, gbuVar, "authType");
        this.f6715d = p0i0Var.m68706f(String.class, gbuVar, kyx.f127931b);
        this.f6716e = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "hasAudio");
    }

    @Override // p204p.hk60
    public final Site fromJson(xl60 xl60Var) throws NoSuchMethodException {
        Boolean bool = Boolean.FALSE;
        xl60Var.mo51076c();
        int i = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Boolean bool4 = bool3;
        Boolean bool5 = bool4;
        Boolean bool6 = bool5;
        Boolean bool7 = bool6;
        Boolean bool8 = null;
        String str = null;
        String str2 = null;
        vi7 vi7Var = null;
        String str3 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f6712a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    str = (String) this.f6713b.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("lookupToken", "lookupToken", xl60Var);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.f6713b.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("url", "url", xl60Var);
                    }
                    break;
                    break;
                case 2:
                    vi7Var = (vi7) this.f6714c.fromJson(xl60Var);
                    if (vi7Var == null) {
                        throw f0b1.m40470x("authType", "authType", xl60Var);
                    }
                    break;
                    break;
                case 3:
                    str3 = (String) this.f6715d.fromJson(xl60Var);
                    break;
                case 4:
                    bool8 = (Boolean) this.f6716e.fromJson(xl60Var);
                    if (bool8 == null) {
                        throw f0b1.m40470x("hasAudio", "hasAudio", xl60Var);
                    }
                    break;
                    break;
                case 5:
                    bool2 = (Boolean) this.f6716e.fromJson(xl60Var);
                    if (bool2 == null) {
                        throw f0b1.m40470x("enableLegacySharing", "enableLegacySharing", xl60Var);
                    }
                    i &= -33;
                    break;
                    break;
                case 6:
                    bool3 = (Boolean) this.f6716e.fromJson(xl60Var);
                    if (bool3 == null) {
                        throw f0b1.m40470x("hidePlayer", "hidePlayer", xl60Var);
                    }
                    i &= -65;
                    break;
                    break;
                case 7:
                    bool4 = (Boolean) this.f6716e.fromJson(xl60Var);
                    if (bool4 == null) {
                        throw f0b1.m40470x("legacyBackBehavior", "legacyBackBehavior", xl60Var);
                    }
                    i &= -129;
                    break;
                    break;
                case 8:
                    bool5 = (Boolean) this.f6716e.fromJson(xl60Var);
                    if (bool5 == null) {
                        throw f0b1.m40470x("enableCheckout", "enableCheckout", xl60Var);
                    }
                    i &= -257;
                    break;
                    break;
                case 9:
                    bool6 = (Boolean) this.f6716e.fromJson(xl60Var);
                    if (bool6 == null) {
                        throw f0b1.m40470x("restoreOnKilled", "restoreOnKilled", xl60Var);
                    }
                    i &= -513;
                    break;
                    break;
                case 10:
                    bool7 = (Boolean) this.f6716e.fromJson(xl60Var);
                    if (bool7 == null) {
                        throw f0b1.m40470x("enableMediaDevices", "enableMediaDevices", xl60Var);
                    }
                    i &= -1025;
                    break;
                    break;
            }
        }
        xl60Var.mo51078f();
        if (i == -2017) {
            if (str == null) {
                throw f0b1.m40461o("lookupToken", "lookupToken", xl60Var);
            }
            if (str2 == null) {
                throw f0b1.m40461o("url", "url", xl60Var);
            }
            if (vi7Var == null) {
                throw f0b1.m40461o("authType", "authType", xl60Var);
            }
            if (bool8 != null) {
                return new Site(str, str2, vi7Var, str3, bool8.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue());
            }
            throw f0b1.m40461o("hasAudio", "hasAudio", xl60Var);
        }
        Constructor declaredConstructor = this.f6717f;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            Class<?> cls2 = f0b1.f64588c;
            Class cls3 = Boolean.TYPE;
            declaredConstructor = Site.class.getDeclaredConstructor(String.class, String.class, vi7.class, String.class, cls3, cls3, cls3, cls3, cls3, cls3, cls3, cls, cls2);
            this.f6717f = declaredConstructor;
        }
        if (str == null) {
            throw f0b1.m40461o("lookupToken", "lookupToken", xl60Var);
        }
        if (str2 == null) {
            throw f0b1.m40461o("url", "url", xl60Var);
        }
        if (vi7Var == null) {
            throw f0b1.m40461o("authType", "authType", xl60Var);
        }
        if (bool8 == null) {
            throw f0b1.m40461o("hasAudio", "hasAudio", xl60Var);
        }
        return (Site) declaredConstructor.newInstance(str, str2, vi7Var, str3, bool8, bool2, bool3, bool4, bool5, bool6, bool7, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Site site) {
        Site site2 = site;
        if (site2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("lookupToken");
        String str = site2.lookupToken;
        hk60 hk60Var = this.f6713b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("url");
        hk60Var.toJson(rm60Var, site2.url);
        rm60Var.mo56894s("authType");
        this.f6714c.toJson(rm60Var, site2.authType);
        rm60Var.mo56894s(kyx.f127931b);
        this.f6715d.toJson(rm60Var, site2.p.kyx.b java.lang.String);
        rm60Var.mo56894s("hasAudio");
        boolean z = site2.hasAudio;
        hk60 hk60Var2 = this.f6716e;
        ydj.m93455n(z, hk60Var2, rm60Var, "enableLegacySharing");
        ydj.m93455n(site2.enableLegacySharing, hk60Var2, rm60Var, "hidePlayer");
        ydj.m93455n(site2.hidePlayer, hk60Var2, rm60Var, "legacyBackBehavior");
        ydj.m93455n(site2.legacyBackBehavior, hk60Var2, rm60Var, "enableCheckout");
        ydj.m93455n(site2.enableCheckout, hk60Var2, rm60Var, "restoreOnKilled");
        ydj.m93455n(site2.restoreOnKilled, hk60Var2, rm60Var, "enableMediaDevices");
        hk60Var2.toJson(rm60Var, Boolean.valueOf(site2.enableMediaDevices));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(26, "GeneratedJsonAdapter(Site)");
    }
}
