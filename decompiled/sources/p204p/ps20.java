package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ps20 implements ts20 {

    /* JADX INFO: renamed from: a */
    public final c96 f180717a;

    /* JADX INFO: renamed from: b */
    public final c96 f180718b;

    public ps20(c96 c96Var, c96 c96Var2) {
        this.f180717a = c96Var;
        this.f180718b = c96Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps20)) {
            return false;
        }
        ps20 ps20Var = (ps20) obj;
        return wj50.m88271j(this.f180717a, ps20Var.f180717a) && wj50.m88271j(this.f180718b, ps20Var.f180718b);
    }

    public final int hashCode() {
        return this.f180718b.hashCode() + (this.f180717a.hashCode() * 31);
    }
}
