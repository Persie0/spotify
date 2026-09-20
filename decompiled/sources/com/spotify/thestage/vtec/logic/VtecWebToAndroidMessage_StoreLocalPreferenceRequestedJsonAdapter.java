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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecWebToAndroidMessage_StoreLocalPreferenceRequestedJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecWebToAndroidMessage$StoreLocalPreferenceRequested;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecWebToAndroidMessage_StoreLocalPreferenceRequestedJsonAdapter extends hk60<VtecWebToAndroidMessage$StoreLocalPreferenceRequested> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6869a = xl60.C2578b.m91389a("value");

    /* JADX INFO: renamed from: b */
    public final hk60 f6870b;

    public VtecWebToAndroidMessage_StoreLocalPreferenceRequestedJsonAdapter(p0i0 p0i0Var) {
        this.f6870b = p0i0Var.m68706f(String.class, gbu.f78413a, "value");
    }

    @Override // p204p.hk60
    public final VtecWebToAndroidMessage$StoreLocalPreferenceRequested fromJson(xl60 xl60Var) {
        xl60Var.mo51076c();
        String str = null;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6869a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0 && (str = (String) this.f6870b.fromJson(xl60Var)) == null) {
                throw f0b1.m40470x("value__", "value", xl60Var);
            }
        }
        xl60Var.mo51078f();
        if (str != null) {
            return new VtecWebToAndroidMessage$StoreLocalPreferenceRequested(null, str, 1, null);
        }
        throw f0b1.m40461o("value__", "value", xl60Var);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecWebToAndroidMessage$StoreLocalPreferenceRequested vtecWebToAndroidMessage$StoreLocalPreferenceRequested) {
        VtecWebToAndroidMessage$StoreLocalPreferenceRequested vtecWebToAndroidMessage$StoreLocalPreferenceRequested2 = vtecWebToAndroidMessage$StoreLocalPreferenceRequested;
        if (vtecWebToAndroidMessage$StoreLocalPreferenceRequested2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("value");
        this.f6870b.toJson(rm60Var, vtecWebToAndroidMessage$StoreLocalPreferenceRequested2.f6835b);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(75, "GeneratedJsonAdapter(VtecWebToAndroidMessage.StoreLocalPreferenceRequested)");
    }
}
