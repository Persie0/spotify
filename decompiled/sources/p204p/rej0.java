package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rej0 extends vej0 {

    /* JADX INFO: renamed from: a */
    public final i350 f198374a;

    /* JADX INFO: renamed from: b */
    public final d350 f198375b;

    public rej0(i350 i350Var, d350 d350Var) {
        this.f198374a = i350Var;
        this.f198375b = d350Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rej0)) {
            return false;
        }
        rej0 rej0Var = (rej0) obj;
        return wj50.m88271j(this.f198374a, rej0Var.f198374a) && wj50.m88271j(this.f198375b, rej0Var.f198375b);
    }

    public final int hashCode() {
        return this.f198375b.hashCode() + (this.f198374a.hashCode() * 31);
    }
}
