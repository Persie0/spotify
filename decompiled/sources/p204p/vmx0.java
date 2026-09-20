package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vmx0 {

    /* JADX INFO: renamed from: a */
    public final boolean f242947a;

    /* JADX INFO: renamed from: b */
    public final int f242948b;

    /* JADX INFO: renamed from: c */
    public final int f242949c;

    public vmx0(int i, int i2, boolean z) {
        this.f242947a = z;
        this.f242948b = i;
        this.f242949c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmx0)) {
            return false;
        }
        vmx0 vmx0Var = (vmx0) obj;
        return this.f242947a == vmx0Var.f242947a && this.f242948b == vmx0Var.f242948b && this.f242949c == vmx0Var.f242949c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f242949c) + mt60.m62800g(this.f242948b, Boolean.hashCode(this.f242947a) * 31, 31);
    }
}
