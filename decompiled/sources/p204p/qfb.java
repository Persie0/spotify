package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes9.dex */
public final class qfb {

    /* JADX INFO: renamed from: a */
    public final Rect f188161a;

    /* JADX INFO: renamed from: b */
    public final int f188162b;

    /* JADX INFO: renamed from: c */
    public final int f188163c;

    public qfb(int i, int i2, Rect rect) {
        this.f188161a = rect;
        this.f188162b = i;
        this.f188163c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfb)) {
            return false;
        }
        qfb qfbVar = (qfb) obj;
        return wj50.m88271j(this.f188161a, qfbVar.f188161a) && this.f188162b == qfbVar.f188162b && this.f188163c == qfbVar.f188163c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f188163c) + mt60.m62800g(this.f188162b, this.f188161a.hashCode() * 31, 31);
    }
}
