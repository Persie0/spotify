package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class x2k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f257515a;

    /* JADX INFO: renamed from: b */
    public final boolean f257516b;

    public x2k0(boolean z, boolean z2) {
        this.f257515a = z;
        this.f257516b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2k0)) {
            return false;
        }
        x2k0 x2k0Var = (x2k0) obj;
        return this.f257515a == x2k0Var.f257515a && this.f257516b == x2k0Var.f257516b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257516b) + (Boolean.hashCode(this.f257515a) * 31);
    }
}
