package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fkf implements lkf {

    /* JADX INFO: renamed from: a */
    public final String f70532a;

    /* JADX INFO: renamed from: b */
    public final String f70533b;

    /* JADX INFO: renamed from: c */
    public final sef f70534c;

    /* JADX INFO: renamed from: d */
    public final z650 f70535d;

    /* JADX INFO: renamed from: e */
    public final boolean f70536e;

    public fkf(String str, String str2, sef sefVar, z650 z650Var, boolean z) {
        this.f70532a = str;
        this.f70533b = str2;
        this.f70534c = sefVar;
        this.f70535d = z650Var;
        this.f70536e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkf)) {
            return false;
        }
        fkf fkfVar = (fkf) obj;
        return wj50.m88271j(this.f70532a, fkfVar.f70532a) && wj50.m88271j(this.f70533b, fkfVar.f70533b) && wj50.m88271j(this.f70534c, fkfVar.f70534c) && wj50.m88271j(this.f70535d, fkfVar.f70535d) && this.f70536e == fkfVar.f70536e;
    }

    public final int hashCode() {
        int iHashCode = (this.f70534c.hashCode() + s571.m77243b(this.f70532a.hashCode() * 31, 31, this.f70533b)) * 31;
        z650 z650Var = this.f70535d;
        return Boolean.hashCode(this.f70536e) + ((iHashCode + (z650Var == null ? 0 : z650Var.f279709a.hashCode())) * 31);
    }
}
