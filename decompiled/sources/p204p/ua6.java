package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class ua6 {

    /* JADX INFO: renamed from: a */
    public final ovy f228388a;

    /* JADX INFO: renamed from: b */
    public final Uri f228389b;

    public ua6(ovy ovyVar, Uri uri) {
        this.f228388a = ovyVar;
        this.f228389b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua6)) {
            return false;
        }
        ua6 ua6Var = (ua6) obj;
        return wj50.m88271j(this.f228388a, ua6Var.f228388a) && wj50.m88271j(this.f228389b, ua6Var.f228389b);
    }

    public final int hashCode() {
        return this.f228389b.hashCode() + (this.f228388a.hashCode() * 31);
    }
}
