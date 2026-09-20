package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ztp0 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final dx00 f286233d = new dx00(23);

    /* JADX INFO: renamed from: a */
    public final mec0 f286234a;

    /* JADX INFO: renamed from: b */
    public final String f286235b;

    /* JADX INFO: renamed from: c */
    public final String f286236c;

    public ztp0(mec0 mec0Var, String str, String str2) {
        this.f286234a = mec0Var;
        this.f286235b = str;
        this.f286236c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztp0)) {
            return false;
        }
        ztp0 ztp0Var = (ztp0) obj;
        return this.f286234a.equals(ztp0Var.f286234a) && wj50.m88271j(this.f286235b, ztp0Var.f286235b) && wj50.m88271j(this.f286236c, ztp0Var.f286236c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f286233d;
    }

    public final int hashCode() {
        int iHashCode = this.f286234a.hashCode() * 31;
        String str = this.f286235b;
        return this.f286236c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
