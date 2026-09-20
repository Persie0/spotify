package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gt90 {

    /* JADX INFO: renamed from: a */
    public final String f84109a;

    /* JADX INFO: renamed from: b */
    public final String f84110b;

    /* JADX INFO: renamed from: c */
    public final String f84111c;

    /* JADX INFO: renamed from: d */
    public final String f84112d;

    public gt90(String str, String str2, String str3, String str4) {
        this.f84109a = str;
        this.f84110b = str2;
        this.f84111c = str3;
        this.f84112d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt90)) {
            return false;
        }
        gt90 gt90Var = (gt90) obj;
        return wj50.m88271j(this.f84109a, gt90Var.f84109a) && wj50.m88271j(this.f84110b, gt90Var.f84110b) && wj50.m88271j(this.f84111c, gt90Var.f84111c) && wj50.m88271j(this.f84112d, gt90Var.f84112d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f84109a.hashCode() * 31, 31, this.f84110b), 31, this.f84111c);
        String str = this.f84112d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
