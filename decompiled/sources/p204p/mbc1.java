package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class mbc1 implements qbc1 {

    /* JADX INFO: renamed from: a */
    public final z0r f141874a;

    /* JADX INFO: renamed from: b */
    public final Uri f141875b;

    /* JADX INFO: renamed from: c */
    public final Uri f141876c;

    /* JADX INFO: renamed from: d */
    public final Uri f141877d;

    /* JADX INFO: renamed from: e */
    public final hcc1 f141878e;

    public mbc1(z0r z0rVar, Uri uri, Uri uri2, Uri uri3, hcc1 hcc1Var) {
        this.f141874a = z0rVar;
        this.f141875b = uri;
        this.f141876c = uri2;
        this.f141877d = uri3;
        this.f141878e = hcc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbc1)) {
            return false;
        }
        mbc1 mbc1Var = (mbc1) obj;
        return wj50.m88271j(this.f141874a, mbc1Var.f141874a) && wj50.m88271j(this.f141875b, mbc1Var.f141875b) && wj50.m88271j(this.f141876c, mbc1Var.f141876c) && wj50.m88271j(this.f141877d, mbc1Var.f141877d) && wj50.m88271j(this.f141878e, mbc1Var.f141878e);
    }

    public final int hashCode() {
        int iHashCode = this.f141874a.hashCode() * 31;
        Uri uri = this.f141875b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f141876c;
        int iHashCode3 = (iHashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Uri uri3 = this.f141877d;
        return this.f141878e.hashCode() + ((iHashCode3 + (uri3 != null ? uri3.hashCode() : 0)) * 31);
    }
}
