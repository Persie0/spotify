package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ji01 {

    /* JADX INFO: renamed from: a */
    public final fmx0 f112602a;

    /* JADX INFO: renamed from: b */
    public final fmx0 f112603b;

    /* JADX INFO: renamed from: c */
    public final fmx0 f112604c;

    public ji01() {
        fmx0 fmx0VarM47993b = hmx0.m47993b(4);
        fmx0 fmx0VarM47993b2 = hmx0.m47993b(4);
        fmx0 fmx0VarM47993b3 = hmx0.m47993b(0);
        this.f112602a = fmx0VarM47993b;
        this.f112603b = fmx0VarM47993b2;
        this.f112604c = fmx0VarM47993b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji01)) {
            return false;
        }
        ji01 ji01Var = (ji01) obj;
        return wj50.m88271j(this.f112602a, ji01Var.f112602a) && wj50.m88271j(this.f112603b, ji01Var.f112603b) && wj50.m88271j(this.f112604c, ji01Var.f112604c);
    }

    public final int hashCode() {
        return this.f112604c.hashCode() + ((this.f112603b.hashCode() + (this.f112602a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f112602a + ", medium=" + this.f112603b + ", large=" + this.f112604c + ')';
    }
}
