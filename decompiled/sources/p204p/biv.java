package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
public final class biv {

    /* JADX INFO: renamed from: a */
    public final Bitmap f27555a;

    /* JADX INFO: renamed from: b */
    public final ysm0 f27556b;

    public biv(Bitmap bitmap, ysm0 ysm0Var) {
        this.f27555a = bitmap;
        this.f27556b = ysm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof biv)) {
            return false;
        }
        biv bivVar = (biv) obj;
        return wj50.m88271j(this.f27555a, bivVar.f27555a) && wj50.m88271j(this.f27556b, bivVar.f27556b);
    }

    public final int hashCode() {
        return this.f27556b.hashCode() + (this.f27555a.hashCode() * 31);
    }
}
