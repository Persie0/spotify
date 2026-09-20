package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class f15 {

    /* JADX INFO: renamed from: a */
    public final Object f64787a;

    /* JADX INFO: renamed from: b */
    public final int f64788b;

    /* JADX INFO: renamed from: c */
    public int f64789c;

    /* JADX INFO: renamed from: d */
    public final String f64790d;

    public f15(int i, int i2, Object obj, String str) {
        this.f64787a = obj;
        this.f64788b = i;
        this.f64789c = i2;
        this.f64790d = str;
    }

    /* JADX INFO: renamed from: a */
    public final i15 m40521a(int i) {
        int i2 = this.f64789c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            nt40.m65599c("Item.end should be set first");
        }
        return new i15(this.f64788b, i, this.f64787a, this.f64790d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f15)) {
            return false;
        }
        f15 f15Var = (f15) obj;
        return wj50.m88271j(this.f64787a, f15Var.f64787a) && this.f64788b == f15Var.f64788b && this.f64789c == f15Var.f64789c && wj50.m88271j(this.f64790d, f15Var.f64790d);
    }

    public final int hashCode() {
        Object obj = this.f64787a;
        return this.f64790d.hashCode() + mt60.m62800g(this.f64789c, mt60.m62800g(this.f64788b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f64787a);
        sb.append(", start=");
        sb.append(this.f64788b);
        sb.append(", end=");
        sb.append(this.f64789c);
        sb.append(", tag=");
        return dq60.m36617q(sb, this.f64790d, ')');
    }

    public /* synthetic */ f15(int i, int i2, int i3, Object obj, String str) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, obj, (i3 & 8) != 0 ? "" : str);
    }
}
