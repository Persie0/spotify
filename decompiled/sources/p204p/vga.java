package p204p;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class vga {

    /* JADX INFO: renamed from: a */
    public final int f241184a;

    /* JADX INFO: renamed from: b */
    public final int f241185b;

    /* JADX INFO: renamed from: c */
    public final int f241186c;

    /* JADX INFO: renamed from: d */
    public final int f241187d;

    public vga(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f241184a = i;
        this.f241185b = i2;
        this.f241186c = i3;
        this.f241187d = i4;
        if (i > i3) {
            throw new IllegalArgumentException(s571.m77247f(i, "Left must be less than or equal to right, left: ", i3, ", right: ").toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(s571.m77247f(i2, "top must be less than or equal to bottom, top: ", i4, ", bottom: ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vga.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        vga vgaVar = (vga) obj;
        return this.f241184a == vgaVar.f241184a && this.f241185b == vgaVar.f241185b && this.f241186c == vgaVar.f241186c && this.f241187d == vgaVar.f241187d;
    }

    public final int hashCode() {
        return (((((this.f241184a * 31) + this.f241185b) * 31) + this.f241186c) * 31) + this.f241187d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vga.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f241184a);
        sb.append(',');
        sb.append(this.f241185b);
        sb.append(',');
        sb.append(this.f241186c);
        sb.append(',');
        return klh.m56832d(this.f241187d, "] }", sb);
    }
}
