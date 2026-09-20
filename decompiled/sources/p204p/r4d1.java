package p204p;

import com.spotify.thestage.vtec.logic.VtecWebToAndroidMessage$IDTokenRequested;

/* JADX INFO: loaded from: classes10.dex */
public final class r4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final VtecWebToAndroidMessage$IDTokenRequested f195725a;

    /* JADX INFO: renamed from: b */
    public final String f195726b;

    /* JADX INFO: renamed from: c */
    public final String f195727c;

    public r4d1(VtecWebToAndroidMessage$IDTokenRequested vtecWebToAndroidMessage$IDTokenRequested, String str, String str2) {
        this.f195725a = vtecWebToAndroidMessage$IDTokenRequested;
        this.f195726b = str;
        this.f195727c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4d1)) {
            return false;
        }
        r4d1 r4d1Var = (r4d1) obj;
        return wj50.m88271j(this.f195725a, r4d1Var.f195725a) && wj50.m88271j(this.f195726b, r4d1Var.f195726b) && wj50.m88271j(this.f195727c, r4d1Var.f195727c);
    }

    public final int hashCode() {
        return this.f195727c.hashCode() + s571.m77243b(this.f195725a.f6809a.hashCode() * 31, 31, this.f195726b);
    }
}
