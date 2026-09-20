package com.spotify.thestage.vtec.logic;

import java.util.List;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.mp91;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage_ReadyJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$Ready;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecAndroidToWebMessage_ReadyJsonAdapter extends hk60<VtecAndroidToWebMessage$Ready> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6788a = xl60.C2578b.m91389a("capabilities", "windowHasFocus", "playbackState", "isCheckoutActive", "appVersion", "sessionId", "rawLocalPrefs", "lookupToken", "shareDestinations");

    /* JADX INFO: renamed from: b */
    public final hk60 f6789b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6790c;

    /* JADX INFO: renamed from: d */
    public final hk60 f6791d;

    /* JADX INFO: renamed from: e */
    public final hk60 f6792e;

    /* JADX INFO: renamed from: f */
    public final hk60 f6793f;

    /* JADX INFO: renamed from: g */
    public final hk60 f6794g;

    public VtecAndroidToWebMessage_ReadyJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6789b = p0i0Var.m68706f(Capabilities.class, gbuVar, "capabilities");
        this.f6790c = p0i0Var.m68706f(Boolean.TYPE, gbuVar, "windowHasFocus");
        this.f6791d = p0i0Var.m68706f(VtecAndroidToWebMessage$PlaybackStatusChanged.class, gbuVar, "playbackState");
        this.f6792e = p0i0Var.m68706f(String.class, gbuVar, "appVersion");
        this.f6793f = p0i0Var.m68706f(String.class, gbuVar, "rawLocalPrefs");
        this.f6794g = p0i0Var.m68706f(mp91.m62457j(List.class, String.class), gbuVar, "shareDestinations");
    }

    @Override // p204p.hk60
    public final VtecAndroidToWebMessage$Ready fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        Boolean bool = null;
        Boolean bool2 = null;
        Capabilities capabilities = null;
        VtecAndroidToWebMessage$PlaybackStatusChanged vtecAndroidToWebMessage$PlaybackStatusChanged = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (true) {
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            Capabilities capabilities2 = capabilities;
            if (!xl60Var.mo51079i()) {
                VtecAndroidToWebMessage$PlaybackStatusChanged vtecAndroidToWebMessage$PlaybackStatusChanged2 = vtecAndroidToWebMessage$PlaybackStatusChanged;
                xl60Var.mo51078f();
                if (capabilities2 == null) {
                    throw f0b1.m40461o("capabilities", "capabilities", xl60Var);
                }
                if (bool3 == null) {
                    throw f0b1.m40461o("windowHasFocus", "windowHasFocus", xl60Var);
                }
                boolean zBooleanValue = bool3.booleanValue();
                if (bool4 == null) {
                    throw f0b1.m40461o("isCheckoutActive", "isCheckoutActive", xl60Var);
                }
                boolean zBooleanValue2 = bool4.booleanValue();
                if (str == null) {
                    throw f0b1.m40461o("appVersion", "appVersion", xl60Var);
                }
                if (str2 == null) {
                    throw f0b1.m40461o("sessionId", "sessionId", xl60Var);
                }
                if (str4 == null) {
                    throw f0b1.m40461o("lookupToken", "lookupToken", xl60Var);
                }
                if (list != null) {
                    return new VtecAndroidToWebMessage$Ready(capabilities2, zBooleanValue, vtecAndroidToWebMessage$PlaybackStatusChanged2, zBooleanValue2, str, str2, str3, str4, list);
                }
                throw f0b1.m40461o("shareDestinations", "shareDestinations", xl60Var);
            }
            int iMo51071K = xl60Var.mo51071K(this.f6788a);
            hk60 hk60Var = this.f6790c;
            VtecAndroidToWebMessage$PlaybackStatusChanged vtecAndroidToWebMessage$PlaybackStatusChanged3 = vtecAndroidToWebMessage$PlaybackStatusChanged;
            hk60 hk60Var2 = this.f6792e;
            switch (iMo51071K) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    bool = bool3;
                    bool2 = bool4;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                case 0:
                    capabilities = (Capabilities) this.f6789b.fromJson(xl60Var);
                    if (capabilities == null) {
                        throw f0b1.m40470x("capabilities", "capabilities", xl60Var);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                    break;
                case 1:
                    bool = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool == null) {
                        throw f0b1.m40470x("windowHasFocus", "windowHasFocus", xl60Var);
                    }
                    bool2 = bool4;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                case 2:
                    vtecAndroidToWebMessage$PlaybackStatusChanged = (VtecAndroidToWebMessage$PlaybackStatusChanged) this.f6791d.fromJson(xl60Var);
                    bool = bool3;
                    bool2 = bool4;
                    capabilities = capabilities2;
                    break;
                case 3:
                    bool2 = (Boolean) hk60Var.fromJson(xl60Var);
                    if (bool2 == null) {
                        throw f0b1.m40470x("isCheckoutActive", "isCheckoutActive", xl60Var);
                    }
                    bool = bool3;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                    break;
                case 4:
                    str = (String) hk60Var2.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x("appVersion", "appVersion", xl60Var);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                case 5:
                    str2 = (String) hk60Var2.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("sessionId", "sessionId", xl60Var);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                case 6:
                    str3 = (String) this.f6793f.fromJson(xl60Var);
                    bool = bool3;
                    bool2 = bool4;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                case 7:
                    str4 = (String) hk60Var2.fromJson(xl60Var);
                    if (str4 == null) {
                        throw f0b1.m40470x("lookupToken", "lookupToken", xl60Var);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                case 8:
                    list = (List) this.f6794g.fromJson(xl60Var);
                    if (list == null) {
                        throw f0b1.m40470x("shareDestinations", "shareDestinations", xl60Var);
                    }
                    bool = bool3;
                    bool2 = bool4;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
                default:
                    bool = bool3;
                    bool2 = bool4;
                    capabilities = capabilities2;
                    vtecAndroidToWebMessage$PlaybackStatusChanged = vtecAndroidToWebMessage$PlaybackStatusChanged3;
                    break;
            }
        }
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecAndroidToWebMessage$Ready vtecAndroidToWebMessage$Ready) {
        VtecAndroidToWebMessage$Ready vtecAndroidToWebMessage$Ready2 = vtecAndroidToWebMessage$Ready;
        if (vtecAndroidToWebMessage$Ready2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("capabilities");
        this.f6789b.toJson(rm60Var, vtecAndroidToWebMessage$Ready2.f6758c);
        rm60Var.mo56894s("windowHasFocus");
        boolean z = vtecAndroidToWebMessage$Ready2.f6759d;
        hk60 hk60Var = this.f6790c;
        ydj.m93455n(z, hk60Var, rm60Var, "playbackState");
        this.f6791d.toJson(rm60Var, vtecAndroidToWebMessage$Ready2.f6760e);
        rm60Var.mo56894s("isCheckoutActive");
        ydj.m93455n(vtecAndroidToWebMessage$Ready2.f6761f, hk60Var, rm60Var, "appVersion");
        String str = vtecAndroidToWebMessage$Ready2.f6762g;
        hk60 hk60Var2 = this.f6792e;
        hk60Var2.toJson(rm60Var, str);
        rm60Var.mo56894s("sessionId");
        hk60Var2.toJson(rm60Var, vtecAndroidToWebMessage$Ready2.f6763h);
        rm60Var.mo56894s("rawLocalPrefs");
        this.f6793f.toJson(rm60Var, vtecAndroidToWebMessage$Ready2.f6764i);
        rm60Var.mo56894s("lookupToken");
        hk60Var2.toJson(rm60Var, vtecAndroidToWebMessage$Ready2.f6765j);
        rm60Var.mo56894s("shareDestinations");
        this.f6794g.toJson(rm60Var, vtecAndroidToWebMessage$Ready2.f6766k);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(51, "GeneratedJsonAdapter(VtecAndroidToWebMessage.Ready)");
    }
}
