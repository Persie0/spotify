package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bx00 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f31758d = new ak0(28);

    /* JADX INFO: renamed from: a */
    public final mec0 f31759a;

    /* JADX INFO: renamed from: b */
    public final String f31760b;

    /* JADX INFO: renamed from: c */
    public final String f31761c;

    public bx00(mec0 mec0Var, String str, String str2) {
        this.f31759a = mec0Var;
        this.f31760b = str;
        this.f31761c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx00)) {
            return false;
        }
        bx00 bx00Var = (bx00) obj;
        return this.f31759a.equals(bx00Var.f31759a) && wj50.m88271j(this.f31760b, bx00Var.f31760b) && wj50.m88271j(this.f31761c, bx00Var.f31761c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f31758d;
    }

    public final int hashCode() {
        int iHashCode = this.f31759a.hashCode() * 31;
        String str = this.f31760b;
        return this.f31761c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
