package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class pki0 extends fag1 {

    /* JADX INFO: renamed from: d */
    public final gli0 f178466d;

    /* JADX INFO: renamed from: e */
    public final z0r f178467e;

    /* JADX INFO: renamed from: f */
    public final Uri f178468f;

    /* JADX INFO: renamed from: g */
    public final Uri f178469g;

    /* JADX INFO: renamed from: h */
    public final int f178470h;

    public pki0(gli0 gli0Var, z0r z0rVar, Uri uri, Uri uri2, int i) {
        this.f178466d = gli0Var;
        this.f178467e = z0rVar;
        this.f178468f = uri;
        this.f178469g = uri2;
        this.f178470h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pki0)) {
            return false;
        }
        pki0 pki0Var = (pki0) obj;
        return wj50.m88271j(this.f178466d, pki0Var.f178466d) && wj50.m88271j(this.f178467e, pki0Var.f178467e) && wj50.m88271j(this.f178468f, pki0Var.f178468f) && wj50.m88271j(this.f178469g, pki0Var.f178469g) && this.f178470h == pki0Var.f178470h;
    }

    public final int hashCode() {
        int iHashCode = (this.f178467e.hashCode() + (this.f178466d.hashCode() * 31)) * 31;
        Uri uri = this.f178468f;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f178469g;
        return Integer.hashCode(this.f178470h) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }
}
