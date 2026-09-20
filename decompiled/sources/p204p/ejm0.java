package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ejm0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f60249a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f60250b;

    public ejm0(String str, gkm0 gkm0Var) {
        this.f60249a = str;
        this.f60250b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejm0)) {
            return false;
        }
        ejm0 ejm0Var = (ejm0) obj;
        return wj50.m88271j(this.f60249a, ejm0Var.f60249a) && wj50.m88271j(this.f60250b, ejm0Var.f60250b);
    }

    public final int hashCode() {
        return this.f60250b.hashCode() + (this.f60249a.hashCode() * 31);
    }
}
