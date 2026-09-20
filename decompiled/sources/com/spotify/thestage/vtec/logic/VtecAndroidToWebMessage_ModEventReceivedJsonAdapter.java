package com.spotify.thestage.vtec.logic;

import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage_ModEventReceivedJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$ModEventReceived;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecAndroidToWebMessage_ModEventReceivedJsonAdapter extends hk60<VtecAndroidToWebMessage$ModEventReceived> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6784a = xl60.C2578b.m91389a("payload");

    /* JADX INFO: renamed from: b */
    public final hk60 f6785b;

    public VtecAndroidToWebMessage_ModEventReceivedJsonAdapter(p0i0 p0i0Var) {
        this.f6785b = p0i0Var.m68706f(ModPayload.class, gbu.f78413a, "payload");
    }

    @Override // p204p.hk60
    public final VtecAndroidToWebMessage$ModEventReceived fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        ModPayload modPayload = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6784a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0 && (modPayload = (ModPayload) this.f6785b.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("payload", "payload", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (modPayload != null) {
            return new VtecAndroidToWebMessage$ModEventReceived(modPayload);
        }
        throw f0b1.m40461o("payload", "payload", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecAndroidToWebMessage$ModEventReceived vtecAndroidToWebMessage$ModEventReceived) {
        VtecAndroidToWebMessage$ModEventReceived vtecAndroidToWebMessage$ModEventReceived2 = vtecAndroidToWebMessage$ModEventReceived;
        if (vtecAndroidToWebMessage$ModEventReceived2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("payload");
        this.f6785b.toJson(rm60Var, vtecAndroidToWebMessage$ModEventReceived2.f6755c);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(62, "GeneratedJsonAdapter(VtecAndroidToWebMessage.ModEventReceived)");
    }
}
