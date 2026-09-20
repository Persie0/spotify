package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class me00 {

    /* JADX INFO: renamed from: a */
    public final re00 f142550a;

    /* JADX INFO: renamed from: b */
    public final z0r f142551b;

    /* JADX INFO: renamed from: c */
    public final Uri f142552c;

    public me00(re00 re00Var, z0r z0rVar, Uri uri) {
        this.f142550a = re00Var;
        this.f142551b = z0rVar;
        this.f142552c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me00)) {
            return false;
        }
        me00 me00Var = (me00) obj;
        return wj50.m88271j(this.f142550a, me00Var.f142550a) && wj50.m88271j(this.f142551b, me00Var.f142551b) && wj50.m88271j(this.f142552c, me00Var.f142552c);
    }

    public final int hashCode() {
        int iHashCode = (this.f142551b.hashCode() + (this.f142550a.hashCode() * 31)) * 31;
        Uri uri = this.f142552c;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
