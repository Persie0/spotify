package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ig20 {

    /* JADX INFO: renamed from: a */
    public final String f101865a;

    /* JADX INFO: renamed from: b */
    public final String f101866b;

    /* JADX INFO: renamed from: c */
    public final String f101867c;

    /* JADX INFO: renamed from: d */
    public final String f101868d;

    /* JADX INFO: renamed from: e */
    public final String f101869e;

    /* JADX INFO: renamed from: f */
    public final x00 f101870f;

    public ig20(String str, String str2, String str3, String str4, String str5, x00 x00Var) {
        this.f101865a = str;
        this.f101866b = str2;
        this.f101867c = str3;
        this.f101868d = str4;
        this.f101869e = str5;
        this.f101870f = x00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig20)) {
            return false;
        }
        ig20 ig20Var = (ig20) obj;
        return wj50.m88271j(this.f101865a, ig20Var.f101865a) && wj50.m88271j(this.f101866b, ig20Var.f101866b) && wj50.m88271j(this.f101867c, ig20Var.f101867c) && wj50.m88271j(this.f101868d, ig20Var.f101868d) && wj50.m88271j(this.f101869e, ig20Var.f101869e) && wj50.m88271j(this.f101870f, ig20Var.f101870f);
    }

    public final int hashCode() {
        return this.f101870f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f101865a.hashCode() * 31, 31, this.f101866b), 31, this.f101867c), 31, this.f101868d), 31, this.f101869e);
    }
}
