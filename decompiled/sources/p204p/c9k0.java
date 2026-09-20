package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c9k0 extends e9k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f35579a;

    /* JADX INFO: renamed from: b */
    public final int f35580b;

    /* JADX INFO: renamed from: c */
    public final int f35581c;

    public c9k0(int i, int i2, boolean z) {
        this.f35579a = z;
        this.f35580b = i;
        this.f35581c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9k0)) {
            return false;
        }
        c9k0 c9k0Var = (c9k0) obj;
        return this.f35579a == c9k0Var.f35579a && this.f35580b == c9k0Var.f35580b && this.f35581c == c9k0Var.f35581c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35581c) + mt60.m62800g(this.f35580b, Boolean.hashCode(this.f35579a) * 31, 31);
    }
}
