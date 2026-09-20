package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class pkd1 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ovp0 f178447d = new ovp0(17);

    /* JADX INFO: renamed from: a */
    public final mec0 f178448a;

    /* JADX INFO: renamed from: b */
    public final String f178449b;

    /* JADX INFO: renamed from: c */
    public final String f178450c;

    public pkd1(mec0 mec0Var, String str, String str2) {
        this.f178448a = mec0Var;
        this.f178449b = str;
        this.f178450c = str2;
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
        if (!(obj instanceof pkd1)) {
            return false;
        }
        pkd1 pkd1Var = (pkd1) obj;
        return this.f178448a.equals(pkd1Var.f178448a) && wj50.m88271j(this.f178449b, pkd1Var.f178449b) && wj50.m88271j(this.f178450c, pkd1Var.f178450c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f178447d;
    }

    public final int hashCode() {
        int iHashCode = this.f178448a.hashCode() * 31;
        String str = this.f178449b;
        return this.f178450c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
