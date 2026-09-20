package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xr80 implements ds80 {

    /* JADX INFO: renamed from: a */
    public final bs80 f265289a;

    /* JADX INFO: renamed from: b */
    public final sp80 f265290b;

    public xr80(bs80 bs80Var, sp80 sp80Var) {
        this.f265289a = bs80Var;
        this.f265290b = sp80Var;
    }

    @Override // p204p.ds80
    /* JADX INFO: renamed from: a */
    public final bs80 mo33758a() {
        return this.f265289a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr80)) {
            return false;
        }
        xr80 xr80Var = (xr80) obj;
        return wj50.m88271j(this.f265289a, xr80Var.f265289a) && wj50.m88271j(this.f265290b, xr80Var.f265290b);
    }

    public final int hashCode() {
        return this.f265290b.hashCode() + (this.f265289a.hashCode() * 31);
    }
}
