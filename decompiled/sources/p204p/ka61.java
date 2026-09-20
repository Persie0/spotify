package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ka61 {

    /* JADX INFO: renamed from: a */
    public final fh0 f120809a;

    /* JADX INFO: renamed from: b */
    public final int f120810b;

    /* JADX INFO: renamed from: c */
    public final boolean f120811c;

    /* JADX INFO: renamed from: d */
    public final gb61 f120812d;

    public ka61(fh0 fh0Var, int i, boolean z, gb61 gb61Var) {
        this.f120809a = fh0Var;
        this.f120810b = i;
        this.f120811c = z;
        this.f120812d = gb61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka61)) {
            return false;
        }
        ka61 ka61Var = (ka61) obj;
        return wj50.m88271j(this.f120809a, ka61Var.f120809a) && this.f120810b == ka61Var.f120810b && this.f120811c == ka61Var.f120811c && wj50.m88271j(this.f120812d, ka61Var.f120812d);
    }

    public final int hashCode() {
        fh0 fh0Var = this.f120809a;
        int iM77245d = s571.m77245d(mt60.m62800g(this.f120810b, (fh0Var == null ? 0 : fh0Var.hashCode()) * 31, 31), 31, this.f120811c);
        gb61 gb61Var = this.f120812d;
        return iM77245d + (gb61Var != null ? gb61Var.hashCode() : 0);
    }
}
