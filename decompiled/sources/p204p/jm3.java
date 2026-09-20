package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jm3 {

    /* JADX INFO: renamed from: a */
    public final String f113741a;

    /* JADX INFO: renamed from: b */
    public final String f113742b;

    /* JADX INFO: renamed from: c */
    public final String f113743c;

    /* JADX INFO: renamed from: d */
    public final String f113744d;

    /* JADX INFO: renamed from: e */
    public final boolean f113745e;

    /* JADX INFO: renamed from: f */
    public final String f113746f;

    public jm3(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f113741a = str;
        this.f113742b = str2;
        this.f113743c = str3;
        this.f113744d = str4;
        this.f113745e = z;
        this.f113746f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm3)) {
            return false;
        }
        jm3 jm3Var = (jm3) obj;
        return wj50.m88271j(this.f113741a, jm3Var.f113741a) && wj50.m88271j(this.f113742b, jm3Var.f113742b) && wj50.m88271j(this.f113743c, jm3Var.f113743c) && wj50.m88271j(this.f113744d, jm3Var.f113744d) && this.f113745e == jm3Var.f113745e && wj50.m88271j(this.f113746f, jm3Var.f113746f);
    }

    public final int hashCode() {
        return this.f113746f.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(s571.m77243b(this.f113741a.hashCode() * 31, 31, this.f113742b), 31, this.f113743c), 31, this.f113744d), 31, this.f113745e);
    }
}
