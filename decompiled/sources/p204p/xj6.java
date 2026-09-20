package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xj6 implements dk6 {

    /* JADX INFO: renamed from: a */
    public final z650 f262052a;

    /* JADX INFO: renamed from: b */
    public final ii6 f262053b;

    public xj6(z650 z650Var, ii6 ii6Var) {
        this.f262052a = z650Var;
        this.f262053b = ii6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj6)) {
            return false;
        }
        xj6 xj6Var = (xj6) obj;
        return wj50.m88271j(this.f262052a, xj6Var.f262052a) && wj50.m88271j(this.f262053b, xj6Var.f262053b);
    }

    public final int hashCode() {
        return this.f262053b.hashCode() + (this.f262052a.f279709a.hashCode() * 31);
    }
}
