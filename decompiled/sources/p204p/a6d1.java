package p204p;

import com.spotify.thestage.vtec.logic.VtecWebToAndroidMessage$ShareRequested;

/* JADX INFO: loaded from: classes10.dex */
public final class a6d1 extends e6d1 {

    /* JADX INFO: renamed from: a */
    public final VtecWebToAndroidMessage$ShareRequested f12775a;

    /* JADX INFO: renamed from: b */
    public final String f12776b;

    /* JADX INFO: renamed from: c */
    public final String f12777c;

    public a6d1(VtecWebToAndroidMessage$ShareRequested vtecWebToAndroidMessage$ShareRequested, String str, String str2) {
        this.f12775a = vtecWebToAndroidMessage$ShareRequested;
        this.f12776b = str;
        this.f12777c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6d1)) {
            return false;
        }
        a6d1 a6d1Var = (a6d1) obj;
        return wj50.m88271j(this.f12775a, a6d1Var.f12775a) && wj50.m88271j(this.f12776b, a6d1Var.f12776b) && wj50.m88271j(this.f12777c, a6d1Var.f12777c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f12775a.hashCode() * 31, 31, this.f12776b);
        String str = this.f12777c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
