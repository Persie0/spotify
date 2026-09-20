package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ccx extends gcx {

    /* JADX INFO: renamed from: a */
    public final boolean f36655a;

    /* JADX INFO: renamed from: b */
    public final d850 f36656b;

    public ccx(d850 d850Var, boolean z) {
        this.f36655a = z;
        this.f36656b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccx)) {
            return false;
        }
        ccx ccxVar = (ccx) obj;
        return this.f36655a == ccxVar.f36655a && wj50.m88271j(this.f36656b, ccxVar.f36656b);
    }

    public final int hashCode() {
        return this.f36656b.hashCode() + (Boolean.hashCode(this.f36655a) * 31);
    }
}
