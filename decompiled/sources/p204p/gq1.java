package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gq1 implements jq1 {

    /* JADX INFO: renamed from: a */
    public final String f83312a;

    /* JADX INFO: renamed from: b */
    public final o7y0 f83313b;

    public gq1(String str, o7y0 o7y0Var) {
        this.f83312a = str;
        this.f83313b = o7y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq1)) {
            return false;
        }
        gq1 gq1Var = (gq1) obj;
        return wj50.m88271j(this.f83312a, gq1Var.f83312a) && wj50.m88271j(this.f83313b, gq1Var.f83313b);
    }

    public final int hashCode() {
        return this.f83313b.hashCode() + (this.f83312a.hashCode() * 31);
    }
}
