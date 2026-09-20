package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ip0 {

    /* JADX INFO: renamed from: a */
    public final gh0 f104319a;

    /* JADX INFO: renamed from: b */
    public final String f104320b;

    /* JADX INFO: renamed from: c */
    public final String f104321c;

    /* JADX INFO: renamed from: d */
    public final String f104322d;

    /* JADX INFO: renamed from: e */
    public final it91 f104323e;

    public ip0(gh0 gh0Var, String str, String str2, String str3, it91 it91Var) {
        this.f104319a = gh0Var;
        this.f104320b = str;
        this.f104321c = str2;
        this.f104322d = str3;
        this.f104323e = it91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip0)) {
            return false;
        }
        ip0 ip0Var = (ip0) obj;
        return wj50.m88271j(this.f104319a, ip0Var.f104319a) && wj50.m88271j(this.f104320b, ip0Var.f104320b) && wj50.m88271j(this.f104321c, ip0Var.f104321c) && wj50.m88271j(this.f104322d, ip0Var.f104322d) && wj50.m88271j(this.f104323e, ip0Var.f104323e);
    }

    public final int hashCode() {
        gh0 gh0Var = this.f104319a;
        int iHashCode = (gh0Var == null ? 0 : gh0Var.hashCode()) * 31;
        String str = this.f104320b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104321c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f104322d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        it91 it91Var = this.f104323e;
        return iHashCode4 + (it91Var != null ? it91Var.hashCode() : 0);
    }
}
