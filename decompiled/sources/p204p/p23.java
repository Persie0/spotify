package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p23 {

    /* JADX INFO: renamed from: a */
    public final String f173228a;

    /* JADX INFO: renamed from: b */
    public final String f173229b;

    /* JADX INFO: renamed from: c */
    public final String f173230c;

    public p23(String str, String str2, String str3) {
        this.f173228a = str;
        this.f173229b = str2;
        this.f173230c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p23)) {
            return false;
        }
        p23 p23Var = (p23) obj;
        return wj50.m88271j(this.f173228a, p23Var.f173228a) && wj50.m88271j(this.f173229b, p23Var.f173229b) && wj50.m88271j(this.f173230c, p23Var.f173230c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f173228a.hashCode() * 31, 31, this.f173229b);
        String str = this.f173230c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
