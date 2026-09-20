package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class mf91 {

    /* JADX INFO: renamed from: a */
    public final ov50 f143003a;

    /* JADX INFO: renamed from: b */
    public final eh00 f143004b;

    public mf91(ov50 ov50Var, eh00 eh00Var) {
        this.f143003a = ov50Var;
        this.f143004b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf91)) {
            return false;
        }
        mf91 mf91Var = (mf91) obj;
        return wj50.m88271j(this.f143003a, mf91Var.f143003a) && wj50.m88271j(this.f143004b, mf91Var.f143004b);
    }

    public final int hashCode() {
        return this.f143004b.hashCode() + (this.f143003a.hashCode() * 31);
    }
}
