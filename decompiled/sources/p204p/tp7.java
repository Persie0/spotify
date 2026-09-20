package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class tp7 {

    /* JADX INFO: renamed from: a */
    public final Uri f222449a;

    /* JADX INFO: renamed from: b */
    public final String f222450b;

    public tp7(Uri uri, String str) {
        this.f222449a = uri;
        this.f222450b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp7)) {
            return false;
        }
        tp7 tp7Var = (tp7) obj;
        return wj50.m88271j(this.f222449a, tp7Var.f222449a) && wj50.m88271j(this.f222450b, tp7Var.f222450b);
    }

    public final int hashCode() {
        return this.f222450b.hashCode() + (this.f222449a.hashCode() * 31);
    }
}
