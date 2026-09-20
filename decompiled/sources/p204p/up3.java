package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes6.dex */
public final class up3 {

    /* JADX INFO: renamed from: a */
    public final boolean f232564a;

    /* JADX INFO: renamed from: b */
    public final Rect f232565b;

    /* JADX INFO: renamed from: c */
    public final int f232566c;

    public up3(boolean z, int i, Rect rect) {
        this.f232564a = z;
        this.f232565b = rect;
        this.f232566c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up3)) {
            return false;
        }
        up3 up3Var = (up3) obj;
        return this.f232564a == up3Var.f232564a && wj50.m88271j(this.f232565b, up3Var.f232565b) && this.f232566c == up3Var.f232566c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f232564a) * 31;
        Rect rect = this.f232565b;
        return Integer.hashCode(this.f232566c) + ((iHashCode + (rect == null ? 0 : rect.hashCode())) * 31);
    }
}
