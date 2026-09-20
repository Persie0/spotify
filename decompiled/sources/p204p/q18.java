package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class q18 {

    /* JADX INFO: renamed from: a */
    public final String f184234a;

    /* JADX INFO: renamed from: b */
    public final String f184235b;

    /* JADX INFO: renamed from: c */
    public final q3n0 f184236c;

    public q18(String str, String str2, q3n0 q3n0Var) {
        this.f184234a = str;
        this.f184235b = str2;
        this.f184236c = q3n0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q18) {
            q18 q18Var = (q18) obj;
            q3n0 q3n0Var = q18Var.f184236c;
            String str = q18Var.f184235b;
            String str2 = q18Var.f184234a;
            String str3 = this.f184234a;
            if (str3 != null ? str3.equals(str2) : str2 == null) {
                String str4 = this.f184235b;
                if (str4 != null ? str4.equals(str) : str == null) {
                    q3n0 q3n0Var2 = this.f184236c;
                    if (q3n0Var2 != null ? q3n0Var2.equals(q3n0Var) : q3n0Var == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f184234a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f184235b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        q3n0 q3n0Var = this.f184236c;
        return (q3n0Var != null ? q3n0Var.hashCode() : 0) ^ iHashCode2;
    }

    public final String toString() {
        return dq60.m36616p(String.valueOf(this.f184236c), "}", edb.m38573v("PartnerAccountLinkingResult{state=", this.f184234a, ", redirectUri=", this.f184235b, ", error="));
    }
}
