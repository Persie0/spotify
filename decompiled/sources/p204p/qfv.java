package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qfv implements wfv {

    /* JADX INFO: renamed from: a */
    public final q290 f188303a;

    public qfv(q290 q290Var) {
        this.f188303a = q290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfv) && wj50.m88271j(this.f188303a, ((qfv) obj).f188303a);
    }

    public final int hashCode() {
        q290 q290Var = this.f188303a;
        if (q290Var == null) {
            return 0;
        }
        return q290Var.hashCode();
    }
}
