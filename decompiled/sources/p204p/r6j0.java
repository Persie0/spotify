package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class r6j0 {

    /* JADX INFO: renamed from: a */
    public final String f196301a;

    /* JADX INFO: renamed from: b */
    public final String f196302b;

    /* JADX INFO: renamed from: c */
    public final String f196303c;

    public /* synthetic */ r6j0(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6j0)) {
            return false;
        }
        r6j0 r6j0Var = (r6j0) obj;
        return wj50.m88271j(this.f196301a, r6j0Var.f196301a) && wj50.m88271j(this.f196302b, r6j0Var.f196302b) && wj50.m88271j(this.f196303c, r6j0Var.f196303c);
    }

    public final int hashCode() {
        int iHashCode = this.f196301a.hashCode() * 31;
        String str = this.f196302b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f196303c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public r6j0(String str, String str2, String str3) {
        this.f196301a = str;
        this.f196302b = str2;
        this.f196303c = str3;
    }
}
