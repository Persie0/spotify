package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i4s0 {

    /* JADX INFO: renamed from: d */
    public static final i4s0 f98581d = new i4s0(0.0f, n0e1.m63404L(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a */
    public final float f98582a;

    /* JADX INFO: renamed from: b */
    public final ete f98583b;

    /* JADX INFO: renamed from: c */
    public final int f98584c;

    public i4s0(float f, ete eteVar, int i) {
        this.f98582a = f;
        this.f98583b = eteVar;
        this.f98584c = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4s0)) {
            return false;
        }
        i4s0 i4s0Var = (i4s0) obj;
        return this.f98582a == i4s0Var.f98582a && wj50.m88271j(this.f98583b, i4s0Var.f98583b) && this.f98584c == i4s0Var.f98584c;
    }

    public final int hashCode() {
        return ((this.f98583b.hashCode() + (Float.hashCode(this.f98582a) * 31)) * 31) + this.f98584c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f98582a);
        sb.append(", range=");
        sb.append(this.f98583b);
        sb.append(", steps=");
        return edb.m38567p(sb, this.f98584c, ')');
    }
}
