package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class gw50 implements hw50 {

    /* JADX INFO: renamed from: a */
    public final in81 f84934a;

    /* JADX INFO: renamed from: b */
    public final s5a0 f84935b;

    public gw50(in81 in81Var, s5a0 s5a0Var) {
        this.f84934a = in81Var;
        this.f84935b = s5a0Var;
    }

    @Override // p204p.hw50
    /* JADX INFO: renamed from: a */
    public final s5a0 mo42939a() {
        return this.f84935b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw50)) {
            return false;
        }
        gw50 gw50Var = (gw50) obj;
        return wj50.m88271j(this.f84934a, gw50Var.f84934a) && wj50.m88271j(this.f84935b, gw50Var.f84935b);
    }

    public final int hashCode() {
        return this.f84935b.hashCode() + (this.f84934a.hashCode() * 31);
    }
}
