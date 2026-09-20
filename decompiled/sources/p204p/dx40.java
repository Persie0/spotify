package p204p;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class dx40 {

    /* JADX INFO: renamed from: e */
    public static final dx40 f53847e = new dx40(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f53848a;

    /* JADX INFO: renamed from: b */
    public final int f53849b;

    /* JADX INFO: renamed from: c */
    public final int f53850c;

    /* JADX INFO: renamed from: d */
    public final int f53851d;

    public dx40(int i, int i2, int i3, int i4) {
        this.f53848a = i;
        this.f53849b = i2;
        this.f53850c = i3;
        this.f53851d = i4;
    }

    /* JADX INFO: renamed from: a */
    public static dx40 m37188a(dx40 dx40Var, dx40 dx40Var2) {
        return m37189b(Math.max(dx40Var.f53848a, dx40Var2.f53848a), Math.max(dx40Var.f53849b, dx40Var2.f53849b), Math.max(dx40Var.f53850c, dx40Var2.f53850c), Math.max(dx40Var.f53851d, dx40Var2.f53851d));
    }

    /* JADX INFO: renamed from: b */
    public static dx40 m37189b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f53847e : new dx40(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: c */
    public static dx40 m37190c(Rect rect) {
        return m37189b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: d */
    public static dx40 m37191d(Insets insets) {
        return m37189b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: e */
    public final Insets m37192e() {
        return ds4.m36748c(this.f53848a, this.f53849b, this.f53850c, this.f53851d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dx40.class != obj.getClass()) {
            return false;
        }
        dx40 dx40Var = (dx40) obj;
        return this.f53851d == dx40Var.f53851d && this.f53848a == dx40Var.f53848a && this.f53850c == dx40Var.f53850c && this.f53849b == dx40Var.f53849b;
    }

    public final int hashCode() {
        return (((((this.f53848a * 31) + this.f53849b) * 31) + this.f53850c) * 31) + this.f53851d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f53848a);
        sb.append(", top=");
        sb.append(this.f53849b);
        sb.append(", right=");
        sb.append(this.f53850c);
        sb.append(", bottom=");
        return edb.m38567p(sb, this.f53851d, '}');
    }
}
