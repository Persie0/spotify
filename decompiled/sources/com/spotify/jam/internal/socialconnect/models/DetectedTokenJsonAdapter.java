package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/DetectedTokenJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/DetectedToken;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DetectedTokenJsonAdapter extends hk60<DetectedToken> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4722a = xl60.C2578b.m91389a("token", "discovery_method", "tags");

    /* JADX INFO: renamed from: b */
    public final hk60 f4723b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4724c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f4725d;

    public DetectedTokenJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4723b = p0i0Var.m68706f(String.class, gbuVar, "token");
        this.f4724c = p0i0Var.m68706f(mp91.m62457j(Map.class, String.class, String.class), gbuVar, "tags");
    }

    @Override // p204p.hk60
    public final DetectedToken fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        Map map = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4722a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f4723b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("token", "token", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str2 = (String) this.f4723b.fromJson(xl60Var);
                if (str2 == null) {
                    throw f0b1.m40470x("discoveryMethod", "discovery_method", xl60Var);
                }
            } else if (iMo51071K == 2) {
                map = (Map) this.f4724c.fromJson(xl60Var);
                if (map == null) {
                    throw f0b1.m40470x("tags", "tags", xl60Var);
                }
                i = -5;
            } else {
                continue;
            }
        }
        xl60Var.mo51078f();
        if (i == -5) {
            if (str == null) {
                throw f0b1.m40461o("token", "token", xl60Var);
            }
            if (str2 != null) {
                return new DetectedToken(str, str2, map);
            }
            throw f0b1.m40461o("discoveryMethod", "discovery_method", xl60Var);
        }
        Constructor declaredConstructor = this.f4725d;
        if (declaredConstructor == null) {
            declaredConstructor = DetectedToken.class.getDeclaredConstructor(String.class, String.class, Map.class, Integer.TYPE, f0b1.f64588c);
            this.f4725d = declaredConstructor;
        }
        if (str == null) {
            throw f0b1.m40461o("token", "token", xl60Var);
        }
        if (str2 != null) {
            return (DetectedToken) declaredConstructor.newInstance(str, str2, map, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("discoveryMethod", "discovery_method", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, DetectedToken detectedToken) {
        DetectedToken detectedToken2 = detectedToken;
        if (detectedToken2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("token");
        String str = detectedToken2.token;
        hk60 hk60Var = this.f4723b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("discovery_method");
        hk60Var.toJson(rm60Var, detectedToken2.discoveryMethod);
        rm60Var.mo56894s("tags");
        this.f4724c.toJson(rm60Var, detectedToken2.tags);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(35, "GeneratedJsonAdapter(DetectedToken)");
    }
}
