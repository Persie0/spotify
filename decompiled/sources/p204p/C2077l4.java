package p204p;

import android.net.Uri;

/* JADX INFO: renamed from: p.l4 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2077l4 {

    /* JADX INFO: renamed from: a */
    public final String f129463a;

    /* JADX INFO: renamed from: b */
    public final z0r f129464b;

    /* JADX INFO: renamed from: c */
    public final Uri f129465c;

    public C2077l4(Uri uri, String str, z0r z0rVar) {
        this.f129463a = str;
        this.f129464b = z0rVar;
        this.f129465c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2077l4)) {
            return false;
        }
        C2077l4 c2077l4 = (C2077l4) obj;
        return wj50.m88271j(this.f129463a, c2077l4.f129463a) && wj50.m88271j(this.f129464b, c2077l4.f129464b) && wj50.m88271j(this.f129465c, c2077l4.f129465c);
    }

    public final int hashCode() {
        int iHashCode = (this.f129464b.hashCode() + (this.f129463a.hashCode() * 31)) * 31;
        Uri uri = this.f129465c;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
