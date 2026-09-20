package p204p;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes8.dex */
public final class a9b1 {

    /* JADX INFO: renamed from: a */
    public final String f13531a;

    /* JADX INFO: renamed from: b */
    public final String f13532b;

    /* JADX INFO: renamed from: c */
    public final String f13533c;

    /* JADX INFO: renamed from: d */
    public final LatLng f13534d;

    /* JADX INFO: renamed from: e */
    public final u8b1 f13535e;

    public a9b1(String str, String str2, String str3, LatLng latLng, u8b1 u8b1Var) {
        this.f13531a = str;
        this.f13532b = str2;
        this.f13533c = str3;
        this.f13534d = latLng;
        this.f13535e = u8b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9b1)) {
            return false;
        }
        a9b1 a9b1Var = (a9b1) obj;
        return wj50.m88271j(this.f13531a, a9b1Var.f13531a) && wj50.m88271j(this.f13532b, a9b1Var.f13532b) && wj50.m88271j(this.f13533c, a9b1Var.f13533c) && wj50.m88271j(this.f13534d, a9b1Var.f13534d) && wj50.m88271j(this.f13535e, a9b1Var.f13535e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f13531a.hashCode() * 31, 31, this.f13532b);
        String str = this.f13533c;
        int iHashCode = (this.f13534d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        u8b1 u8b1Var = this.f13535e;
        return iHashCode + (u8b1Var != null ? u8b1Var.hashCode() : 0);
    }
}
