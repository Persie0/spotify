package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jy0 {

    /* JADX INFO: renamed from: a */
    public final rk7 f117258a;

    /* JADX INFO: renamed from: b */
    public final String f117259b;

    /* JADX INFO: renamed from: c */
    public final String f117260c;

    public jy0(String str, String str2, rk7 rk7Var) {
        this.f117258a = rk7Var;
        this.f117259b = str;
        this.f117260c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final rk7 m54736a() {
        return this.f117258a;
    }

    /* JADX INFO: renamed from: b */
    public final String m54737b() {
        return this.f117260c;
    }

    /* JADX INFO: renamed from: c */
    public final String m54738c() {
        return this.f117259b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy0)) {
            return false;
        }
        jy0 jy0Var = (jy0) obj;
        return this.f117258a == jy0Var.f117258a && wj50.m88271j(this.f117259b, jy0Var.f117259b) && wj50.m88271j(this.f117260c, jy0Var.f117260c);
    }

    public final int hashCode() {
        rk7 rk7Var = this.f117258a;
        int iHashCode = (rk7Var == null ? 0 : rk7Var.hashCode()) * 31;
        String str = this.f117259b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117260c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
