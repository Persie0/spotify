package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kn0 implements mn0 {

    /* JADX INFO: renamed from: a */
    public final int f124248a;

    /* JADX INFO: renamed from: b */
    public final d9g0 f124249b;

    public kn0(int i, d9g0 d9g0Var) {
        this.f124248a = i;
        this.f124249b = d9g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0)) {
            return false;
        }
        kn0 kn0Var = (kn0) obj;
        return this.f124248a == kn0Var.f124248a && this.f124249b == kn0Var.f124249b;
    }

    public final int hashCode() {
        return this.f124249b.hashCode() + (Integer.hashCode(this.f124248a) * 31);
    }
}
