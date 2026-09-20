package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rie0 {

    /* JADX INFO: renamed from: a */
    public final String f199501a;

    /* JADX INFO: renamed from: b */
    public final String f199502b;

    /* JADX INFO: renamed from: c */
    public final String f199503c;

    public rie0(String str, String str2, String str3) {
        this.f199501a = str;
        this.f199502b = str2;
        this.f199503c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rie0)) {
            return false;
        }
        rie0 rie0Var = (rie0) obj;
        return wj50.m88271j(this.f199501a, rie0Var.f199501a) && wj50.m88271j(this.f199502b, rie0Var.f199502b) && wj50.m88271j(this.f199503c, rie0Var.f199503c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f199501a.hashCode() * 31, 31, this.f199502b);
        String str = this.f199503c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
