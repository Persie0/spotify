package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class rqb1 {

    /* JADX INFO: renamed from: a */
    public final sr01 f201792a;

    /* JADX INFO: renamed from: b */
    public final z0r f201793b;

    /* JADX INFO: renamed from: c */
    public final c3r f201794c;

    /* JADX INFO: renamed from: d */
    public final Uri f201795d;

    /* JADX INFO: renamed from: e */
    public final Uri f201796e;

    public rqb1(sr01 sr01Var, z0r z0rVar, c3r c3rVar, Uri uri, Uri uri2) {
        this.f201792a = sr01Var;
        this.f201793b = z0rVar;
        this.f201794c = c3rVar;
        this.f201795d = uri;
        this.f201796e = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqb1)) {
            return false;
        }
        rqb1 rqb1Var = (rqb1) obj;
        return wj50.m88271j(this.f201792a, rqb1Var.f201792a) && wj50.m88271j(this.f201793b, rqb1Var.f201793b) && this.f201794c.equals(rqb1Var.f201794c) && wj50.m88271j(this.f201795d, rqb1Var.f201795d) && wj50.m88271j(this.f201796e, rqb1Var.f201796e);
    }

    public final int hashCode() {
        int iHashCode = (this.f201794c.hashCode() + ((this.f201793b.hashCode() + (this.f201792a.hashCode() * 31)) * 31)) * 31;
        Uri uri = this.f201795d;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f201796e;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
