package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mhx {

    /* JADX INFO: renamed from: a */
    public final eh00 f143884a;

    /* JADX INFO: renamed from: b */
    public final eh00 f143885b;

    public mhx(eh00 eh00Var, eh00 eh00Var2) {
        this.f143884a = eh00Var;
        this.f143885b = eh00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhx)) {
            return false;
        }
        mhx mhxVar = (mhx) obj;
        return wj50.m88271j(this.f143884a, mhxVar.f143884a) && wj50.m88271j(this.f143885b, mhxVar.f143885b);
    }

    public final int hashCode() {
        return this.f143885b.hashCode() + (this.f143884a.hashCode() * 31);
    }
}
