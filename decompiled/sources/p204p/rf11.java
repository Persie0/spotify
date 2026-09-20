package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rf11 implements jr01, n1c {

    /* JADX INFO: renamed from: a */
    public final Object f198484a;

    /* JADX INFO: renamed from: b */
    public final int f198485b;

    public rf11(Object obj, int i) {
        this.f198484a = obj;
        this.f198485b = i;
    }

    @Override // p204p.n1c
    /* JADX INFO: renamed from: a */
    public final int mo60617a() {
        return this.f198485b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf11)) {
            return false;
        }
        rf11 rf11Var = (rf11) obj;
        return wj50.m88271j(this.f198484a, rf11Var.f198484a) && this.f198485b == rf11Var.f198485b;
    }

    public final int hashCode() {
        Object obj = this.f198484a;
        return Integer.hashCode(this.f198485b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
