package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fr11 {

    /* JADX INFO: renamed from: a */
    public final String f72334a;

    /* JADX INFO: renamed from: b */
    public final String f72335b;

    /* JADX INFO: renamed from: c */
    public final String f72336c;

    public fr11(String str, String str2, String str3) {
        this.f72334a = str;
        this.f72335b = str2;
        this.f72336c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr11)) {
            return false;
        }
        fr11 fr11Var = (fr11) obj;
        return wj50.m88271j(this.f72334a, fr11Var.f72334a) && wj50.m88271j(this.f72335b, fr11Var.f72335b) && wj50.m88271j(this.f72336c, fr11Var.f72336c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f72334a.hashCode() * 31, 31, this.f72335b);
        String str = this.f72336c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
