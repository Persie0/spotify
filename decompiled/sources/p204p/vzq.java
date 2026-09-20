package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vzq implements k0r {

    /* JADX INFO: renamed from: a */
    public final uzq f246526a;

    /* JADX INFO: renamed from: b */
    public final d850 f246527b;

    public vzq(uzq uzqVar, d850 d850Var) {
        this.f246526a = uzqVar;
        this.f246527b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzq)) {
            return false;
        }
        vzq vzqVar = (vzq) obj;
        return this.f246526a == vzqVar.f246526a && wj50.m88271j(this.f246527b, vzqVar.f246527b);
    }

    public final int hashCode() {
        int iHashCode = this.f246526a.hashCode() * 31;
        d850 d850Var = this.f246527b;
        return iHashCode + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
