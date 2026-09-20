package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l100 {

    /* JADX INFO: renamed from: a */
    public final fa01 f128558a;

    /* JADX INFO: renamed from: b */
    public final String f128559b;

    public l100(fa01 fa01Var, String str) {
        this.f128558a = fa01Var;
        this.f128559b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l100)) {
            return false;
        }
        l100 l100Var = (l100) obj;
        return wj50.m88271j(this.f128558a, l100Var.f128558a) && wj50.m88271j(this.f128559b, l100Var.f128559b);
    }

    public final int hashCode() {
        return this.f128559b.hashCode() + (this.f128558a.hashCode() * 31);
    }
}
