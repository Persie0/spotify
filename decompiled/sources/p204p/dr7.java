package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dr7 implements er7 {

    /* JADX INFO: renamed from: a */
    public final String f52181a;

    /* JADX INFO: renamed from: b */
    public final String f52182b;

    public dr7(String str, String str2) {
        this.f52181a = str;
        this.f52182b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr7)) {
            return false;
        }
        dr7 dr7Var = (dr7) obj;
        return wj50.m88271j(this.f52181a, dr7Var.f52181a) && wj50.m88271j(this.f52182b, dr7Var.f52182b);
    }

    public final int hashCode() {
        int iHashCode = zew.f282132Y.hashCode() * 31;
        String str = this.f52181a;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f52182b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
