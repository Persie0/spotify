package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e8c1 extends i8c1 {

    /* JADX INFO: renamed from: a */
    public final int f57140a;

    /* JADX INFO: renamed from: b */
    public final boolean f57141b;

    public e8c1(int i, boolean z) {
        this.f57140a = i;
        this.f57141b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8c1)) {
            return false;
        }
        e8c1 e8c1Var = (e8c1) obj;
        return this.f57140a == e8c1Var.f57140a && this.f57141b == e8c1Var.f57141b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57141b) + (edb.m38547C(this.f57140a) * 31);
    }
}
