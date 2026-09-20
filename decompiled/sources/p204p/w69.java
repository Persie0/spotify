package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class w69 {

    /* JADX INFO: renamed from: a */
    public final String f248282a;

    /* JADX INFO: renamed from: b */
    public final String f248283b;

    /* JADX INFO: renamed from: c */
    public final String f248284c;

    /* JADX INFO: renamed from: d */
    public final String f248285d;

    /* JADX INFO: renamed from: e */
    public final boolean f248286e;

    /* JADX INFO: renamed from: f */
    public final String f248287f;

    public w69(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f248282a = str;
        this.f248283b = str2;
        this.f248284c = str3;
        this.f248285d = str4;
        this.f248286e = z;
        this.f248287f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w69)) {
            return false;
        }
        w69 w69Var = (w69) obj;
        return wj50.m88271j(this.f248282a, w69Var.f248282a) && wj50.m88271j(this.f248283b, w69Var.f248283b) && wj50.m88271j(this.f248284c, w69Var.f248284c) && wj50.m88271j(this.f248285d, w69Var.f248285d) && this.f248286e == w69Var.f248286e && wj50.m88271j(this.f248287f, w69Var.f248287f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f248282a.hashCode() * 31, 31, this.f248283b), 31, this.f248284c), 31, this.f248285d), 31, this.f248286e);
        String str = this.f248287f;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
