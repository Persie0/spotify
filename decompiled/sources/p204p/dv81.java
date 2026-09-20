package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dv81 {

    /* JADX INFO: renamed from: a */
    public final ew81 f53393a;

    /* JADX INFO: renamed from: b */
    public final yv81 f53394b;

    public dv81(ew81 ew81Var, yv81 yv81Var) {
        this.f53393a = ew81Var;
        this.f53394b = yv81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv81)) {
            return false;
        }
        dv81 dv81Var = (dv81) obj;
        return wj50.m88271j(this.f53393a, dv81Var.f53393a) && wj50.m88271j(this.f53394b, dv81Var.f53394b);
    }

    public final int hashCode() {
        return this.f53394b.hashCode() + (this.f53393a.hashCode() * 31);
    }
}
