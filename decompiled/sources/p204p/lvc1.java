package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class lvc1 {

    /* JADX INFO: renamed from: a */
    public final String f137279a;

    /* JADX INFO: renamed from: b */
    public final eh00 f137280b;

    public lvc1(String str, eh00 eh00Var) {
        this.f137279a = str;
        this.f137280b = eh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvc1)) {
            return false;
        }
        lvc1 lvc1Var = (lvc1) obj;
        return wj50.m88271j(this.f137279a, lvc1Var.f137279a) && wj50.m88271j(this.f137280b, lvc1Var.f137280b);
    }

    public final int hashCode() {
        String str = this.f137279a;
        return this.f137280b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
