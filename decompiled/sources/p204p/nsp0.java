package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nsp0 {

    /* JADX INFO: renamed from: a */
    public final msp0 f157863a;

    /* JADX INFO: renamed from: b */
    public final boolean f157864b;

    /* JADX INFO: renamed from: c */
    public final gh00 f157865c;

    public nsp0(msp0 msp0Var, boolean z, gh00 gh00Var) {
        this.f157863a = msp0Var;
        this.f157864b = z;
        this.f157865c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsp0)) {
            return false;
        }
        nsp0 nsp0Var = (nsp0) obj;
        return wj50.m88271j(this.f157863a, nsp0Var.f157863a) && this.f157864b == nsp0Var.f157864b && wj50.m88271j(this.f157865c, nsp0Var.f157865c);
    }

    public final int hashCode() {
        return this.f157865c.hashCode() + s571.m77245d(this.f157863a.hashCode() * 31, 31, this.f157864b);
    }
}
