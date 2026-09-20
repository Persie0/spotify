package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o1l0 {

    /* JADX INFO: renamed from: a */
    public final String f160803a;

    /* JADX INFO: renamed from: b */
    public final String f160804b;

    /* JADX INFO: renamed from: c */
    public final String f160805c;

    /* JADX INFO: renamed from: d */
    public final List f160806d;

    /* JADX INFO: renamed from: e */
    public final String f160807e;

    /* JADX INFO: renamed from: f */
    public final String f160808f;

    /* JADX INFO: renamed from: g */
    public final int f160809g;

    /* JADX INFO: renamed from: h */
    public final boolean f160810h;

    /* JADX INFO: renamed from: i */
    public final m0r f160811i;

    /* JADX INFO: renamed from: j */
    public final Float f160812j;

    /* JADX INFO: renamed from: k */
    public final boolean f160813k;

    public o1l0(String str, String str2, String str3, List list, String str4, String str5, int i, boolean z, m0r m0rVar, Float f, boolean z2) {
        this.f160803a = str;
        this.f160804b = str2;
        this.f160805c = str3;
        this.f160806d = list;
        this.f160807e = str4;
        this.f160808f = str5;
        this.f160809g = i;
        this.f160810h = z;
        this.f160811i = m0rVar;
        this.f160812j = f;
        this.f160813k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1l0)) {
            return false;
        }
        o1l0 o1l0Var = (o1l0) obj;
        return wj50.m88271j(this.f160803a, o1l0Var.f160803a) && wj50.m88271j(this.f160804b, o1l0Var.f160804b) && wj50.m88271j(this.f160805c, o1l0Var.f160805c) && wj50.m88271j(this.f160806d, o1l0Var.f160806d) && wj50.m88271j(this.f160807e, o1l0Var.f160807e) && wj50.m88271j(this.f160808f, o1l0Var.f160808f) && this.f160809g == o1l0Var.f160809g && this.f160810h == o1l0Var.f160810h && this.f160811i == o1l0Var.f160811i && this.f160812j.equals(o1l0Var.f160812j) && this.f160813k == o1l0Var.f160813k;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(f710.m40938f(this.f160809g, s571.m77243b(s571.m77243b(s571.m77244c(s571.m77243b(s571.m77243b(this.f160803a.hashCode() * 31, 31, this.f160804b), 31, this.f160805c), 31, this.f160806d), 31, this.f160807e), 31, this.f160808f), 31), 31, this.f160810h);
        m0r m0rVar = this.f160811i;
        return Boolean.hashCode(this.f160813k) + ((this.f160812j.hashCode() + ((iM77245d + (m0rVar == null ? 0 : m0rVar.hashCode())) * 31)) * 31);
    }
}
