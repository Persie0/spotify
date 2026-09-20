package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class yud1 implements fie0 {

    /* JADX INFO: renamed from: a */
    public final vb9 f276333a;

    /* JADX INFO: renamed from: b */
    public final int f276334b;

    public yud1(vb9 vb9Var, int i) {
        this.f276333a = vb9Var;
        this.f276334b = i;
    }

    @Override // p204p.fie0
    /* JADX INFO: renamed from: a */
    public final int mo41716a(c450 c450Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.f276334b;
        if (i < i2 - (i3 * 2)) {
            return n0e1.m63437n(this.f276333a.m85124a(i, i2), i3, (i2 - i3) - i);
        }
        return ms2.m62681f(1, 0.0f, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yud1)) {
            return false;
        }
        yud1 yud1Var = (yud1) obj;
        return this.f276333a.equals(yud1Var.f276333a) && this.f276334b == yud1Var.f276334b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f276334b) + (Float.hashCode(this.f276333a.f239440a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.f276333a);
        sb.append(", margin=");
        return edb.m38567p(sb, this.f276334b, ')');
    }
}
