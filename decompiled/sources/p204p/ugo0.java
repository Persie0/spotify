package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes5.dex */
public final class ugo0 extends zgo0 {

    /* JADX INFO: renamed from: a */
    public final Uri f230219a;

    /* JADX INFO: renamed from: b */
    public final boolean f230220b;

    public ugo0(Uri uri, boolean z) {
        this.f230219a = uri;
        this.f230220b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugo0)) {
            return false;
        }
        ugo0 ugo0Var = (ugo0) obj;
        return wj50.m88271j(this.f230219a, ugo0Var.f230219a) && this.f230220b == ugo0Var.f230220b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f230220b) + (this.f230219a.hashCode() * 31);
    }
}
