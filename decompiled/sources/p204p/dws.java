package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dws implements jws {

    /* JADX INFO: renamed from: a */
    public final aox0 f53738a;

    /* JADX INFO: renamed from: b */
    public final aox0 f53739b;

    /* JADX INFO: renamed from: c */
    public final d850 f53740c;

    public dws(aox0 aox0Var, aox0 aox0Var2, d850 d850Var) {
        this.f53738a = aox0Var;
        this.f53739b = aox0Var2;
        this.f53740c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dws)) {
            return false;
        }
        dws dwsVar = (dws) obj;
        return wj50.m88271j(this.f53738a, dwsVar.f53738a) && wj50.m88271j(this.f53739b, dwsVar.f53739b) && wj50.m88271j(this.f53740c, dwsVar.f53740c);
    }

    public final int hashCode() {
        return this.f53740c.hashCode() + ((this.f53739b.hashCode() + (this.f53738a.hashCode() * 31)) * 31);
    }
}
