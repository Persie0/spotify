package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yht extends i2h1 {

    /* JADX INFO: renamed from: b */
    public final d850 f272971b;

    public yht(d850 d850Var) {
        this.f272971b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yht) && wj50.m88271j(this.f272971b, ((yht) obj).f272971b);
    }

    public final int hashCode() {
        d850 d850Var = this.f272971b;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
