package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class zvs0 {

    /* JADX INFO: renamed from: a */
    public final sr01 f286765a;

    /* JADX INFO: renamed from: b */
    public final z0r f286766b;

    /* JADX INFO: renamed from: c */
    public final Uri f286767c;

    /* JADX INFO: renamed from: d */
    public final Uri f286768d;

    public zvs0(sr01 sr01Var, z0r z0rVar, Uri uri, Uri uri2) {
        this.f286765a = sr01Var;
        this.f286766b = z0rVar;
        this.f286767c = uri;
        this.f286768d = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvs0)) {
            return false;
        }
        zvs0 zvs0Var = (zvs0) obj;
        return wj50.m88271j(this.f286765a, zvs0Var.f286765a) && wj50.m88271j(this.f286766b, zvs0Var.f286766b) && wj50.m88271j(this.f286767c, zvs0Var.f286767c) && wj50.m88271j(this.f286768d, zvs0Var.f286768d);
    }

    public final int hashCode() {
        int iHashCode = (this.f286766b.hashCode() + (this.f286765a.hashCode() * 31)) * 31;
        Uri uri = this.f286767c;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f286768d;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
