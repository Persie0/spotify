package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lmr0 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f135008a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f135009b;

    /* JADX INFO: renamed from: c */
    public final o4x f135010c;

    /* JADX INFO: renamed from: d */
    public final mmr0 f135011d;

    public lmr0(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar, mmr0 mmr0Var) {
        this.f135008a = otd0Var;
        this.f135009b = ibp0Var;
        this.f135010c = o4xVar;
        this.f135011d = mmr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final o4x m59460a() {
        return this.f135010c;
    }

    /* JADX INFO: renamed from: b */
    public final otd0 m59461b() {
        return this.f135008a;
    }

    /* JADX INFO: renamed from: c */
    public final ibp0 m59462c() {
        return this.f135009b;
    }

    /* JADX INFO: renamed from: d */
    public final mmr0 m59463d() {
        return this.f135011d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmr0)) {
            return false;
        }
        lmr0 lmr0Var = (lmr0) obj;
        return wj50.m88271j(this.f135008a, lmr0Var.f135008a) && wj50.m88271j(this.f135009b, lmr0Var.f135009b) && wj50.m88271j(this.f135010c, lmr0Var.f135010c) && wj50.m88271j(this.f135011d, lmr0Var.f135011d);
    }

    public final int hashCode() {
        return this.f135011d.hashCode() + ((this.f135010c.hashCode() + ((this.f135009b.hashCode() + (this.f135008a.hashCode() * 31)) * 31)) * 31);
    }
}
