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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfoJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/SessionDeviceInfo;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SessionDeviceInfoJsonAdapter extends hk60<SessionDeviceInfo> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4890a = xl60.C2578b.m91389a("device_id", "output_device_info", "device_name", "device_type", "is_group");

    /* JADX INFO: renamed from: b */
    public final hk60 f4891b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4892c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4893d;

    /* JADX INFO: renamed from: e */
    public volatile Constructor f4894e;

    public SessionDeviceInfoJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4891b = p0i0Var.m68706f(String.class, gbuVar, "deviceId");
        this.f4892c = p0i0Var.m68706f(OutputDeviceInfo.class, gbuVar, "outputDeviceInfo");
        this.f4893d = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "isGroup");
    }

    @Override // p204p.hk60
    public final SessionDeviceInfo fromJson(xl60 xl60Var) throws NoSuchMethodException {
        Boolean bool = Boolean.FALSE;
        xl60Var.mo51076c();
        Boolean bool2 = bool;
        String str = null;
        OutputDeviceInfo outputDeviceInfo = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4890a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f4891b.fromJson(xl60Var);
                i &= -2;
            } else if (iMo51071K == 1) {
                outputDeviceInfo = (OutputDeviceInfo) this.f4892c.fromJson(xl60Var);
                i &= -3;
            } else if (iMo51071K == 2) {
                str2 = (String) this.f4891b.fromJson(xl60Var);
                i &= -5;
            } else if (iMo51071K == 3) {
                str3 = (String) this.f4891b.fromJson(xl60Var);
                i &= -9;
            } else if (iMo51071K == 4) {
                bool2 = (Boolean) this.f4893d.fromJson(xl60Var);
                if (bool2 == null) {
                    throw f0b1.m40470x("isGroup", "is_group", xl60Var);
                }
                i &= -17;
            } else {
                continue;
            }
        }
        xl60Var.mo51078f();
        if (i == -32) {
            return new SessionDeviceInfo(str, outputDeviceInfo, str2, str3, bool2.booleanValue());
        }
        Constructor declaredConstructor = this.f4894e;
        if (declaredConstructor == null) {
            declaredConstructor = SessionDeviceInfo.class.getDeclaredConstructor(String.class, OutputDeviceInfo.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, f0b1.f64588c);
            this.f4894e = declaredConstructor;
        }
        return (SessionDeviceInfo) declaredConstructor.newInstance(str, outputDeviceInfo, str2, str3, bool2, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, SessionDeviceInfo sessionDeviceInfo) {
        SessionDeviceInfo sessionDeviceInfo2 = sessionDeviceInfo;
        if (sessionDeviceInfo2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("device_id");
        String str = sessionDeviceInfo2.deviceId;
        hk60 hk60Var = this.f4891b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("output_device_info");
        this.f4892c.toJson(rm60Var, sessionDeviceInfo2.outputDeviceInfo);
        rm60Var.mo56894s("device_name");
        hk60Var.toJson(rm60Var, sessionDeviceInfo2.deviceName);
        rm60Var.mo56894s("device_type");
        hk60Var.toJson(rm60Var, sessionDeviceInfo2.deviceType);
        rm60Var.mo56894s("is_group");
        this.f4893d.toJson(rm60Var, Boolean.valueOf(sessionDeviceInfo2.isGroup));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(39, "GeneratedJsonAdapter(SessionDeviceInfo)");
    }
}
