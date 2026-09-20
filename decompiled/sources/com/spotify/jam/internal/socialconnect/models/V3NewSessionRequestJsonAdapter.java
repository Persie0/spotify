package com.spotify.jam.internal.socialconnect.models;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/V3NewSessionRequestJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/V3NewSessionRequest;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class V3NewSessionRequestJsonAdapter extends hk60<V3NewSessionRequest> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4967a = xl60.C2578b.m91389a("activate", "local_device_id", "origin", "configuration");

    /* JADX INFO: renamed from: b */
    public final hk60 f4968b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4969c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4970d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4971e;

    public V3NewSessionRequestJsonAdapter(p0i0 p0i0Var) {
        Class cls = Boolean.TYPE;
        gbu gbuVar = gbu.f78413a;
        this.f4968b = p0i0Var.m68706f(cls, gbuVar, "activate");
        this.f4969c = p0i0Var.m68706f(String.class, gbuVar, "localDeviceId");
        this.f4970d = p0i0Var.m68706f(SessionOrigin.class, gbuVar, "origin");
        this.f4971e = p0i0Var.m68706f(SessionConfiguration.class, gbuVar, "configuration");
    }

    @Override // p204p.hk60
    public final V3NewSessionRequest fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        String str = null;
        SessionOrigin sessionOrigin = null;
        SessionConfiguration sessionConfiguration = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4967a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                bool = (Boolean) this.f4968b.fromJson(xl60Var);
                if (bool == null) {
                    throw f0b1.m40470x("activate", "activate", xl60Var);
                }
            } else if (iMo51071K == 1) {
                str = (String) this.f4969c.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("localDeviceId", "local_device_id", xl60Var);
                }
            } else if (iMo51071K == 2) {
                sessionOrigin = (SessionOrigin) this.f4970d.fromJson(xl60Var);
            } else if (iMo51071K == 3) {
                sessionConfiguration = (SessionConfiguration) this.f4971e.fromJson(xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (bool == null) {
            throw f0b1.m40461o("activate", "activate", xl60Var);
        }
        boolean zBooleanValue = bool.booleanValue();
        if (str != null) {
            return new V3NewSessionRequest(zBooleanValue, str, sessionOrigin, sessionConfiguration);
        }
        throw f0b1.m40461o("localDeviceId", "local_device_id", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, V3NewSessionRequest v3NewSessionRequest) {
        V3NewSessionRequest v3NewSessionRequest2 = v3NewSessionRequest;
        if (v3NewSessionRequest2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("activate");
        ydj.m93455n(v3NewSessionRequest2.activate, this.f4968b, rm60Var, "local_device_id");
        this.f4969c.toJson(rm60Var, v3NewSessionRequest2.localDeviceId);
        rm60Var.mo56894s("origin");
        this.f4970d.toJson(rm60Var, v3NewSessionRequest2.origin);
        rm60Var.mo56894s("configuration");
        this.f4971e.toJson(rm60Var, v3NewSessionRequest2.configuration);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(41, "GeneratedJsonAdapter(V3NewSessionRequest)");
    }
}
