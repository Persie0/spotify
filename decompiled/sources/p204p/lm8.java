package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class lm8 {

    /* JADX INFO: renamed from: a */
    public final Uri f134809a;

    /* JADX INFO: renamed from: b */
    public final Uri f134810b;

    public lm8(Uri uri, Uri uri2) {
        this.f134809a = uri;
        this.f134810b = uri2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm8)) {
            return false;
        }
        lm8 lm8Var = (lm8) obj;
        return wj50.m88271j(this.f134809a, lm8Var.f134809a) && wj50.m88271j(this.f134810b, lm8Var.f134810b);
    }

    public final int hashCode() {
        Uri uri = this.f134809a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Uri uri2 = this.f134810b;
        return iHashCode + (uri2 != null ? uri2.hashCode() : 0);
    }
}
