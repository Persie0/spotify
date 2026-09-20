package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class k7b1 extends m7b1 {

    /* JADX INFO: renamed from: a */
    public final String f120034a;

    /* JADX INFO: renamed from: b */
    public final String f120035b;

    /* JADX INFO: renamed from: c */
    public final d850 f120036c;

    public k7b1(String str, String str2, d850 d850Var) {
        this.f120034a = str;
        this.f120035b = str2;
        this.f120036c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7b1)) {
            return false;
        }
        k7b1 k7b1Var = (k7b1) obj;
        return wj50.m88271j(this.f120034a, k7b1Var.f120034a) && wj50.m88271j(this.f120035b, k7b1Var.f120035b) && wj50.m88271j(this.f120036c, k7b1Var.f120036c);
    }

    public final int hashCode() {
        return this.f120036c.hashCode() + s571.m77243b(this.f120034a.hashCode() * 31, 31, this.f120035b);
    }
}
