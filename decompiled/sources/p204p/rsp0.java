package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rsp0 {

    /* JADX INFO: renamed from: a */
    public final String f202376a;

    /* JADX INFO: renamed from: b */
    public final String f202377b;

    /* JADX INFO: renamed from: c */
    public final String f202378c;

    /* JADX INFO: renamed from: d */
    public final qsp0 f202379d;

    public rsp0(String str, String str2, String str3, qsp0 qsp0Var) {
        this.f202376a = str;
        this.f202377b = str2;
        this.f202378c = str3;
        this.f202379d = qsp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsp0)) {
            return false;
        }
        rsp0 rsp0Var = (rsp0) obj;
        return wj50.m88271j(this.f202376a, rsp0Var.f202376a) && wj50.m88271j(this.f202377b, rsp0Var.f202377b) && wj50.m88271j(this.f202378c, rsp0Var.f202378c) && wj50.m88271j(this.f202379d, rsp0Var.f202379d);
    }

    public final int hashCode() {
        int iHashCode = this.f202376a.hashCode() * 31;
        String str = this.f202377b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f202378c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        qsp0 qsp0Var = this.f202379d;
        return iHashCode3 + (qsp0Var != null ? qsp0Var.hashCode() : 0);
    }
}
