package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class v6m0 implements x6m0 {

    /* JADX INFO: renamed from: a */
    public final kj20 f237923a;

    /* JADX INFO: renamed from: b */
    public final gq80 f237924b;

    public v6m0(kj20 kj20Var, gq80 gq80Var) {
        this.f237923a = kj20Var;
        this.f237924b = gq80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6m0)) {
            return false;
        }
        v6m0 v6m0Var = (v6m0) obj;
        return wj50.m88271j(this.f237923a, v6m0Var.f237923a) && wj50.m88271j(this.f237924b, v6m0Var.f237924b);
    }

    public final int hashCode() {
        return this.f237924b.hashCode() + (this.f237923a.hashCode() * 31);
    }
}
