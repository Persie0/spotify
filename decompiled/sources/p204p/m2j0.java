package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m2j0 extends b3j0 {

    /* JADX INFO: renamed from: a */
    public final z650 f139367a;

    public m2j0(z650 z650Var) {
        this.f139367a = z650Var;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: a */
    public final boolean mo28034a() {
        return true;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: b */
    public final String mo28035b() {
        z650 z650Var = this.f139367a;
        return z650Var == null ? "back" : s571.m77251j("back(", z650Var.f279709a, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2j0) && wj50.m88271j(this.f139367a, ((m2j0) obj).f139367a);
    }

    public final int hashCode() {
        z650 z650Var = this.f139367a;
        if (z650Var == null) {
            return 0;
        }
        return z650Var.f279709a.hashCode();
    }
}
