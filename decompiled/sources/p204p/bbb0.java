package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bbb0 {

    /* JADX INFO: renamed from: a */
    public final String f25527a;

    /* JADX INFO: renamed from: b */
    public final String f25528b;

    /* JADX INFO: renamed from: c */
    public final String f25529c;

    public bbb0(String str, String str2, String str3) {
        this.f25527a = str;
        this.f25528b = str2;
        this.f25529c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbb0)) {
            return false;
        }
        bbb0 bbb0Var = (bbb0) obj;
        return wj50.m88271j(this.f25527a, bbb0Var.f25527a) && wj50.m88271j(this.f25528b, bbb0Var.f25528b) && wj50.m88271j(this.f25529c, bbb0Var.f25529c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f25527a.hashCode() * 31, 31, this.f25528b);
        String str = this.f25529c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
