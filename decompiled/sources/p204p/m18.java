package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class m18 {

    /* JADX INFO: renamed from: a */
    public final int f138862a;

    /* JADX INFO: renamed from: b */
    public final String f138863b;

    /* JADX INFO: renamed from: c */
    public final String f138864c;

    /* JADX INFO: renamed from: d */
    public final String f138865d;

    public m18(String str, String str2, int i, String str3) {
        if (i == 0) {
            throw new NullPointerException("Null getType");
        }
        this.f138862a = i;
        this.f138863b = str;
        this.f138864c = str2;
        this.f138865d = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m18)) {
            return false;
        }
        m18 m18Var = (m18) obj;
        return edb.m38554c(this.f138862a, m18Var.f138862a) && this.f138863b.equals(m18Var.f138863b) && this.f138864c.equals(m18Var.f138864c) && this.f138865d.equals(m18Var.f138865d);
    }

    public final int hashCode() {
        return ((((((edb.m38547C(this.f138862a) ^ 1000003) * 1000003) ^ this.f138863b.hashCode()) * 1000003) ^ this.f138864c.hashCode()) * 1000003) ^ this.f138865d.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.f138862a;
        if (i == 1) {
            str = "TOKEN_RECEIVED";
        } else if (i != 2) {
            str = i != 3 ? "null" : "LOGIN_FAILED";
        } else {
            str = "LOGGING_IN";
        }
        return klh.m56837i(edb.m38573v("LoginState{getType=", str, ", errorMessage=", this.f138863b, ", authCode="), this.f138864c, ", apiServerUrl=", this.f138865d, "}");
    }
}
