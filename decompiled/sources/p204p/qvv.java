package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class qvv extends wvv {

    /* JADX INFO: renamed from: a */
    public final z0r f193104a;

    /* JADX INFO: renamed from: b */
    public final Uri f193105b;

    /* JADX INFO: renamed from: c */
    public final Uri f193106c;

    /* JADX INFO: renamed from: d */
    public final int f193107d;

    public qvv(z0r z0rVar, Uri uri, Uri uri2, int i) {
        this.f193104a = z0rVar;
        this.f193105b = uri;
        this.f193106c = uri2;
        this.f193107d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvv)) {
            return false;
        }
        qvv qvvVar = (qvv) obj;
        return wj50.m88271j(this.f193104a, qvvVar.f193104a) && wj50.m88271j(this.f193105b, qvvVar.f193105b) && wj50.m88271j(this.f193106c, qvvVar.f193106c) && this.f193107d == qvvVar.f193107d;
    }

    public final int hashCode() {
        int iHashCode = this.f193104a.hashCode() * 31;
        Uri uri = this.f193105b;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f193106c;
        return Integer.hashCode(this.f193107d) + ((iHashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31);
    }
}
