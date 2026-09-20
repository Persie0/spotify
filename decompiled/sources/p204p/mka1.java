package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes8.dex */
public final class mka1 {

    /* JADX INFO: renamed from: a */
    public final boolean f144542a;

    /* JADX INFO: renamed from: b */
    public final Uri f144543b;

    public mka1(Uri uri, boolean z) {
        this.f144542a = z;
        this.f144543b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mka1)) {
            return false;
        }
        mka1 mka1Var = (mka1) obj;
        return this.f144542a == mka1Var.f144542a && wj50.m88271j(this.f144543b, mka1Var.f144543b);
    }

    public final int hashCode() {
        return this.f144543b.hashCode() + (Boolean.hashCode(this.f144542a) * 31);
    }
}
