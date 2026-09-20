package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nvp0 implements he41 {

    /* JADX INFO: renamed from: f */
    public static final iup0 f158938f = new iup0(29);

    /* JADX INFO: renamed from: a */
    public final String f158939a;

    /* JADX INFO: renamed from: b */
    public final String f158940b;

    /* JADX INFO: renamed from: c */
    public final mec0 f158941c;

    /* JADX INFO: renamed from: d */
    public final String f158942d;

    /* JADX INFO: renamed from: e */
    public final String f158943e;

    public nvp0(String str, String str2, mec0 mec0Var, String str3, String str4) {
        this.f158939a = str;
        this.f158940b = str2;
        this.f158941c = mec0Var;
        this.f158942d = str3;
        this.f158943e = str4;
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
        if (!(obj instanceof nvp0)) {
            return false;
        }
        nvp0 nvp0Var = (nvp0) obj;
        return this.f158939a.equals(nvp0Var.f158939a) && this.f158940b.equals(nvp0Var.f158940b) && this.f158941c.equals(nvp0Var.f158941c) && wj50.m88271j(this.f158942d, nvp0Var.f158942d) && wj50.m88271j(this.f158943e, nvp0Var.f158943e);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f158938f;
    }

    public final int hashCode() {
        int iM42462f = fr0.m42462f(this.f158941c, s571.m77243b(this.f158939a.hashCode() * 31, 31, this.f158940b), 31);
        String str = this.f158942d;
        return this.f158943e.hashCode() + ((iM42462f + (str == null ? 0 : str.hashCode())) * 31);
    }
}
