package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xix0 {

    /* JADX INFO: renamed from: a */
    public final String f261954a;

    /* JADX INFO: renamed from: b */
    public final String f261955b;

    /* JADX INFO: renamed from: c */
    public final String f261956c;

    public xix0(String str, String str2, String str3) {
        this.f261954a = str;
        this.f261955b = str2;
        this.f261956c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xix0)) {
            return false;
        }
        xix0 xix0Var = (xix0) obj;
        return wj50.m88271j(this.f261954a, xix0Var.f261954a) && wj50.m88271j(this.f261955b, xix0Var.f261955b) && wj50.m88271j(this.f261956c, xix0Var.f261956c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f261954a.hashCode() * 31, 31, this.f261955b);
        String str = this.f261956c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
