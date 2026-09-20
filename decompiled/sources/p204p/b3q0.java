package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b3q0 {

    /* JADX INFO: renamed from: a */
    public final String f23107a;

    /* JADX INFO: renamed from: b */
    public final String f23108b;

    /* JADX INFO: renamed from: c */
    public final String f23109c;

    /* JADX INFO: renamed from: d */
    public final String f23110d;

    /* JADX INFO: renamed from: e */
    public final boolean f23111e;

    /* JADX INFO: renamed from: f */
    public final boolean f23112f;

    public b3q0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f23107a = str;
        this.f23108b = str2;
        this.f23109c = str3;
        this.f23110d = str4;
        this.f23111e = z;
        this.f23112f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3q0)) {
            return false;
        }
        b3q0 b3q0Var = (b3q0) obj;
        return wj50.m88271j(this.f23107a, b3q0Var.f23107a) && wj50.m88271j(this.f23108b, b3q0Var.f23108b) && wj50.m88271j(this.f23109c, b3q0Var.f23109c) && wj50.m88271j(this.f23110d, b3q0Var.f23110d) && this.f23111e == b3q0Var.f23111e && this.f23112f == b3q0Var.f23112f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f23107a.hashCode() * 31, 31, this.f23108b);
        String str = this.f23109c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23110d;
        return Boolean.hashCode(this.f23112f) + s571.m77245d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f23111e);
    }
}
