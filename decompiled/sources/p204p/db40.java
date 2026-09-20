package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class db40 implements eb40 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f47194a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f47195b;

    public db40(Bitmap bitmap, Bitmap bitmap2) {
        this.f47194a = bitmap;
        this.f47195b = bitmap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db40)) {
            return false;
        }
        db40 db40Var = (db40) obj;
        return wj50.m88271j(this.f47194a, db40Var.f47194a) && wj50.m88271j(this.f47195b, db40Var.f47195b);
    }

    public final int hashCode() {
        return this.f47195b.hashCode() + (this.f47194a.hashCode() * 31);
    }
}
