package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ij31 {

    /* JADX INFO: renamed from: a */
    public final boolean f102681a;

    /* JADX INFO: renamed from: b */
    public final boolean f102682b;

    /* JADX INFO: renamed from: c */
    public final boolean f102683c;

    /* JADX INFO: renamed from: d */
    public final ha60 f102684d;

    public ij31(boolean z, boolean z2, boolean z3, ha60 ha60Var) {
        this.f102681a = z;
        this.f102682b = z2;
        this.f102683c = z3;
        this.f102684d = ha60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij31)) {
            return false;
        }
        ij31 ij31Var = (ij31) obj;
        return this.f102681a == ij31Var.f102681a && this.f102682b == ij31Var.f102682b && this.f102683c == ij31Var.f102683c && this.f102684d == ij31Var.f102684d;
    }

    public final int hashCode() {
        return this.f102684d.hashCode() + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f102681a) * 31, 31, this.f102682b), 31, this.f102683c);
    }
}
