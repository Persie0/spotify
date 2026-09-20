package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes9.dex */
public final class a601 implements d601 {

    /* JADX INFO: renamed from: a */
    public final Uri f12660a;

    public a601(Uri uri) {
        this.f12660a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a601) && wj50.m88271j(this.f12660a, ((a601) obj).f12660a);
    }

    public final int hashCode() {
        return this.f12660a.hashCode();
    }
}
