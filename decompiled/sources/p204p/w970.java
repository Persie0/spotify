package p204p;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class w970 {
    public static final v970 Companion = new v970();

    /* JADX INFO: renamed from: a */
    public final long f249103a;

    /* JADX INFO: renamed from: b */
    public final int f249104b;

    /* JADX INFO: renamed from: c */
    public final int f249105c;

    public /* synthetic */ w970(long j, int i, int i2, int i3) {
        if (7 != (i & 7)) {
            edo.m38617p(i, 7, u970.f228086a.getDescriptor());
            throw null;
        }
        this.f249103a = j;
        this.f249104b = i2;
        this.f249105c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w970)) {
            return false;
        }
        w970 w970Var = (w970) obj;
        return this.f249103a == w970Var.f249103a && this.f249104b == w970Var.f249104b && this.f249105c == w970Var.f249105c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f249105c) + mt60.m62800g(this.f249104b, Long.hashCode(this.f249103a) * 31, 31);
    }
}
