package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s86 {

    /* JADX INFO: renamed from: a */
    public final String f206564a;

    /* JADX INFO: renamed from: b */
    public final String f206565b;

    public s86(String str, String str2) {
        this.f206564a = str;
        this.f206565b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s86)) {
            return false;
        }
        s86 s86Var = (s86) obj;
        return wj50.m88271j(this.f206564a, s86Var.f206564a) && wj50.m88271j(this.f206565b, s86Var.f206565b);
    }

    public final int hashCode() {
        String str = this.f206564a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f206565b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
