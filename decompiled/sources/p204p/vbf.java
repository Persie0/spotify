package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vbf implements zbf {

    /* JADX INFO: renamed from: a */
    public final d850 f239493a;

    public vbf(d850 d850Var) {
        this.f239493a = d850Var;
    }

    @Override // p204p.zbf
    /* JADX INFO: renamed from: b */
    public final d850 mo77730b() {
        return this.f239493a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vbf) && wj50.m88271j(this.f239493a, ((vbf) obj).f239493a);
    }

    public final int hashCode() {
        return this.f239493a.hashCode();
    }
}
