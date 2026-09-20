package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bxo0 {

    /* JADX INFO: renamed from: a */
    public final boolean f31932a;

    /* JADX INFO: renamed from: b */
    public final boolean f31933b;

    /* JADX INFO: renamed from: c */
    public final boolean f31934c;

    /* JADX INFO: renamed from: d */
    public final boolean f31935d;

    public bxo0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31932a = z;
        this.f31933b = z2;
        this.f31934c = z3;
        this.f31935d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxo0)) {
            return false;
        }
        bxo0 bxo0Var = (bxo0) obj;
        return this.f31932a == bxo0Var.f31932a && this.f31933b == bxo0Var.f31933b && this.f31934c == bxo0Var.f31934c && this.f31935d == bxo0Var.f31935d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31935d) + s571.m77245d(s571.m77245d(Boolean.hashCode(this.f31932a) * 31, 31, this.f31933b), 31, this.f31934c);
    }
}
