package com.spotify.connect.castbasic.core.model;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/connect/castbasic/core/model/DiscoveredDeviceJsonAdapter;", "Lp/hk60;", "Lcom/spotify/connect/castbasic/core/model/DiscoveredDevice;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_connect_castbasic-castbasic"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DiscoveredDeviceJsonAdapter extends hk60<DiscoveredDevice> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f3400a = xl60.C2578b.m91389a("deviceID", "remoteName", "brandDisplayName", "modelDisplayName", "deviceAPI_ipAddress", "version", "deviceAPI_isGroup", "deviceType", "accountReq", "status", "publicKey", "libraryVersion", "spotifyError", "tokenType", "scope", "clientID", "deviceAPI_deviceClass", "activeUser", "statusString", "supportsStreamExpansion");

    /* JADX INFO: renamed from: b */
    public final hk60 f3401b;

    /* JADX INFO: renamed from: c */
    public final hk60 f3402c;

    /* JADX INFO: renamed from: d */
    public final hk60 f3403d;

    /* JADX INFO: renamed from: e */
    public final hk60 f3404e;

    /* JADX INFO: renamed from: f */
    public final hk60 f3405f;

    /* JADX INFO: renamed from: g */
    public volatile Constructor f3406g;

    public DiscoveredDeviceJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f3401b = p0i0Var.m68706f(String.class, gbuVar, "deviceId");
        this.f3402c = p0i0Var.m68706f(Integer.TYPE, gbuVar, "isAudioGroup");
        this.f3403d = p0i0Var.m68706f(Integer.class, gbuVar, "errorCode");
        this.f3404e = p0i0Var.m68706f(String.class, gbuVar, "scope");
        this.f3405f = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "supportsStreamExpansion");
    }

    @Override // p204p.hk60
    public final DiscoveredDevice fromJson(xl60 xl60Var) throws NoSuchMethodException {
        int i;
        Boolean bool = Boolean.FALSE;
        xl60Var.mo51076c();
        int i2 = -1;
        Integer num = 0;
        Integer num2 = null;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num3 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        while (xl60Var.mo51079i()) {
            String str17 = str;
            switch (xl60Var.mo51071K(this.f3400a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    str = str17;
                    break;
                case 0:
                    str = (String) this.f3401b.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("deviceId", "deviceID", xl60Var);
                    }
                    break;
                    break;
                case 1:
                    str2 = (String) this.f3401b.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("remoteName", "remoteName", xl60Var);
                    }
                    str = str17;
                    break;
                case 2:
                    str3 = (String) this.f3401b.fromJson(xl60Var);
                    if (str3 == null) {
                        throw f0b1.m40470x("brandDisplayName", "brandDisplayName", xl60Var);
                    }
                    str = str17;
                    break;
                case 3:
                    str13 = (String) this.f3401b.fromJson(xl60Var);
                    if (str13 == null) {
                        throw f0b1.m40470x("modelDisplayName", "modelDisplayName", xl60Var);
                    }
                    str = str17;
                    break;
                case 4:
                    str14 = (String) this.f3401b.fromJson(xl60Var);
                    if (str14 == null) {
                        throw f0b1.m40470x("ipAddress", "deviceAPI_ipAddress", xl60Var);
                    }
                    str = str17;
                    break;
                case 5:
                    str15 = (String) this.f3401b.fromJson(xl60Var);
                    if (str15 == null) {
                        throw f0b1.m40470x("version", "version", xl60Var);
                    }
                    i2 &= -33;
                    str = str17;
                    break;
                    break;
                case 6:
                    num = (Integer) this.f3402c.fromJson(xl60Var);
                    if (num == null) {
                        throw f0b1.m40470x("isAudioGroup", "deviceAPI_isGroup", xl60Var);
                    }
                    i2 &= -65;
                    str = str17;
                    break;
                    break;
                case 7:
                    str16 = (String) this.f3401b.fromJson(xl60Var);
                    if (str16 == null) {
                        throw f0b1.m40470x("deviceType", "deviceType", xl60Var);
                    }
                    i2 &= -129;
                    str = str17;
                    break;
                    break;
                case 8:
                    str4 = (String) this.f3401b.fromJson(xl60Var);
                    if (str4 == null) {
                        throw f0b1.m40470x("accountReq", "accountReq", xl60Var);
                    }
                    i2 &= -257;
                    str = str17;
                    break;
                    break;
                case 9:
                    num2 = (Integer) this.f3402c.fromJson(xl60Var);
                    if (num2 == null) {
                        throw f0b1.m40470x("status", "status", xl60Var);
                    }
                    i2 &= -513;
                    str = str17;
                    break;
                    break;
                case 10:
                    str5 = (String) this.f3401b.fromJson(xl60Var);
                    if (str5 == null) {
                        throw f0b1.m40470x("publicKey", "publicKey", xl60Var);
                    }
                    i2 &= -1025;
                    str = str17;
                    break;
                    break;
                case 11:
                    str6 = (String) this.f3401b.fromJson(xl60Var);
                    if (str6 == null) {
                        throw f0b1.m40470x("libraryVersion", "libraryVersion", xl60Var);
                    }
                    i2 &= -2049;
                    str = str17;
                    break;
                    break;
                case 12:
                    num3 = (Integer) this.f3403d.fromJson(xl60Var);
                    i2 &= -4097;
                    str = str17;
                    break;
                case 13:
                    str7 = (String) this.f3401b.fromJson(xl60Var);
                    if (str7 == null) {
                        throw f0b1.m40470x("tokenType", "tokenType", xl60Var);
                    }
                    i2 &= -8193;
                    str = str17;
                    break;
                    break;
                case 14:
                    str8 = (String) this.f3404e.fromJson(xl60Var);
                    i2 &= -16385;
                    str = str17;
                    break;
                case 15:
                    str9 = (String) this.f3404e.fromJson(xl60Var);
                    i = -32769;
                    i2 &= i;
                    str = str17;
                    break;
                case 16:
                    str10 = (String) this.f3401b.fromJson(xl60Var);
                    if (str10 == null) {
                        throw f0b1.m40470x("deviceClass", "deviceAPI_deviceClass", xl60Var);
                    }
                    i = -65537;
                    i2 &= i;
                    str = str17;
                    break;
                    break;
                case 17:
                    str11 = (String) this.f3401b.fromJson(xl60Var);
                    if (str11 == null) {
                        throw f0b1.m40470x("activeUser", "activeUser", xl60Var);
                    }
                    i = -131073;
                    i2 &= i;
                    str = str17;
                    break;
                    break;
                case 18:
                    str12 = (String) this.f3401b.fromJson(xl60Var);
                    if (str12 == null) {
                        throw f0b1.m40470x("statusString", "statusString", xl60Var);
                    }
                    i = -262145;
                    i2 &= i;
                    str = str17;
                    break;
                    break;
                case 19:
                    bool2 = (Boolean) this.f3405f.fromJson(xl60Var);
                    if (bool2 == null) {
                        throw f0b1.m40470x("supportsStreamExpansion", "supportsStreamExpansion", xl60Var);
                    }
                    i = -524289;
                    i2 &= i;
                    str = str17;
                    break;
                    break;
                default:
                    str = str17;
                    break;
            }
        }
        String str18 = str;
        xl60Var.mo51078f();
        if (i2 == -1048545) {
            if (str18 == null) {
                throw f0b1.m40461o("deviceId", "deviceID", xl60Var);
            }
            if (str2 == null) {
                throw f0b1.m40461o("remoteName", "remoteName", xl60Var);
            }
            if (str3 == null) {
                throw f0b1.m40461o("brandDisplayName", "brandDisplayName", xl60Var);
            }
            if (str13 == null) {
                throw f0b1.m40461o("modelDisplayName", "modelDisplayName", xl60Var);
            }
            if (str14 == null) {
                throw f0b1.m40461o("ipAddress", "deviceAPI_ipAddress", xl60Var);
            }
            return new DiscoveredDevice(str18, str2, str3, str13, str14, str15, num.intValue(), str16, str4, num2.intValue(), str5, str6, num3, str7, str8, str9, str10, str11, str12, bool2.booleanValue());
        }
        Constructor declaredConstructor = this.f3406g;
        if (declaredConstructor == null) {
            Class cls = Boolean.TYPE;
            Class<?> cls2 = f0b1.f64588c;
            Class cls3 = Integer.TYPE;
            declaredConstructor = DiscoveredDevice.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, cls3, String.class, String.class, cls3, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls3, cls2);
            this.f3406g = declaredConstructor;
        }
        Constructor constructor = declaredConstructor;
        if (str18 == null) {
            throw f0b1.m40461o("deviceId", "deviceID", xl60Var);
        }
        if (str2 == null) {
            throw f0b1.m40461o("remoteName", "remoteName", xl60Var);
        }
        if (str3 == null) {
            throw f0b1.m40461o("brandDisplayName", "brandDisplayName", xl60Var);
        }
        if (str13 == null) {
            throw f0b1.m40461o("modelDisplayName", "modelDisplayName", xl60Var);
        }
        if (str14 == null) {
            throw f0b1.m40461o("ipAddress", "deviceAPI_ipAddress", xl60Var);
        }
        return (DiscoveredDevice) constructor.newInstance(str18, str2, str3, str13, str14, str15, num, str16, str4, num2, str5, str6, num3, str7, str8, str9, str10, str11, str12, bool2, Integer.valueOf(i2), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, DiscoveredDevice discoveredDevice) {
        DiscoveredDevice discoveredDevice2 = discoveredDevice;
        if (discoveredDevice2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("deviceID");
        String str = discoveredDevice2.deviceId;
        hk60 hk60Var = this.f3401b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("remoteName");
        hk60Var.toJson(rm60Var, discoveredDevice2.remoteName);
        rm60Var.mo56894s("brandDisplayName");
        hk60Var.toJson(rm60Var, discoveredDevice2.brandDisplayName);
        rm60Var.mo56894s("modelDisplayName");
        hk60Var.toJson(rm60Var, discoveredDevice2.modelDisplayName);
        rm60Var.mo56894s("deviceAPI_ipAddress");
        hk60Var.toJson(rm60Var, discoveredDevice2.ipAddress);
        rm60Var.mo56894s("version");
        hk60Var.toJson(rm60Var, discoveredDevice2.version);
        rm60Var.mo56894s("deviceAPI_isGroup");
        Integer numValueOf = Integer.valueOf(discoveredDevice2.isAudioGroup);
        hk60 hk60Var2 = this.f3402c;
        hk60Var2.toJson(rm60Var, numValueOf);
        rm60Var.mo56894s("deviceType");
        hk60Var.toJson(rm60Var, discoveredDevice2.deviceType);
        rm60Var.mo56894s("accountReq");
        hk60Var.toJson(rm60Var, discoveredDevice2.accountReq);
        rm60Var.mo56894s("status");
        hk60Var2.toJson(rm60Var, Integer.valueOf(discoveredDevice2.status));
        rm60Var.mo56894s("publicKey");
        hk60Var.toJson(rm60Var, discoveredDevice2.publicKey);
        rm60Var.mo56894s("libraryVersion");
        hk60Var.toJson(rm60Var, discoveredDevice2.libraryVersion);
        rm60Var.mo56894s("spotifyError");
        this.f3403d.toJson(rm60Var, discoveredDevice2.errorCode);
        rm60Var.mo56894s("tokenType");
        hk60Var.toJson(rm60Var, discoveredDevice2.tokenType);
        rm60Var.mo56894s("scope");
        String str2 = discoveredDevice2.scope;
        hk60 hk60Var3 = this.f3404e;
        hk60Var3.toJson(rm60Var, str2);
        rm60Var.mo56894s("clientID");
        hk60Var3.toJson(rm60Var, discoveredDevice2.p.kyx.b java.lang.String);
        rm60Var.mo56894s("deviceAPI_deviceClass");
        hk60Var.toJson(rm60Var, discoveredDevice2.deviceClass);
        rm60Var.mo56894s("activeUser");
        hk60Var.toJson(rm60Var, discoveredDevice2.activeUser);
        rm60Var.mo56894s("statusString");
        hk60Var.toJson(rm60Var, discoveredDevice2.statusString);
        rm60Var.mo56894s("supportsStreamExpansion");
        this.f3405f.toJson(rm60Var, Boolean.valueOf(discoveredDevice2.supportsStreamExpansion));
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(38, "GeneratedJsonAdapter(DiscoveredDevice)");
    }
}
