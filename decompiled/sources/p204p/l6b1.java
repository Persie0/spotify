package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l6b1 {

    /* JADX INFO: renamed from: a */
    public final String f130298a;

    /* JADX INFO: renamed from: b */
    public final String f130299b;

    /* JADX INFO: renamed from: c */
    public final String f130300c;

    /* JADX INFO: renamed from: d */
    public final String f130301d;

    public l6b1(String str, String str2, String str3, String str4) {
        this.f130298a = str;
        this.f130299b = str2;
        this.f130300c = str3;
        this.f130301d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6b1)) {
            return false;
        }
        l6b1 l6b1Var = (l6b1) obj;
        return wj50.m88271j(this.f130298a, l6b1Var.f130298a) && wj50.m88271j(this.f130299b, l6b1Var.f130299b) && wj50.m88271j(this.f130300c, l6b1Var.f130300c) && wj50.m88271j(this.f130301d, l6b1Var.f130301d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f130298a.hashCode() * 31, 31, this.f130299b), 31, this.f130300c);
        String str = this.f130301d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
