package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class ubc1 extends bcc1 {

    /* JADX INFO: renamed from: a */
    public final z0r f228689a;

    /* JADX INFO: renamed from: b */
    public final Uri f228690b;

    /* JADX INFO: renamed from: c */
    public final Uri f228691c;

    /* JADX INFO: renamed from: d */
    public final Uri f228692d;

    public ubc1(Uri uri, Uri uri2, Uri uri3, z0r z0rVar) {
        this.f228689a = z0rVar;
        this.f228690b = uri;
        this.f228691c = uri2;
        this.f228692d = uri3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubc1)) {
            return false;
        }
        ubc1 ubc1Var = (ubc1) obj;
        return wj50.m88271j(this.f228689a, ubc1Var.f228689a) && wj50.m88271j(this.f228690b, ubc1Var.f228690b) && wj50.m88271j(this.f228691c, ubc1Var.f228691c) && wj50.m88271j(this.f228692d, ubc1Var.f228692d);
    }

    public final int hashCode() {
        int iHashCode = this.f228689a.hashCode() * 31;
        Uri uri = this.f228690b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f228691c;
        int iHashCode3 = (iHashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.f228692d;
        return iHashCode3 + (uri3 != null ? uri3.hashCode() : 0);
    }
}
