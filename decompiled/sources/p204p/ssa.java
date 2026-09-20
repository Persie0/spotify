package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ssa {

    /* JADX INFO: renamed from: a */
    public final int f213552a;

    /* JADX INFO: renamed from: b */
    public final eh00 f213553b;

    public ssa(int i, eh00 eh00Var) {
        this.f213552a = i;
        this.f213553b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssa)) {
            return false;
        }
        ssa ssaVar = (ssa) obj;
        return this.f213552a == ssaVar.f213552a && wj50.m88271j(this.f213553b, ssaVar.f213553b);
    }

    public final int hashCode() {
        return this.f213553b.hashCode() + (Integer.hashCode(this.f213552a) * 31);
    }
}
