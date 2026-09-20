package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class wqb1 extends arb1 {

    /* JADX INFO: renamed from: a */
    public final z0r f253994a;

    /* JADX INFO: renamed from: b */
    public final Uri f253995b;

    /* JADX INFO: renamed from: c */
    public final Uri f253996c;

    public wqb1(z0r z0rVar, Uri uri, Uri uri2) {
        this.f253994a = z0rVar;
        this.f253995b = uri;
        this.f253996c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqb1)) {
            return false;
        }
        wqb1 wqb1Var = (wqb1) obj;
        return wj50.m88271j(this.f253994a, wqb1Var.f253994a) && wj50.m88271j(this.f253995b, wqb1Var.f253995b) && wj50.m88271j(this.f253996c, wqb1Var.f253996c);
    }

    public final int hashCode() {
        int iHashCode = this.f253994a.hashCode() * 31;
        Uri uri = this.f253995b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f253996c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
