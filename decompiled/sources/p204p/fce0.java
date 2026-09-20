package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fce0 {

    /* JADX INFO: renamed from: a */
    public final String f68104a;

    /* JADX INFO: renamed from: b */
    public final String f68105b;

    public fce0(String str, String str2) {
        this.f68104a = str;
        this.f68105b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fce0)) {
            return false;
        }
        fce0 fce0Var = (fce0) obj;
        return wj50.m88271j(this.f68104a, fce0Var.f68104a) && wj50.m88271j(this.f68105b, fce0Var.f68105b);
    }

    public final int hashCode() {
        return this.f68105b.hashCode() + (this.f68104a.hashCode() * 31);
    }
}
