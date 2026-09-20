package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ba8 {

    /* JADX INFO: renamed from: a */
    public final String f25106a;

    /* JADX INFO: renamed from: b */
    public final String f25107b;

    /* JADX INFO: renamed from: c */
    public final String f25108c;

    public ba8(String str, String str2, String str3) {
        this.f25106a = str;
        this.f25107b = str2;
        this.f25108c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba8)) {
            return false;
        }
        ba8 ba8Var = (ba8) obj;
        return wj50.m88271j(this.f25106a, ba8Var.f25106a) && wj50.m88271j(this.f25107b, ba8Var.f25107b) && wj50.m88271j(this.f25108c, ba8Var.f25108c);
    }

    public final int hashCode() {
        String str = this.f25106a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25107b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25108c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
