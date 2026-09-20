package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class bxc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final Uri f31822a;

    public bxc0(Uri uri) {
        this.f31822a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxc0) && wj50.m88271j(this.f31822a, ((bxc0) obj).f31822a);
    }

    public final int hashCode() {
        return this.f31822a.hashCode();
    }
}
