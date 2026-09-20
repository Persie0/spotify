package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lya extends vya {

    /* JADX INFO: renamed from: a */
    public final rza f138010a;

    /* JADX INFO: renamed from: b */
    public final v3h1 f138011b;

    public lya(rza rzaVar, v3h1 v3h1Var) {
        this.f138010a = rzaVar;
        this.f138011b = v3h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lya)) {
            return false;
        }
        lya lyaVar = (lya) obj;
        return wj50.m88271j(this.f138010a, lyaVar.f138010a) && wj50.m88271j(this.f138011b, lyaVar.f138011b);
    }

    public final int hashCode() {
        return this.f138011b.hashCode() + (this.f138010a.hashCode() * 31);
    }
}
