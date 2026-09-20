package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class qxd1 {

    /* JADX INFO: renamed from: a */
    public final vga f193631a;

    /* JADX INFO: renamed from: b */
    public final swd1 f193632b;

    public qxd1(vga vgaVar, swd1 swd1Var) {
        this.f193631a = vgaVar;
        this.f193632b = swd1Var;
    }

    /* JADX INFO: renamed from: a */
    public final Rect m74115a() {
        vga vgaVar = this.f193631a;
        vgaVar.getClass();
        return new Rect(vgaVar.f241184a, vgaVar.f241185b, vgaVar.f241186c, vgaVar.f241187d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!qxd1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        qxd1 qxd1Var = (qxd1) obj;
        return wj50.m88271j(this.f193631a, qxd1Var.f193631a) && wj50.m88271j(this.f193632b, qxd1Var.f193632b);
    }

    public final int hashCode() {
        return this.f193632b.hashCode() + (this.f193631a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f193631a + ", windowInsetsCompat=" + this.f193632b + ')';
    }

    public qxd1(Rect rect, swd1 swd1Var) {
        this(new vga(rect), swd1Var);
    }
}
