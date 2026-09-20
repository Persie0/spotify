package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h740 extends i740 {

    /* JADX INFO: renamed from: a */
    public final a740 f88340a;

    /* JADX INFO: renamed from: b */
    public final String f88341b;

    public h740(a740 a740Var, String str) {
        this.f88340a = a740Var;
        this.f88341b = str;
    }

    @Override // p204p.i740
    /* JADX INFO: renamed from: a */
    public final String mo43794a() {
        return this.f88341b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h740)) {
            return false;
        }
        h740 h740Var = (h740) obj;
        return wj50.m88271j(this.f88340a, h740Var.f88340a) && wj50.m88271j(this.f88341b, h740Var.f88341b);
    }

    public final int hashCode() {
        return this.f88341b.hashCode() + (this.f88340a.hashCode() * 31);
    }
}
