package p204p;

/* JADX INFO: loaded from: classes7.dex */
@rtz0
public final class jr50 {
    public static final hq50 Companion = new hq50();

    /* JADX INFO: renamed from: a */
    public final String f115088a;

    /* JADX INFO: renamed from: b */
    public final String f115089b;

    /* JADX INFO: renamed from: c */
    public final String f115090c;

    /* JADX INFO: renamed from: d */
    public final String f115091d;

    public /* synthetic */ jr50(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f115088a = null;
        } else {
            this.f115088a = str;
        }
        if ((i & 2) == 0) {
            this.f115089b = null;
        } else {
            this.f115089b = str2;
        }
        if ((i & 4) == 0) {
            this.f115090c = null;
        } else {
            this.f115090c = str3;
        }
        if ((i & 8) == 0) {
            this.f115091d = null;
        } else {
            this.f115091d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr50)) {
            return false;
        }
        jr50 jr50Var = (jr50) obj;
        return wj50.m88271j(this.f115088a, jr50Var.f115088a) && wj50.m88271j(this.f115089b, jr50Var.f115089b) && wj50.m88271j(this.f115090c, jr50Var.f115090c) && wj50.m88271j(this.f115091d, jr50Var.f115091d);
    }

    public final int hashCode() {
        String str = this.f115088a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f115089b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f115090c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f115091d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
