package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class txc1 implements ayc1 {

    /* JADX INFO: renamed from: a */
    public final String f224680a;

    /* JADX INFO: renamed from: b */
    public final n601 f224681b;

    public txc1(String str, n601 n601Var) {
        this.f224680a = str;
        this.f224681b = n601Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txc1)) {
            return false;
        }
        txc1 txc1Var = (txc1) obj;
        return wj50.m88271j(this.f224680a, txc1Var.f224680a) && wj50.m88271j(this.f224681b, txc1Var.f224681b);
    }

    public final int hashCode() {
        return this.f224681b.hashCode() + (this.f224680a.hashCode() * 31);
    }
}
