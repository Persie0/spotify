package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w601 {

    /* JADX INFO: renamed from: a */
    public final buh0 f248224a;

    /* JADX INFO: renamed from: b */
    public final pc5 f248225b;

    /* JADX INFO: renamed from: c */
    public final y6q0 f248226c;

    public w601(buh0 buh0Var, pc5 pc5Var, y6q0 y6q0Var) {
        this.f248224a = buh0Var;
        this.f248225b = pc5Var;
        this.f248226c = y6q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w601)) {
            return false;
        }
        w601 w601Var = (w601) obj;
        return wj50.m88271j(this.f248224a, w601Var.f248224a) && wj50.m88271j(this.f248225b, w601Var.f248225b) && wj50.m88271j(this.f248226c, w601Var.f248226c);
    }

    public final int hashCode() {
        return this.f248226c.hashCode() + ((this.f248225b.hashCode() + (this.f248224a.hashCode() * 31)) * 31);
    }
}
