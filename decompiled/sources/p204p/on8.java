package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class on8 extends qkg1 {

    /* JADX INFO: renamed from: c */
    public final mo8 f167189c;

    /* JADX INFO: renamed from: d */
    public final z0r f167190d;

    /* JADX INFO: renamed from: e */
    public final Uri f167191e;

    /* JADX INFO: renamed from: f */
    public final Uri f167192f;

    public on8(mo8 mo8Var, z0r z0rVar, Uri uri, Uri uri2) {
        this.f167189c = mo8Var;
        this.f167190d = z0rVar;
        this.f167191e = uri;
        this.f167192f = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on8)) {
            return false;
        }
        on8 on8Var = (on8) obj;
        return wj50.m88271j(this.f167189c, on8Var.f167189c) && wj50.m88271j(this.f167190d, on8Var.f167190d) && wj50.m88271j(this.f167191e, on8Var.f167191e) && wj50.m88271j(this.f167192f, on8Var.f167192f);
    }

    public final int hashCode() {
        int iHashCode = (this.f167190d.hashCode() + (this.f167189c.hashCode() * 31)) * 31;
        Uri uri = this.f167191e;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f167192f;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
