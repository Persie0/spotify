package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cs51 {

    /* JADX INFO: renamed from: a */
    public final wwu f41474a;

    /* JADX INFO: renamed from: b */
    public final String f41475b;

    /* JADX INFO: renamed from: c */
    public final String f41476c;

    /* JADX INFO: renamed from: d */
    public final boolean f41477d;

    /* JADX INFO: renamed from: e */
    public final String f41478e;

    public cs51(wwu wwuVar, String str, String str2, boolean z, String str3) {
        this.f41474a = wwuVar;
        this.f41475b = str;
        this.f41476c = str2;
        this.f41477d = z;
        this.f41478e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs51)) {
            return false;
        }
        cs51 cs51Var = (cs51) obj;
        return wj50.m88271j(this.f41474a, cs51Var.f41474a) && wj50.m88271j(this.f41475b, cs51Var.f41475b) && wj50.m88271j(this.f41476c, cs51Var.f41476c) && this.f41477d == cs51Var.f41477d && wj50.m88271j(this.f41478e, cs51Var.f41478e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f41474a.hashCode() * 31, 31, this.f41475b);
        String str = this.f41476c;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f41477d);
        String str2 = this.f41478e;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}
