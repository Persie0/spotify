package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class fsz0 {

    /* JADX INFO: renamed from: a */
    public final String f73077a;

    /* JADX INFO: renamed from: b */
    public final String f73078b;

    /* JADX INFO: renamed from: c */
    public final Bitmap f73079c;

    public fsz0(String str, String str2, Bitmap bitmap) {
        this.f73077a = str;
        this.f73078b = str2;
        this.f73079c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsz0)) {
            return false;
        }
        fsz0 fsz0Var = (fsz0) obj;
        return wj50.m88271j(this.f73077a, fsz0Var.f73077a) && wj50.m88271j(this.f73078b, fsz0Var.f73078b) && wj50.m88271j(this.f73079c, fsz0Var.f73079c);
    }

    public final int hashCode() {
        return this.f73079c.hashCode() + s571.m77243b(this.f73077a.hashCode() * 31, 31, this.f73078b);
    }
}
