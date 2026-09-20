package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class izw extends u2x {

    /* JADX INFO: renamed from: a */
    public final z0r f107297a;

    /* JADX INFO: renamed from: b */
    public final Uri f107298b;

    public izw(Uri uri, z0r z0rVar) {
        this.f107297a = z0rVar;
        this.f107298b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izw)) {
            return false;
        }
        izw izwVar = (izw) obj;
        return wj50.m88271j(this.f107297a, izwVar.f107297a) && wj50.m88271j(this.f107298b, izwVar.f107298b);
    }

    public final int hashCode() {
        int iHashCode = this.f107297a.hashCode() * 31;
        Uri uri = this.f107298b;
        return iHashCode + (uri == null ? 0 : uri.hashCode());
    }
}
