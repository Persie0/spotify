package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ym0 {

    /* JADX INFO: renamed from: a */
    public final lo0 f274127a;

    /* JADX INFO: renamed from: b */
    public final vh00 f274128b;

    public ym0(lo0 lo0Var, vh00 vh00Var) {
        this.f274127a = lo0Var;
        this.f274128b = vh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym0)) {
            return false;
        }
        ym0 ym0Var = (ym0) obj;
        return wj50.m88271j(this.f274127a, ym0Var.f274127a) && wj50.m88271j(this.f274128b, ym0Var.f274128b);
    }

    public final int hashCode() {
        return this.f274128b.hashCode() + (this.f274127a.hashCode() * 31);
    }
}
