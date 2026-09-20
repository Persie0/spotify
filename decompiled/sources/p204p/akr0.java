package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class akr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f16628a;

    /* JADX INFO: renamed from: b */
    public final boolean f16629b;

    /* JADX INFO: renamed from: c */
    public final boolean f16630c;

    public akr0(boolean z, boolean z2, boolean z3) {
        this.f16628a = z;
        this.f16629b = z2;
        this.f16630c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akr0)) {
            return false;
        }
        akr0 akr0Var = (akr0) obj;
        return this.f16628a == akr0Var.f16628a && this.f16629b == akr0Var.f16629b && this.f16630c == akr0Var.f16630c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16630c) + s571.m77245d(Boolean.hashCode(this.f16628a) * 31, 31, this.f16629b);
    }
}
