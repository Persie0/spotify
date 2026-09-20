package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class mme0 extends ome0 {

    /* JADX INFO: renamed from: a */
    public final fsz0 f145129a;

    /* JADX INFO: renamed from: b */
    public final String f145130b;

    /* JADX INFO: renamed from: c */
    public final Bitmap f145131c;

    public mme0(fsz0 fsz0Var, String str, Bitmap bitmap) {
        this.f145129a = fsz0Var;
        this.f145130b = str;
        this.f145131c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mme0)) {
            return false;
        }
        mme0 mme0Var = (mme0) obj;
        return wj50.m88271j(this.f145129a, mme0Var.f145129a) && wj50.m88271j(this.f145130b, mme0Var.f145130b) && wj50.m88271j(this.f145131c, mme0Var.f145131c);
    }

    public final int hashCode() {
        return this.f145131c.hashCode() + s571.m77243b(this.f145129a.hashCode() * 31, 31, this.f145130b);
    }
}
