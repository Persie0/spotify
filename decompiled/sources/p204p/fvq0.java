package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f73841a;

    /* JADX INFO: renamed from: b */
    public final boolean f73842b;

    /* JADX INFO: renamed from: c */
    public final d850 f73843c;

    public fvq0(String str, d850 d850Var, boolean z) {
        this.f73841a = str;
        this.f73842b = z;
        this.f73843c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvq0)) {
            return false;
        }
        fvq0 fvq0Var = (fvq0) obj;
        return wj50.m88271j(this.f73841a, fvq0Var.f73841a) && this.f73842b == fvq0Var.f73842b && wj50.m88271j(this.f73843c, fvq0Var.f73843c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f73841a.hashCode() * 31, 31, this.f73842b);
        d850 d850Var = this.f73843c;
        return iM77245d + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
