package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oc90 {

    /* JADX INFO: renamed from: a */
    public final String f163875a;

    /* JADX INFO: renamed from: b */
    public final String f163876b;

    /* JADX INFO: renamed from: c */
    public final boolean f163877c;

    /* JADX INFO: renamed from: d */
    public final String f163878d;

    public oc90(String str, String str2, boolean z, String str3) {
        this.f163875a = str;
        this.f163876b = str2;
        this.f163877c = z;
        this.f163878d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc90)) {
            return false;
        }
        oc90 oc90Var = (oc90) obj;
        return wj50.m88271j(this.f163875a, oc90Var.f163875a) && wj50.m88271j(this.f163876b, oc90Var.f163876b) && this.f163877c == oc90Var.f163877c && wj50.m88271j(this.f163878d, oc90Var.f163878d);
    }

    public final int hashCode() {
        int iHashCode = this.f163875a.hashCode() * 31;
        String str = this.f163876b;
        int iM77245d = s571.m77245d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f163877c);
        String str2 = this.f163878d;
        return iM77245d + (str2 != null ? str2.hashCode() : 0);
    }
}
