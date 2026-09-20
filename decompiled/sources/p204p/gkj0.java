package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gkj0 {

    /* JADX INFO: renamed from: a */
    public final String f80815a;

    /* JADX INFO: renamed from: b */
    public final String f80816b;

    /* JADX INFO: renamed from: c */
    public final fkj0 f80817c;

    /* JADX INFO: renamed from: d */
    public final fkj0 f80818d;

    public /* synthetic */ gkj0(String str, String str2, fkj0 fkj0Var, int i) {
        this(str, str2, (i & 4) != 0 ? null : fkj0Var, (fkj0) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkj0)) {
            return false;
        }
        gkj0 gkj0Var = (gkj0) obj;
        return wj50.m88271j(this.f80815a, gkj0Var.f80815a) && wj50.m88271j(this.f80816b, gkj0Var.f80816b) && wj50.m88271j(this.f80817c, gkj0Var.f80817c) && wj50.m88271j(this.f80818d, gkj0Var.f80818d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f80815a.hashCode() * 31, 31, this.f80816b);
        fkj0 fkj0Var = this.f80817c;
        int iHashCode = (iM77243b + (fkj0Var == null ? 0 : fkj0Var.hashCode())) * 31;
        fkj0 fkj0Var2 = this.f80818d;
        return iHashCode + (fkj0Var2 != null ? fkj0Var2.hashCode() : 0);
    }

    public gkj0(String str, String str2, fkj0 fkj0Var, fkj0 fkj0Var2) {
        this.f80815a = str;
        this.f80816b = str2;
        this.f80817c = fkj0Var;
        this.f80818d = fkj0Var2;
    }
}
