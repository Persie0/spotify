package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class ho8 extends ko8 {

    /* JADX INFO: renamed from: a */
    public final z0r f93477a;

    /* JADX INFO: renamed from: b */
    public final Uri f93478b;

    /* JADX INFO: renamed from: c */
    public final Uri f93479c;

    public ho8(z0r z0rVar, Uri uri, Uri uri2) {
        this.f93477a = z0rVar;
        this.f93478b = uri;
        this.f93479c = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho8)) {
            return false;
        }
        ho8 ho8Var = (ho8) obj;
        return wj50.m88271j(this.f93477a, ho8Var.f93477a) && wj50.m88271j(this.f93478b, ho8Var.f93478b) && wj50.m88271j(this.f93479c, ho8Var.f93479c);
    }

    public final int hashCode() {
        int iHashCode = this.f93477a.hashCode() * 31;
        Uri uri = this.f93478b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f93479c;
        return iHashCode2 + (uri2 != null ? uri2.hashCode() : 0);
    }
}
