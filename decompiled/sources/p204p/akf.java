package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class akf implements lkf {

    /* JADX INFO: renamed from: a */
    public final String f16524a;

    /* JADX INFO: renamed from: b */
    public final d850 f16525b;

    public akf(String str, d850 d850Var) {
        this.f16524a = str;
        this.f16525b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akf)) {
            return false;
        }
        akf akfVar = (akf) obj;
        return wj50.m88271j(this.f16524a, akfVar.f16524a) && wj50.m88271j(this.f16525b, akfVar.f16525b);
    }

    public final int hashCode() {
        int iHashCode = this.f16524a.hashCode() * 31;
        d850 d850Var = this.f16525b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
