package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pp00 implements tp00 {

    /* JADX INFO: renamed from: a */
    public final long f179841a;

    /* JADX INFO: renamed from: b */
    public final d850 f179842b;

    public pp00(long j, d850 d850Var) {
        this.f179841a = j;
        this.f179842b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp00)) {
            return false;
        }
        pp00 pp00Var = (pp00) obj;
        return this.f179841a == pp00Var.f179841a && wj50.m88271j(this.f179842b, pp00Var.f179842b);
    }

    public final int hashCode() {
        return this.f179842b.hashCode() + (Long.hashCode(this.f179841a) * 31);
    }
}
