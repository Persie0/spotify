package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cqq0 extends q2m0 {

    /* JADX INFO: renamed from: b */
    public final String f40971b;

    /* JADX INFO: renamed from: c */
    public final String f40972c;

    /* JADX INFO: renamed from: d */
    public final jsa0 f40973d;

    public cqq0(String str, String str2, jsa0 jsa0Var) {
        super(6);
        this.f40971b = str;
        this.f40972c = str2;
        this.f40973d = jsa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqq0)) {
            return false;
        }
        cqq0 cqq0Var = (cqq0) obj;
        return wj50.m88271j(this.f40971b, cqq0Var.f40971b) && wj50.m88271j(this.f40972c, cqq0Var.f40972c) && wj50.m88271j(this.f40973d, cqq0Var.f40973d);
    }

    public final int hashCode() {
        String str = this.f40971b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f40972c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jsa0 jsa0Var = this.f40973d;
        return iHashCode2 + (jsa0Var != null ? jsa0Var.hashCode() : 0);
    }
}
