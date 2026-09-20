package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fnr extends pnr {

    /* JADX INFO: renamed from: a */
    public final x811 f71351a;

    public fnr(x811 x811Var) {
        this.f71351a = x811Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fnr) && wj50.m88271j(this.f71351a, ((fnr) obj).f71351a);
    }

    public final int hashCode() {
        x811 x811Var = this.f71351a;
        if (x811Var == null) {
            return 0;
        }
        return x811Var.hashCode();
    }
}
