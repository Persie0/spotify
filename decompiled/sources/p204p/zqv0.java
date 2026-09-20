package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zqv0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ovp0 f285467d = new ovp0(1);

    /* JADX INFO: renamed from: a */
    public final mec0 f285468a;

    /* JADX INFO: renamed from: b */
    public final String f285469b;

    /* JADX INFO: renamed from: c */
    public final String f285470c;

    public zqv0(mec0 mec0Var, String str, String str2) {
        this.f285468a = mec0Var;
        this.f285469b = str;
        this.f285470c = str2;
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
        if (!(obj instanceof zqv0)) {
            return false;
        }
        zqv0 zqv0Var = (zqv0) obj;
        return this.f285468a.equals(zqv0Var.f285468a) && wj50.m88271j(this.f285469b, zqv0Var.f285469b) && wj50.m88271j(this.f285470c, zqv0Var.f285470c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f285467d;
    }

    public final int hashCode() {
        int iHashCode = this.f285468a.hashCode() * 31;
        String str = this.f285469b;
        return this.f285470c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
