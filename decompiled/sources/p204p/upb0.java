package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class upb0 implements ypb0 {

    /* JADX INFO: renamed from: a */
    public final int f232621a;

    /* JADX INFO: renamed from: b */
    public final int f232622b;

    public upb0(int i, int i2) {
        this.f232621a = i;
        this.f232622b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upb0)) {
            return false;
        }
        upb0 upb0Var = (upb0) obj;
        return this.f232621a == upb0Var.f232621a && this.f232622b == upb0Var.f232622b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f232622b) + (Integer.hashCode(this.f232621a) * 31);
    }
}
