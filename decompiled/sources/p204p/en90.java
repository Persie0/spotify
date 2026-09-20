package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class en90 {

    /* JADX INFO: renamed from: a */
    public final String f61108a;

    /* JADX INFO: renamed from: b */
    public final String f61109b;

    /* JADX INFO: renamed from: c */
    public final String f61110c;

    /* JADX INFO: renamed from: d */
    public final String f61111d;

    public en90(String str, String str2, String str3, String str4) {
        this.f61108a = str;
        this.f61109b = str2;
        this.f61110c = str3;
        this.f61111d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en90)) {
            return false;
        }
        en90 en90Var = (en90) obj;
        return wj50.m88271j(this.f61108a, en90Var.f61108a) && wj50.m88271j(this.f61109b, en90Var.f61109b) && wj50.m88271j(this.f61110c, en90Var.f61110c) && wj50.m88271j(this.f61111d, en90Var.f61111d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f61108a.hashCode() * 31, 31, this.f61109b), 31, this.f61110c);
        String str = this.f61111d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
