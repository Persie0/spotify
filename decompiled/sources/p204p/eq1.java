package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class eq1 implements jq1 {

    /* JADX INFO: renamed from: a */
    public final a8i0 f61757a;

    /* JADX INFO: renamed from: b */
    public final String f61758b;

    public eq1(a8i0 a8i0Var, String str) {
        this.f61757a = a8i0Var;
        this.f61758b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq1)) {
            return false;
        }
        eq1 eq1Var = (eq1) obj;
        return wj50.m88271j(this.f61757a, eq1Var.f61757a) && wj50.m88271j(this.f61758b, eq1Var.f61758b);
    }

    public final int hashCode() {
        return this.f61758b.hashCode() + (this.f61757a.hashCode() * 31);
    }
}
