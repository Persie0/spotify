package com.spotify.thestage.vtec.logic;

import java.lang.reflect.Constructor;
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
@Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m24212d2 = {"Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage_CompleteEditProfileJsonAdapter;", "Lp/hk60;", "Lcom/spotify/thestage/vtec/logic/VtecAndroidToWebMessage$CompleteEditProfile;", "Lp/p0i0;", "moshi", "<init>", "(Lp/p0i0;)V", "src_main_java_com_spotify_thestage_vtec-vtec"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class VtecAndroidToWebMessage_CompleteEditProfileJsonAdapter extends hk60<VtecAndroidToWebMessage$CompleteEditProfile> {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f6776a = xl60.C2578b.m91389a("updates");

    /* JADX INFO: renamed from: b */
    public final hk60 f6777b;

    /* JADX INFO: renamed from: c */
    public volatile Constructor f6778c;

    public VtecAndroidToWebMessage_CompleteEditProfileJsonAdapter(p0i0 p0i0Var) {
        this.f6777b = p0i0Var.m68706f(mp91.m62457j(List.class, String.class), gbu.f78413a, "updates");
    }

    @Override // p204p.hk60
    public final VtecAndroidToWebMessage$CompleteEditProfile fromJson(xl60 xl60Var) throws NoSuchMethodException {
        xl60Var.mo51076c();
        List list = null;
        int i = -1;
        while (xl60Var.mo51079i()) {
            int iMo51071K = xl60Var.mo51071K(this.f6776a);
            if (iMo51071K == -1) {
                xl60Var.mo51073P();
                xl60Var.mo51074Q();
            } else if (iMo51071K == 0) {
                list = (List) this.f6777b.fromJson(xl60Var);
                if (list == null) {
                    throw f0b1.m40470x("updates", "updates", xl60Var);
                }
                i = -3;
            } else {
                continue;
            }
        }
        xl60Var.mo51078f();
        if (i == -3) {
            return new VtecAndroidToWebMessage$CompleteEditProfile(null, list, 1, null);
        }
        Constructor declaredConstructor = this.f6778c;
        if (declaredConstructor == null) {
            declaredConstructor = VtecAndroidToWebMessage$CompleteEditProfile.class.getDeclaredConstructor(String.class, List.class, Integer.TYPE, f0b1.f64588c);
            this.f6778c = declaredConstructor;
        }
        return (VtecAndroidToWebMessage$CompleteEditProfile) declaredConstructor.newInstance(null, list, Integer.valueOf(i), null);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, VtecAndroidToWebMessage$CompleteEditProfile vtecAndroidToWebMessage$CompleteEditProfile) {
        VtecAndroidToWebMessage$CompleteEditProfile vtecAndroidToWebMessage$CompleteEditProfile2 = vtecAndroidToWebMessage$CompleteEditProfile;
        if (vtecAndroidToWebMessage$CompleteEditProfile2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rm60Var.mo56891e();
        rm60Var.mo56894s("updates");
        this.f6777b.toJson(rm60Var, vtecAndroidToWebMessage$CompleteEditProfile2.f6749d);
        rm60Var.mo56893i();
    }

    public final String toString() {
        return ydj.m93450i(65, "GeneratedJsonAdapter(VtecAndroidToWebMessage.CompleteEditProfile)");
    }
}
