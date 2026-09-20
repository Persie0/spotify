package com.spotify.thestage.vtec.logic;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import p204p.f0b1;
import p204p.gbu;
import p204p.hk60;
import p204p.p0i0;
import p204p.rm60;
import p204p.xl60;
import p204p.ydj;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage_BetaMessageJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$BetaMessage;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecAndroidToWebMessage_BetaMessageJsonAdapter extends hk60<VtecAndroidToWebMessage$BetaMessage> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6771a = xl60.C2578b.m91389a("betaType", "data");

    /* JADX INFO: renamed from: b */
    public final hk60 f6772b;

    /* JADX INFO: renamed from: c */
    public final hk60 f6773c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f6774d;

    public VtecAndroidToWebMessage_BetaMessageJsonAdapter(p0i0 p0i0Var) {
        gbu gbuVar = gbu.f78413a;
        this.f6772b = p0i0Var.m68706f(String.class, gbuVar, "betaType");
        this.f6773c = p0i0Var.m68706f(Object.class, gbuVar, "data");
    }

    @Override // p204p.hk60
    public final VtecAndroidToWebMessage$BetaMessage fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        String str = null;
        Object objFromJson = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6771a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                str = (String) this.f6772b.fromJson(xl60Var);
                if (str == null) {
                    throw f0b1.m40470x("betaType", "betaType", xl60Var);
                }
            } else if (iMo51071K == 1) {
                objFromJson = this.f6773c.fromJson(xl60Var);
                i = -3;
            }
        }
        xl60Var.mo51078f();
        if (i == -3) {
            if (str != null) {
                return new VtecAndroidToWebMessage$BetaMessage(str, objFromJson);
            }
            throw f0b1.m40461o("betaType", "betaType", xl60Var);
        }
        Constructor declaredConstructor = this.f6774d;
        if (declaredConstructor == null) {
            declaredConstructor = VtecAndroidToWebMessage$BetaMessage.class.getDeclaredConstructor(String.class, Object.class, Integer.TYPE, f0b1.f64588c);
            this.f6774d = declaredConstructor;
        }
        if (str != null) {
            return (VtecAndroidToWebMessage$BetaMessage) declaredConstructor.newInstance(str, objFromJson, Integer.valueOf(i), null);
        }
        throw f0b1.m40461o("betaType", "betaType", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecAndroidToWebMessage$BetaMessage vtecAndroidToWebMessage$BetaMessage) {
        VtecAndroidToWebMessage$BetaMessage vtecAndroidToWebMessage$BetaMessage2 = vtecAndroidToWebMessage$BetaMessage;
        if (vtecAndroidToWebMessage$BetaMessage2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("betaType");
        this.f6772b.toJson(rm60Var, vtecAndroidToWebMessage$BetaMessage2.f6745c);
        rm60Var.mo56894s("data");
        this.f6773c.toJson(rm60Var, vtecAndroidToWebMessage$BetaMessage2.f6746d);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(57, "GeneratedJsonAdapter(VtecAndroidToWebMessage.BetaMessage)");
    }
}
