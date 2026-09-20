package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class g2m {

    /* JADX INFO: renamed from: a */
    public final z0r f75971a;

    /* JADX INFO: renamed from: b */
    public final Uri f75972b;

    /* JADX INFO: renamed from: c */
    public final Uri f75973c;

    /* JADX INFO: renamed from: d */
    public final Uri f75974d;

    public g2m(Uri uri, Uri uri2, Uri uri3, z0r z0rVar) {
        this.f75971a = z0rVar;
        this.f75972b = uri;
        this.f75973c = uri2;
        this.f75974d = uri3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2m)) {
            return false;
        }
        g2m g2mVar = (g2m) obj;
        return wj50.m88271j(this.f75971a, g2mVar.f75971a) && wj50.m88271j(this.f75972b, g2mVar.f75972b) && wj50.m88271j(this.f75973c, g2mVar.f75973c) && wj50.m88271j(this.f75974d, g2mVar.f75974d);
    }

    public final int hashCode() {
        int iHashCode = this.f75971a.hashCode() * 31;
        Uri uri = this.f75972b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f75973c;
        int iHashCode3 = (iHashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.f75974d;
        return iHashCode3 + (uri3 != null ? uri3.hashCode() : 0);
    }
}
