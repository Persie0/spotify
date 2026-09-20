package p204p;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes8.dex */
public final class w8b1 {

    /* JADX INFO: renamed from: a */
    public final String f248895a;

    /* JADX INFO: renamed from: b */
    public final String f248896b;

    /* JADX INFO: renamed from: c */
    public final String f248897c;

    /* JADX INFO: renamed from: d */
    public final LatLng f248898d;

    /* JADX INFO: renamed from: e */
    public final u8b1 f248899e;

    public w8b1(String str, String str2, String str3, LatLng latLng, u8b1 u8b1Var) {
        this.f248895a = str;
        this.f248896b = str2;
        this.f248897c = str3;
        this.f248898d = latLng;
        this.f248899e = u8b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8b1)) {
            return false;
        }
        w8b1 w8b1Var = (w8b1) obj;
        return wj50.m88271j(this.f248895a, w8b1Var.f248895a) && wj50.m88271j(this.f248896b, w8b1Var.f248896b) && wj50.m88271j(this.f248897c, w8b1Var.f248897c) && wj50.m88271j(this.f248898d, w8b1Var.f248898d) && wj50.m88271j(this.f248899e, w8b1Var.f248899e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f248895a.hashCode() * 31, 31, this.f248896b);
        String str = this.f248897c;
        int iHashCode = (this.f248898d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        u8b1 u8b1Var = this.f248899e;
        return iHashCode + (u8b1Var != null ? u8b1Var.hashCode() : 0);
    }
}
