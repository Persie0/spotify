package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rs20 implements ts20 {

    /* JADX INFO: renamed from: a */
    public final c96 f202165a;

    /* JADX INFO: renamed from: b */
    public final c96 f202166b;

    public rs20(c96 c96Var, c96 c96Var2) {
        this.f202165a = c96Var;
        this.f202166b = c96Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs20)) {
            return false;
        }
        rs20 rs20Var = (rs20) obj;
        return wj50.m88271j(this.f202165a, rs20Var.f202165a) && wj50.m88271j(this.f202166b, rs20Var.f202166b);
    }

    public final int hashCode() {
        return this.f202166b.hashCode() + (this.f202165a.hashCode() * 31);
    }
}
