package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zc6 {

    /* JADX INFO: renamed from: a */
    public final qf40 f281462a;

    /* JADX INFO: renamed from: b */
    public final String f281463b;

    /* JADX INFO: renamed from: c */
    public final gh00 f281464c;

    public zc6(qf40 qf40Var, String str, gh00 gh00Var) {
        this.f281462a = qf40Var;
        this.f281463b = str;
        this.f281464c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc6)) {
            return false;
        }
        zc6 zc6Var = (zc6) obj;
        return wj50.m88271j(this.f281462a, zc6Var.f281462a) && wj50.m88271j(this.f281463b, zc6Var.f281463b) && wj50.m88271j(this.f281464c, zc6Var.f281464c);
    }

    public final int hashCode() {
        int iHashCode = this.f281462a.hashCode() * 31;
        String str = this.f281463b;
        return this.f281464c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
