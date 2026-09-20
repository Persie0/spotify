package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class pu6 extends wu6 {

    /* JADX INFO: renamed from: a */
    public final z0r f181371a;

    /* JADX INFO: renamed from: b */
    public final Uri f181372b;

    public pu6(Uri uri, z0r z0rVar) {
        this.f181371a = z0rVar;
        this.f181372b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu6)) {
            return false;
        }
        pu6 pu6Var = (pu6) obj;
        return wj50.m88271j(this.f181371a, pu6Var.f181371a) && wj50.m88271j(this.f181372b, pu6Var.f181372b);
    }

    public final int hashCode() {
        int iHashCode = this.f181371a.hashCode() * 31;
        Uri uri = this.f181372b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
