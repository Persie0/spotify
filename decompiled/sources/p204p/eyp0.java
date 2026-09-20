package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eyp0 {

    /* JADX INFO: renamed from: a */
    public final String f64148a;

    /* JADX INFO: renamed from: b */
    public final nm20 f64149b;

    public eyp0(String str, nm20 nm20Var) {
        this.f64148a = str;
        this.f64149b = nm20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyp0)) {
            return false;
        }
        eyp0 eyp0Var = (eyp0) obj;
        return wj50.m88271j(this.f64148a, eyp0Var.f64148a) && wj50.m88271j(this.f64149b, eyp0Var.f64149b);
    }

    public final int hashCode() {
        return this.f64149b.hashCode() + (this.f64148a.hashCode() * 31);
    }
}
