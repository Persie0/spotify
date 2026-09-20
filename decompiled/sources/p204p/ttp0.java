package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ttp0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f223657d = new dx00(19);

    /* JADX INFO: renamed from: a */
    public final mec0 f223658a;

    /* JADX INFO: renamed from: b */
    public final String f223659b;

    /* JADX INFO: renamed from: c */
    public final String f223660c;

    public ttp0(mec0 mec0Var, String str, String str2) {
        this.f223658a = mec0Var;
        this.f223659b = str;
        this.f223660c = str2;
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
        if (!(obj instanceof ttp0)) {
            return false;
        }
        ttp0 ttp0Var = (ttp0) obj;
        return this.f223658a.equals(ttp0Var.f223658a) && wj50.m88271j(this.f223659b, ttp0Var.f223659b) && wj50.m88271j(this.f223660c, ttp0Var.f223660c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f223657d;
    }

    public final int hashCode() {
        int iHashCode = this.f223658a.hashCode() * 31;
        String str = this.f223659b;
        return this.f223660c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
