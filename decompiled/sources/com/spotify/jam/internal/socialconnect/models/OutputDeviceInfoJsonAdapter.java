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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfoJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/OutputDeviceInfo;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OutputDeviceInfoJsonAdapter extends hk60<OutputDeviceInfo> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4799a = xl60.C2578b.m91389a("device_name", "output_device_type", "accessory_type");

    /* JADX INFO: renamed from: b */
    public final hk60 f4800b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4801c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f4802d;

    public OutputDeviceInfoJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f4800b = p0i0Var.m68706f(String.class, gbuVar, "deviceName");
        this.f4801c = p0i0Var.m68706f(String.class, gbuVar, "rawOutputDeviceType");
    }

    @Override // p204p.hk60
    public final OutputDeviceInfo fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f4799a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f4800b.fromJson(xl60Var);
                i &= -2;
            } else if (iMo51071K == 1) {
                str2 = (String) this.f4801c.fromJson(xl60Var);
                if (str2 == null) {
                    throw f0b1.m40470x("rawOutputDeviceType", "output_device_type", xl60Var);
                }
            } else if (iMo51071K == 2) {
                str3 = (String) this.f4800b.fromJson(xl60Var);
                i &= -5;
            }
        }
        xl60Var.mo51078f();
        if (i == -6) {
            if (str2 != null) {
                return new OutputDeviceInfo(str, str2, str3);
            }
            throw f0b1.m40461o("rawOutputDeviceType", "output_device_type", xl60Var);
        }
        Constructor declaredConstructor = this.f4802d;
        if (declaredConstructor == null) {
            declaredConstructor = OutputDeviceInfo.class.getDeclaredConstructor(String.class, String.class, String.class, Integer.TYPE, f0b1.f64588c);
            this.f4802d = declaredConstructor;
        }
        if (str2 != null) {
            return (OutputDeviceInfo) declaredConstructor.newInstance(str, str2, str3, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("rawOutputDeviceType", "output_device_type", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, OutputDeviceInfo outputDeviceInfo) {
        OutputDeviceInfo outputDeviceInfo2 = outputDeviceInfo;
        if (outputDeviceInfo2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("device_name");
        String str = outputDeviceInfo2.deviceName;
        hk60 hk60Var = this.f4800b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("output_device_type");
        this.f4801c.toJson(rm60Var, outputDeviceInfo2.rawOutputDeviceType);
        rm60Var.mo56894s("accessory_type");
        hk60Var.toJson(rm60Var, outputDeviceInfo2.rawAccessoryType);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(38, "GeneratedJsonAdapter(OutputDeviceInfo)");
    }
}
