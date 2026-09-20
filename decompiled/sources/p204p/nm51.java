package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nm51 implements om51 {

    /* JADX INFO: renamed from: a */
    public final up60 f155303a;

    /* JADX INFO: renamed from: b */
    public final qe70 f155304b;

    /* JADX WARN: Multi-variable type inference failed */
    public nm51(up60 up60Var, gh00 gh00Var) {
        this.f155303a = up60Var;
        this.f155304b = (qe70) gh00Var;
    }

    @Override // p204p.om51
    /* JADX INFO: renamed from: a */
    public final up60 mo62265a() {
        return this.f155303a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm51)) {
            return false;
        }
        nm51 nm51Var = (nm51) obj;
        return wj50.m88271j(this.f155303a, nm51Var.f155303a) && this.f155304b.equals(nm51Var.f155304b);
    }

    public final int hashCode() {
        return this.f155304b.hashCode() + (this.f155303a.hashCode() * 31);
    }
}
