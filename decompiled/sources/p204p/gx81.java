package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gx81 {

    /* JADX INFO: renamed from: a */
    public final String f85224a;

    /* JADX INFO: renamed from: b */
    public final String f85225b;

    /* JADX INFO: renamed from: c */
    public final String f85226c;

    /* JADX INFO: renamed from: d */
    public final long f85227d;

    public gx81(long j, String str, String str2, String str3) {
        this.f85224a = str;
        this.f85225b = str2;
        this.f85226c = str3;
        this.f85227d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx81)) {
            return false;
        }
        gx81 gx81Var = (gx81) obj;
        return wj50.m88271j(this.f85224a, gx81Var.f85224a) && wj50.m88271j(this.f85225b, gx81Var.f85225b) && wj50.m88271j(this.f85226c, gx81Var.f85226c) && this.f85227d == gx81Var.f85227d;
    }

    public final int hashCode() {
        String str = this.f85224a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85225b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85226c;
        return Long.hashCode(this.f85227d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
