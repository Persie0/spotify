package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mej0 {

    /* JADX INFO: renamed from: a */
    public final i350 f142741a;

    /* JADX INFO: renamed from: b */
    public final d350 f142742b;

    public mej0(i350 i350Var, d350 d350Var) {
        this.f142741a = i350Var;
        this.f142742b = d350Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mej0)) {
            return false;
        }
        mej0 mej0Var = (mej0) obj;
        return wj50.m88271j(this.f142741a, mej0Var.f142741a) && wj50.m88271j(this.f142742b, mej0Var.f142742b);
    }

    public final int hashCode() {
        return this.f142742b.hashCode() + (this.f142741a.hashCode() * 31);
    }
}
