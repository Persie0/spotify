package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yo20 implements zo20 {

    /* JADX INFO: renamed from: a */
    public final ip20 f274539a;

    /* JADX INFO: renamed from: b */
    public final a6z f274540b;

    public yo20(ip20 ip20Var, a6z a6zVar) {
        this.f274539a = ip20Var;
        this.f274540b = a6zVar;
    }

    @Override // p204p.zo20
    /* JADX INFO: renamed from: a */
    public final jp20 mo91521a() {
        return this.f274539a;
    }

    @Override // p204p.zo20
    /* JADX INFO: renamed from: b */
    public final a6z mo91522b() {
        return this.f274540b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo20)) {
            return false;
        }
        yo20 yo20Var = (yo20) obj;
        return wj50.m88271j(this.f274539a, yo20Var.f274539a) && wj50.m88271j(this.f274540b, yo20Var.f274540b);
    }

    public final int hashCode() {
        return this.f274540b.hashCode() + (this.f274539a.f104368a.hashCode() * 31);
    }
}
