package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class tv6 extends r9g1 {

    /* JADX INFO: renamed from: d */
    public final z0r f224068d;

    /* JADX INFO: renamed from: e */
    public final Uri f224069e;

    /* JADX INFO: renamed from: f */
    public final dw6 f224070f;

    public tv6(z0r z0rVar, Uri uri, dw6 dw6Var) {
        this.f224068d = z0rVar;
        this.f224069e = uri;
        this.f224070f = dw6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv6)) {
            return false;
        }
        tv6 tv6Var = (tv6) obj;
        return wj50.m88271j(this.f224068d, tv6Var.f224068d) && wj50.m88271j(this.f224069e, tv6Var.f224069e) && wj50.m88271j(this.f224070f, tv6Var.f224070f);
    }

    public final int hashCode() {
        int iHashCode = this.f224068d.hashCode() * 31;
        Uri uri = this.f224069e;
        return this.f224070f.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }
}
