package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gi61 {

    /* JADX INFO: renamed from: a */
    public final int f80080a;

    /* JADX INFO: renamed from: b */
    public final int f80081b;

    /* JADX INFO: renamed from: c */
    public final int f80082c;

    /* JADX INFO: renamed from: d */
    public final int f80083d;

    public gi61(int i, int i2, int i3, int i4) {
        this.f80080a = i;
        this.f80081b = i2;
        this.f80082c = i3;
        this.f80083d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi61)) {
            return false;
        }
        gi61 gi61Var = (gi61) obj;
        return this.f80080a == gi61Var.f80080a && this.f80081b == gi61Var.f80081b && this.f80082c == gi61Var.f80082c && this.f80083d == gi61Var.f80083d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f80083d) + mt60.m62800g(this.f80082c, mt60.m62800g(this.f80081b, Integer.hashCode(this.f80080a) * 31, 31), 31);
    }
}
