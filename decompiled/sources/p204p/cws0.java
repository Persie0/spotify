package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class cws0 extends gws0 {

    /* JADX INFO: renamed from: a */
    public final z0r f42807a;

    /* JADX INFO: renamed from: b */
    public final Uri f42808b;

    /* JADX INFO: renamed from: c */
    public final Uri f42809c;

    public cws0(z0r z0rVar, Uri uri, Uri uri2) {
        this.f42807a = z0rVar;
        this.f42808b = uri;
        this.f42809c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cws0)) {
            return false;
        }
        cws0 cws0Var = (cws0) obj;
        return wj50.m88271j(this.f42807a, cws0Var.f42807a) && wj50.m88271j(this.f42808b, cws0Var.f42808b) && wj50.m88271j(this.f42809c, cws0Var.f42809c);
    }

    public final int hashCode() {
        int iHashCode = this.f42807a.hashCode() * 31;
        Uri uri = this.f42808b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f42809c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
