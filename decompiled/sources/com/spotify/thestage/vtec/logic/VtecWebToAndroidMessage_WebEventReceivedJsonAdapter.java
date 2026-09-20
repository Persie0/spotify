package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.kyx;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecWebToAndroidMessage_WebEventReceivedJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$WebEventReceived;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecWebToAndroidMessage_WebEventReceivedJsonAdapter extends hk60<VtecWebToAndroidMessage$WebEventReceived> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6873a = xl60.C2578b.m91389a(kyx.f127932c, "action", "label", "value");

    /* JADX INFO: renamed from: b */
    public final hk60 f6874b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6875c;

    public VtecWebToAndroidMessage_WebEventReceivedJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6874b = p0i0Var.m68706f(String.class, gbuVar, kyx.f127932c);
        this.f6875c = p0i0Var.m68706f(String.class, gbuVar, "label");
    }

    @Override // p204p.hk60
    public final VtecWebToAndroidMessage$WebEventReceived fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6873a);
            if (iMo51071K != -1) {
                hk60 hk60Var = this.f6874b;
                if (iMo51071K == 0) {
                    str = (String) hk60Var.fromJson(xl60Var);
                    if (str == null) {
                        throw f0b1.m40470x(kyx.f127932c, kyx.f127932c, xl60Var);
                    }
                } else if (iMo51071K != 1) {
                    hk60 hk60Var2 = this.f6875c;
                    if (iMo51071K == 2) {
                        str3 = (String) hk60Var2.fromJson(xl60Var);
                    } else if (iMo51071K == 3) {
                        str4 = (String) hk60Var2.fromJson(xl60Var);
                    }
                } else {
                    str2 = (String) hk60Var.fromJson(xl60Var);
                    if (str2 == null) {
                        throw f0b1.m40470x("action", "action", xl60Var);
                    }
                }
            } else {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            }
        }
        xl60Var.mo51078f();
        if (str == null) {
            throw f0b1.m40461o(kyx.f127932c, kyx.f127932c, xl60Var);
        }
        if (str2 != null) {
            return new VtecWebToAndroidMessage$WebEventReceived(null, str, str2, str3, str4, 1, null);
        }
        throw f0b1.m40461o("action", "action", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecWebToAndroidMessage$WebEventReceived vtecWebToAndroidMessage$WebEventReceived) {
        VtecWebToAndroidMessage$WebEventReceived vtecWebToAndroidMessage$WebEventReceived2 = vtecWebToAndroidMessage$WebEventReceived;
        if (vtecWebToAndroidMessage$WebEventReceived2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s(kyx.f127932c);
        String str = vtecWebToAndroidMessage$WebEventReceived2.f6839b;
        hk60 hk60Var = this.f6874b;
        hk60Var.toJson(rm60Var, str);
        rm60Var.mo56894s("action");
        hk60Var.toJson(rm60Var, vtecWebToAndroidMessage$WebEventReceived2.f6840c);
        rm60Var.mo56894s("label");
        String str2 = vtecWebToAndroidMessage$WebEventReceived2.f6841d;
        hk60 hk60Var2 = this.f6875c;
        hk60Var2.toJson(rm60Var, str2);
        rm60Var.mo56894s("value");
        hk60Var2.toJson(rm60Var, vtecWebToAndroidMessage$WebEventReceived2.f6842e);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(62, "GeneratedJsonAdapter(VtecWebToAndroidMessage.WebEventReceived)");
    }
}
