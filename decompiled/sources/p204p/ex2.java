package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ex2 {

    /* JADX INFO: renamed from: a */
    public final v140 f63648a;

    /* JADX INFO: renamed from: b */
    public final erc1 f63649b;

    /* JADX INFO: renamed from: c */
    public final boolean f63650c;

    public ex2(v140 v140Var, erc1 erc1Var, boolean z) {
        this.f63648a = v140Var;
        this.f63649b = erc1Var;
        this.f63650c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex2)) {
            return false;
        }
        ex2 ex2Var = (ex2) obj;
        return wj50.m88271j(this.f63648a, ex2Var.f63648a) && wj50.m88271j(this.f63649b, ex2Var.f63649b) && this.f63650c == ex2Var.f63650c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63650c) + ((this.f63649b.hashCode() + (this.f63648a.hashCode() * 31)) * 31);
    }
}
