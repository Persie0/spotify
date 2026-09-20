package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ocd1 {

    /* JADX INFO: renamed from: a */
    public final ir50 f163903a;

    /* JADX INFO: renamed from: b */
    public final dad1 f163904b;

    /* JADX INFO: renamed from: c */
    public final String f163905c;

    /* JADX INFO: renamed from: d */
    public final String f163906d;

    /* JADX INFO: renamed from: e */
    public final String f163907e;

    /* JADX INFO: renamed from: f */
    public final String f163908f;

    public ocd1(ir50 ir50Var, dad1 dad1Var, String str, String str2, String str3, String str4) {
        this.f163903a = ir50Var;
        this.f163904b = dad1Var;
        this.f163905c = str;
        this.f163906d = str2;
        this.f163907e = str3;
        this.f163908f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocd1)) {
            return false;
        }
        ocd1 ocd1Var = (ocd1) obj;
        return wj50.m88271j(this.f163903a, ocd1Var.f163903a) && wj50.m88271j(this.f163904b, ocd1Var.f163904b) && wj50.m88271j(this.f163905c, ocd1Var.f163905c) && wj50.m88271j(this.f163906d, ocd1Var.f163906d) && wj50.m88271j(this.f163907e, ocd1Var.f163907e) && wj50.m88271j(this.f163908f, ocd1Var.f163908f);
    }

    public final int hashCode() {
        int iHashCode = this.f163903a.hashCode() * 31;
        dad1 dad1Var = this.f163904b;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (dad1Var == null ? 0 : dad1Var.hashCode())) * 31, 31, this.f163905c), 31, this.f163906d), 31, this.f163907e);
        String str = this.f163908f;
        return iM77243b + (str != null ? str.hashCode() : 0);
    }
}
