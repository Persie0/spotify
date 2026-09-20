package p204p;

import com.spotify.thestage.vtec.logic.VtecWebToAndroidMessage$ShareRequested;

/* JADX INFO: loaded from: classes10.dex */
public final class w4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final VtecWebToAndroidMessage$ShareRequested f247791a;

    /* JADX INFO: renamed from: b */
    public final boolean f247792b;

    /* JADX INFO: renamed from: c */
    public final String f247793c;

    /* JADX INFO: renamed from: d */
    public final String f247794d;

    public w4d1(VtecWebToAndroidMessage$ShareRequested vtecWebToAndroidMessage$ShareRequested, boolean z, String str, String str2) {
        this.f247791a = vtecWebToAndroidMessage$ShareRequested;
        this.f247792b = z;
        this.f247793c = str;
        this.f247794d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4d1)) {
            return false;
        }
        w4d1 w4d1Var = (w4d1) obj;
        return wj50.m88271j(this.f247791a, w4d1Var.f247791a) && this.f247792b == w4d1Var.f247792b && wj50.m88271j(this.f247793c, w4d1Var.f247793c) && wj50.m88271j(this.f247794d, w4d1Var.f247794d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(this.f247791a.hashCode() * 31, 31, this.f247792b), 31, this.f247793c);
        String str = this.f247794d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
