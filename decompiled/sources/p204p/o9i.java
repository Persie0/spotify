package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o9i extends nai {

    /* JADX INFO: renamed from: a */
    public final tth f163042a;

    /* JADX INFO: renamed from: b */
    public final d850 f163043b;

    public o9i(tth tthVar, d850 d850Var) {
        this.f163042a = tthVar;
        this.f163043b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9i)) {
            return false;
        }
        o9i o9iVar = (o9i) obj;
        return wj50.m88271j(this.f163042a, o9iVar.f163042a) && wj50.m88271j(this.f163043b, o9iVar.f163043b);
    }

    public final int hashCode() {
        return this.f163043b.hashCode() + (this.f163042a.hashCode() * 31);
    }
}
