package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final class vi41 implements xi41 {

    /* JADX INFO: renamed from: a */
    public final Uri f241615a;

    public vi41(Uri uri) {
        this.f241615a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vi41) && wj50.m88271j(this.f241615a, ((vi41) obj).f241615a);
    }

    public final int hashCode() {
        return this.f241615a.hashCode();
    }
}
