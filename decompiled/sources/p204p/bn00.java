package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bn00 {

    /* JADX INFO: renamed from: a */
    public final String f28669a;

    /* JADX INFO: renamed from: b */
    public final String f28670b;

    /* JADX INFO: renamed from: c */
    public final String f28671c;

    public bn00(String str, String str2, String str3) {
        this.f28669a = str;
        this.f28670b = str2;
        this.f28671c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn00)) {
            return false;
        }
        bn00 bn00Var = (bn00) obj;
        return wj50.m88271j(this.f28669a, bn00Var.f28669a) && wj50.m88271j(this.f28670b, bn00Var.f28670b) && wj50.m88271j(this.f28671c, bn00Var.f28671c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f28669a.hashCode() * 31, 31, this.f28670b);
        String str = this.f28671c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
