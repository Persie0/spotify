package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class xv6 extends bw6 {

    /* JADX INFO: renamed from: a */
    public final z0r f266288a;

    /* JADX INFO: renamed from: b */
    public final Uri f266289b;

    public xv6(Uri uri, z0r z0rVar) {
        this.f266288a = z0rVar;
        this.f266289b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv6)) {
            return false;
        }
        xv6 xv6Var = (xv6) obj;
        return wj50.m88271j(this.f266288a, xv6Var.f266288a) && wj50.m88271j(this.f266289b, xv6Var.f266289b);
    }

    public final int hashCode() {
        int iHashCode = this.f266288a.hashCode() * 31;
        Uri uri = this.f266289b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
