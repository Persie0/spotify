package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ii01 {

    /* JADX INFO: renamed from: a */
    public final fmx0 f102389a;

    /* JADX INFO: renamed from: b */
    public final fmx0 f102390b;

    /* JADX INFO: renamed from: c */
    public final ch01 f102391c;

    public ii01() {
        fmx0 fmx0VarM47993b = hmx0.m47993b(24);
        fmx0 fmx0VarM47993b2 = hmx0.m47993b(36);
        fmx0 fmx0Var = hmx0.f93097a;
        this.f102389a = fmx0VarM47993b;
        this.f102390b = fmx0VarM47993b2;
        this.f102391c = fmx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final ch01 m50673a() {
        return this.f102391c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii01)) {
            return false;
        }
        ii01 ii01Var = (ii01) obj;
        return wj50.m88271j(this.f102389a, ii01Var.f102389a) && wj50.m88271j(this.f102390b, ii01Var.f102390b) && wj50.m88271j(this.f102391c, ii01Var.f102391c);
    }

    public final int hashCode() {
        return this.f102391c.hashCode() + ((this.f102390b.hashCode() + (this.f102389a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f102389a + ", medium=" + this.f102390b + ", large=" + this.f102391c + ")";
    }
}
