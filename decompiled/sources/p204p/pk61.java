package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pk61 {

    /* JADX INFO: renamed from: a */
    public final e8b f178402a;

    /* JADX INFO: renamed from: b */
    public final int f178403b;

    /* JADX INFO: renamed from: c */
    public final int f178404c;

    /* JADX INFO: renamed from: d */
    public final j1j0 f178405d;

    public pk61(e8b e8bVar, int i, int i2, j1j0 j1j0Var) {
        this.f178402a = e8bVar;
        this.f178403b = i;
        this.f178404c = i2;
        this.f178405d = j1j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk61)) {
            return false;
        }
        pk61 pk61Var = (pk61) obj;
        return this.f178402a.equals(pk61Var.f178402a) && this.f178403b == pk61Var.f178403b && this.f178404c == pk61Var.f178404c && this.f178405d.equals(pk61Var.f178405d);
    }

    public final int hashCode() {
        return this.f178405d.hashCode() + f710.m40938f(this.f178404c, mt60.m62800g(this.f178403b, this.f178402a.hashCode() * 31, 31), 31);
    }
}
