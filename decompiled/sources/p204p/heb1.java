package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class heb1 {

    /* JADX INFO: renamed from: a */
    public final xam f90402a;

    /* JADX INFO: renamed from: b */
    public final String f90403b;

    public heb1(xam xamVar, String str) {
        this.f90402a = xamVar;
        this.f90403b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heb1)) {
            return false;
        }
        heb1 heb1Var = (heb1) obj;
        return wj50.m88271j(this.f90402a, heb1Var.f90402a) && wj50.m88271j(this.f90403b, heb1Var.f90403b);
    }

    public final int hashCode() {
        return this.f90403b.hashCode() + (this.f90402a.hashCode() * 31);
    }
}
