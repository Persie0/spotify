package com.spotify.jam.internal.socialconnect.models;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.hla;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatusJsonAdapter;", "Lp/hk60;", "Lcom/spotify/jam/internal/socialconnect/models/DeviceBroadcastStatus;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_jam_internal_socialconnect_models-models"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DeviceBroadcastStatusJsonAdapter extends hk60<DeviceBroadcastStatus> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f4735a = xl60.C2578b.m91389a("timestamp", "broadcast_status", "device_id", "device_name", "device_type", "output_device_info", "mdns_token", "social_radar_token", "link_token");

    /* JADX INFO: renamed from: b */
    public final hk60 f4736b;

    /* JADX INFO: renamed from: c */
    public final hk60 f4737c;

    /* JADX INFO: renamed from: d */
    public final hk60 f4738d;

    /* JADX INFO: renamed from: e */
    public final hk60 f4739e;

    /* JADX INFO: renamed from: f */
    public final hk60 f4740f;

    /* JADX INFO: renamed from: g */
    public final hk60 f4741g;

    /* JADX INFO: renamed from: h */
    public volatile Constructor f4742h;

    public DeviceBroadcastStatusJsonAdapter(p0i0 p0i0Var) {
        Class cls = Long.TYPE;
        gbu gbuVar = gbu.f78413a;
        this.f4736b = p0i0Var.m68706f(cls, gbuVar, "timestamp");
        this.f4737c = p0i0Var.m68706f(hla.class, gbuVar, "broadcastStatus");
        this.f4738d = p0i0Var.m68706f(String.class, gbuVar, "deviceId");
        this.f4739e = p0i0Var.m68706f(String.class, gbuVar, "deviceType");
        this.f4740f = p0i0Var.m68706f(OutputDeviceInfo.class, gbuVar, "outputDeviceInfo");
        this.f4741g = p0i0Var.m68706f(BroadcastToken.class, gbuVar, "mdnsToken");
    }

    @Override // p204p.hk60
    public final DeviceBroadcastStatus fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        int i = -1;
        Long l = null;
        hla hlaVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        OutputDeviceInfo outputDeviceInfo = null;
        BroadcastToken broadcastToken = null;
        BroadcastToken broadcastToken2 = null;
        BroadcastToken broadcastToken3 = null;
        while (true) {
            Long l2 = l;
            hla hlaVar2 = hlaVar;
            String str4 = str;
            if (!xl60Var.mo51079i()) {
                String str5 = str2;
                xl60Var.mo51078f();
                if (i == -497) {
                    if (l2 == null) {
                        throw f0b1.m40461o("timestamp", "timestamp", xl60Var);
                    }
                    long jLongValue = l2.longValue();
                    if (hlaVar2 == null) {
                        throw f0b1.m40461o("broadcastStatus", "broadcast_status", xl60Var);
                    }
                    if (str4 == null) {
                        throw f0b1.m40461o("deviceId", "device_id", xl60Var);
                    }
                    if (str5 != null) {
                        return new DeviceBroadcastStatus(jLongValue, hlaVar2, str4, str5, str3, outputDeviceInfo, broadcastToken, broadcastToken2, broadcastToken3);
                    }
                    throw f0b1.m40461o("deviceName", "device_name", xl60Var);
                }
                Constructor declaredConstructor = this.f4742h;
                if (declaredConstructor == null) {
                    declaredConstructor = DeviceBroadcastStatus.class.getDeclaredConstructor(Long.TYPE, hla.class, String.class, String.class, String.class, OutputDeviceInfo.class, BroadcastToken.class, BroadcastToken.class, BroadcastToken.class, Integer.TYPE, f0b1.f64588c);
                    this.f4742h = declaredConstructor;
                }
                Constructor constructor = declaredConstructor;
                if (l2 == null) {
                    throw f0b1.m40461o("timestamp", "timestamp", xl60Var);
                }
                if (hlaVar2 == null) {
                    throw f0b1.m40461o("broadcastStatus", "broadcast_status", xl60Var);
                }
                if (str4 == null) {
                    throw f0b1.m40461o("deviceId", "device_id", xl60Var);
                }
                if (str5 == null) {
                    throw f0b1.m40461o("deviceName", "device_name", xl60Var);
                }
                return (DeviceBroadcastStatus) constructor.newInstance(l2, hlaVar2, str4, str5, str3, outputDeviceInfo, broadcastToken, broadcastToken2, broadcastToken3, Integer.valueOf(i), null);
            }
            String str6 = str2;
            switch (xl60Var.mo51071K(this.f4735a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    str2 = str6;
                    l = l2;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
                case 0:
                    l = (Long) this.f4736b.fromJson(xl60Var);
                    if (l == null) {
                        throw f0b1.m40470x("timestamp", "timestamp", xl60Var);
                    }
                    str2 = str6;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
                    break;
                case 1:
                    hlaVar = (hla) this.f4737c.fromJson(xl60Var);
                    if (hlaVar == null) {
                        throw f0b1.m40470x("broadcastStatus", "broadcast_status", xl60Var);
                    }
                    str2 = str6;
                    l = l2;
                    str = str4;
                    break;
                    break;
                case 2:
                    str = (String) this.f4738d.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("deviceId", "device_id", xl60Var);
                    }
                    str2 = str6;
                    l = l2;
                    hlaVar = hlaVar2;
                    break;
                    break;
                case 3:
                    str2 = (String) this.f4738d.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("deviceName", "device_name", xl60Var);
                    }
                    l = l2;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
                case 4:
                    str3 = (String) this.f4739e.fromJson(xl60Var);
                    i &= -17;
                    str2 = str6;
                    l = l2;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
                case 5:
                    outputDeviceInfo = (OutputDeviceInfo) this.f4740f.fromJson(xl60Var);
                    i &= -33;
                    str2 = str6;
                    l = l2;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
                case 6:
                    broadcastToken = (BroadcastToken) this.f4741g.fromJson(xl60Var);
                    i &= -65;
                    str2 = str6;
                    l = l2;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
                case 7:
                    broadcastToken2 = (BroadcastToken) this.f4741g.fromJson(xl60Var);
                    i &= -129;
                    str2 = str6;
                    l = l2;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
                case 8:
                    broadcastToken3 = (BroadcastToken) this.f4741g.fromJson(xl60Var);
                    i &= -257;
                    str2 = str6;
                    l = l2;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
                default:
                    str2 = str6;
                    l = l2;
                    hlaVar = hlaVar2;
                    str = str4;
                    break;
            }
        }
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, DeviceBroadcastStatus deviceBroadcastStatus) {
        DeviceBroadcastStatus deviceBroadcastStatus2 = deviceBroadcastStatus;
        if (deviceBroadcastStatus2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("timestamp");
        this.f4736b.toJson(rm60Var, Long.valueOf(deviceBroadcastStatus2.timestamp));
        rm60Var.mo56894s("broadcast_status");
        this.f4737c.toJson(rm60Var, deviceBroadcastStatus2.broadcastStatus);
        rm60Var.mo56894s("device_id");
        String str = deviceBroadcastStatus2.deviceId;
        hk60 hk60Var = this.f4738d;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("device_name");
        hk60Var.toJson(rm60Var, deviceBroadcastStatus2.deviceName);
        rm60Var.mo56894s("device_type");
        this.f4739e.toJson(rm60Var, deviceBroadcastStatus2.deviceType);
        rm60Var.mo56894s("output_device_info");
        this.f4740f.toJson(rm60Var, deviceBroadcastStatus2.outputDeviceInfo);
        rm60Var.mo56894s("mdns_token");
        BroadcastToken broadcastToken = deviceBroadcastStatus2.mdnsToken;
        hk60 hk60Var2 = this.f4741g;
        hk60Var2.toJson(rm60Var, broadcastToken);
        rm60Var.mo56894s("social_radar_token");
        hk60Var2.toJson(rm60Var, deviceBroadcastStatus2.socialRadarToken);
        rm60Var.mo56894s("link_token");
        hk60Var2.toJson(rm60Var, deviceBroadcastStatus2.linkToken);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(43, "GeneratedJsonAdapter(DeviceBroadcastStatus)");
    }
}
