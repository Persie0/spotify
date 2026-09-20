package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w86 {

    /* JADX INFO: renamed from: a */
    public final String f248858a;

    /* JADX INFO: renamed from: b */
    public final String f248859b;

    public w86(String str, String str2) {
        this.f248858a = str;
        this.f248859b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w86)) {
            return false;
        }
        w86 w86Var = (w86) obj;
        return wj50.m88271j(this.f248858a, w86Var.f248858a) && wj50.m88271j(this.f248859b, w86Var.f248859b);
    }

    public final int hashCode() {
        String str = this.f248858a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f248859b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
