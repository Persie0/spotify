package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/DiscoveredTokenJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/DiscoveredToken;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DiscoveredTokenJsonAdapter extends hk60<DiscoveredToken> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4746a = xl60.C2578b.m91389a("username", "token", "discovery_method");

    /* JADX INFO: renamed from: b */
    public final hk60 f4747b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4748c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f4749d;

    public DiscoveredTokenJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4747b = p0i0Var.m68706f(String.class, gbuVar, "username");
        this.f4748c = p0i0Var.m68706f(String.class, gbuVar, "token");
    }

    @Override // p204p.hk60
    public final DiscoveredToken fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4746a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f4747b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("username", "username", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str2 = (String) this.f4748c.fromJson(xl60Var);
                i = -3;
            } else if (iMo51071K == 2 && (str3 = (String) this.f4747b.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("discoveryMethod", "discovery_method", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (i == -3) {
            if (str == null) {
                throw f0b1.m40461o("username", "username", xl60Var);
            }
            if (str3 != null) {
                return new DiscoveredToken(str, str2, str3);
            }
            throw f0b1.m40461o("discoveryMethod", "discovery_method", xl60Var);
        }
        Constructor declaredConstructor = this.f4749d;
        if (declaredConstructor == null) {
            declaredConstructor = DiscoveredToken.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f4749d = declaredConstructor;
        }
        if (str == null) {
            throw f0b1.m40461o("username", "username", xl60Var);
        }
        if (str3 != null) {
            return (DiscoveredToken) declaredConstructor.newInstance(str, str2, str3, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("discoveryMethod", "discovery_method", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, DiscoveredToken discoveredToken) {
        DiscoveredToken discoveredToken2 = discoveredToken;
        if (discoveredToken2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("username");
        String str = discoveredToken2.username;
        hk60 hk60Var = this.f4747b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("token");
        this.f4748c.toJson(rm60Var, discoveredToken2.token);
        rm60Var.mo56894s("discovery_method");
        hk60Var.toJson(rm60Var, discoveredToken2.discoveryMethod);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(37, "GeneratedJsonAdapter(DiscoveredToken)");
    }
}
