package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public final class v250 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f236550a;

    /* JADX INFO: renamed from: b */
    public final fsk f236551b;

    /* JADX INFO: renamed from: c */
    public final Float f236552c;

    public v250(Bitmap bitmap, fsk fskVar, Float f) {
        this.f236550a = bitmap;
        this.f236551b = fskVar;
        this.f236552c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v250)) {
            return false;
        }
        v250 v250Var = (v250) obj;
        return wj50.m88271j(this.f236550a, v250Var.f236550a) && this.f236551b == v250Var.f236551b && wj50.m88271j(this.f236552c, v250Var.f236552c);
    }

    public final int hashCode() {
        int iHashCode = (this.f236551b.hashCode() + (this.f236550a.hashCode() * 31)) * 31;
        Float f = this.f236552c;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}
