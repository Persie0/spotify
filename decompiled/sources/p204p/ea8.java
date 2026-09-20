package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ea8 {

    /* JADX INFO: renamed from: a */
    public final String f57601a;

    /* JADX INFO: renamed from: b */
    public final String f57602b;

    /* JADX INFO: renamed from: c */
    public final String f57603c;

    public ea8(String str, String str2, String str3) {
        this.f57601a = str;
        this.f57602b = str2;
        this.f57603c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea8)) {
            return false;
        }
        ea8 ea8Var = (ea8) obj;
        return wj50.m88271j(this.f57601a, ea8Var.f57601a) && wj50.m88271j(this.f57602b, ea8Var.f57602b) && wj50.m88271j(this.f57603c, ea8Var.f57603c);
    }

    public final int hashCode() {
        String str = this.f57601a;
        int iM77243b = s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f57602b);
        String str2 = this.f57603c;
        return iM77243b + (str2 != null ? str2.hashCode() : 0);
    }
}
