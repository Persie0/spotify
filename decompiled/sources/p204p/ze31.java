package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ze31 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ovp0 f281872d = new ovp0(6);

    /* JADX INFO: renamed from: a */
    public final mec0 f281873a;

    /* JADX INFO: renamed from: b */
    public final String f281874b;

    /* JADX INFO: renamed from: c */
    public final String f281875c;

    public ze31(mec0 mec0Var, String str, String str2) {
        this.f281873a = mec0Var;
        this.f281874b = str;
        this.f281875c = str2;
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
        if (!(obj instanceof ze31)) {
            return false;
        }
        ze31 ze31Var = (ze31) obj;
        return this.f281873a.equals(ze31Var.f281873a) && wj50.m88271j(this.f281874b, ze31Var.f281874b) && wj50.m88271j(this.f281875c, ze31Var.f281875c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f281872d;
    }

    public final int hashCode() {
        int iHashCode = this.f281873a.hashCode() * 31;
        String str = this.f281874b;
        return this.f281875c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
