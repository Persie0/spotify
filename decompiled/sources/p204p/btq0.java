package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class btq0 {

    /* JADX INFO: renamed from: a */
    public final String f30914a;

    /* JADX INFO: renamed from: b */
    public final String f30915b;

    /* JADX INFO: renamed from: c */
    public final jba0 f30916c;

    /* JADX INFO: renamed from: d */
    public final int f30917d;

    /* JADX INFO: renamed from: e */
    public final String f30918e;

    /* JADX INFO: renamed from: f */
    public final String f30919f;

    public btq0(String str, String str2, jba0 jba0Var, int i, String str3, String str4) {
        this.f30914a = str;
        this.f30915b = str2;
        this.f30916c = jba0Var;
        this.f30917d = i;
        this.f30918e = str3;
        this.f30919f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btq0)) {
            return false;
        }
        btq0 btq0Var = (btq0) obj;
        return wj50.m88271j(this.f30914a, btq0Var.f30914a) && wj50.m88271j(this.f30915b, btq0Var.f30915b) && wj50.m88271j(this.f30916c, btq0Var.f30916c) && this.f30917d == btq0Var.f30917d && wj50.m88271j(this.f30918e, btq0Var.f30918e) && wj50.m88271j(this.f30919f, btq0Var.f30919f);
    }

    public final int hashCode() {
        int iHashCode = this.f30914a.hashCode() * 31;
        String str = this.f30915b;
        int iM77243b = s571.m77243b(mt60.m62800g(this.f30917d, (this.f30916c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31, this.f30918e);
        String str2 = this.f30919f;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
