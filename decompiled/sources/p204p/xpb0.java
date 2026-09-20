package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xpb0 implements ypb0 {

    /* JADX INFO: renamed from: a */
    public final int f264589a;

    /* JADX INFO: renamed from: b */
    public final int f264590b;

    public xpb0(int i, int i2) {
        this.f264589a = i;
        this.f264590b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpb0)) {
            return false;
        }
        xpb0 xpb0Var = (xpb0) obj;
        return this.f264589a == xpb0Var.f264589a && this.f264590b == xpb0Var.f264590b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f264590b) + (Integer.hashCode(this.f264589a) * 31);
    }
}
