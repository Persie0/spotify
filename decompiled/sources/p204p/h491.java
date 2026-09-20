package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class h491 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ovp0 f87473d = new ovp0(8);

    /* JADX INFO: renamed from: a */
    public final mec0 f87474a;

    /* JADX INFO: renamed from: b */
    public final String f87475b;

    /* JADX INFO: renamed from: c */
    public final String f87476c;

    public h491(mec0 mec0Var, String str, String str2) {
        this.f87474a = mec0Var;
        this.f87475b = str;
        this.f87476c = str2;
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
        if (!(obj instanceof h491)) {
            return false;
        }
        h491 h491Var = (h491) obj;
        return this.f87474a.equals(h491Var.f87474a) && wj50.m88271j(this.f87475b, h491Var.f87475b) && wj50.m88271j(this.f87476c, h491Var.f87476c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f87473d;
    }

    public final int hashCode() {
        int iHashCode = this.f87474a.hashCode() * 31;
        String str = this.f87475b;
        return this.f87476c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
