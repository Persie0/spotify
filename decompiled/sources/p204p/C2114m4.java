package p204p;

import android.net.Uri;

/* JADX INFO: renamed from: p.m4 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2114m4 implements InterfaceC2243p4 {

    /* JADX INFO: renamed from: a */
    public final z0r f139782a;

    /* JADX INFO: renamed from: b */
    public final Uri f139783b;

    public C2114m4(Uri uri, z0r z0rVar) {
        this.f139782a = z0rVar;
        this.f139783b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2114m4)) {
            return false;
        }
        C2114m4 c2114m4 = (C2114m4) obj;
        return wj50.m88271j(this.f139782a, c2114m4.f139782a) && wj50.m88271j(this.f139783b, c2114m4.f139783b);
    }

    public final int hashCode() {
        int iHashCode = this.f139782a.hashCode() * 31;
        Uri uri = this.f139783b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
