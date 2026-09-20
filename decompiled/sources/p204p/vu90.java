package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vu90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f244898a;

    /* JADX INFO: renamed from: b */
    public final d850 f244899b;

    public vu90(String str, d850 d850Var) {
        this.f244898a = str;
        this.f244899b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu90)) {
            return false;
        }
        vu90 vu90Var = (vu90) obj;
        return wj50.m88271j(this.f244898a, vu90Var.f244898a) && wj50.m88271j(this.f244899b, vu90Var.f244899b);
    }

    public final int hashCode() {
        int iHashCode = this.f244898a.hashCode() * 31;
        d850 d850Var = this.f244899b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
