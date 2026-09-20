package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class r2j0 extends b3j0 {

    /* JADX INFO: renamed from: a */
    public final kbm0 f195156a;

    public r2j0(kbm0 kbm0Var) {
        this.f195156a = kbm0Var;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: a */
    public final boolean mo28034a() {
        return false;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: b */
    public final String mo28035b() {
        return s571.m77251j("cross_user_handoff(", this.f195156a.f121231a, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2j0) && wj50.m88271j(this.f195156a, ((r2j0) obj).f195156a);
    }

    public final int hashCode() {
        return this.f195156a.f121231a.hashCode();
    }
}
