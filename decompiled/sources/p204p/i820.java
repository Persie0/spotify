package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class i820 extends k820 {

    /* JADX INFO: renamed from: a */
    public final boolean f99671a;

    /* JADX INFO: renamed from: b */
    public final String f99672b;

    /* JADX INFO: renamed from: c */
    public final List f99673c;

    /* JADX INFO: renamed from: d */
    public final uku f99674d;

    /* JADX INFO: renamed from: e */
    public final boolean f99675e;

    /* JADX INFO: renamed from: f */
    public final boolean f99676f;

    /* JADX INFO: renamed from: g */
    public final boolean f99677g;

    /* JADX INFO: renamed from: h */
    public final int f99678h;

    /* JADX INFO: renamed from: i */
    public final boolean f99679i;

    public i820(boolean z, String str, List list, uku ukuVar, boolean z2, boolean z3, boolean z4, int i, boolean z5) {
        this.f99671a = z;
        this.f99672b = str;
        this.f99673c = list;
        this.f99674d = ukuVar;
        this.f99675e = z2;
        this.f99676f = z3;
        this.f99677g = z4;
        this.f99678h = i;
        this.f99679i = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i820)) {
            return false;
        }
        i820 i820Var = (i820) obj;
        return this.f99671a == i820Var.f99671a && wj50.m88271j(this.f99672b, i820Var.f99672b) && wj50.m88271j(this.f99673c, i820Var.f99673c) && wj50.m88271j(this.f99674d, i820Var.f99674d) && this.f99675e == i820Var.f99675e && this.f99676f == i820Var.f99676f && this.f99677g == i820Var.f99677g && this.f99678h == i820Var.f99678h && this.f99679i == i820Var.f99679i;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f99671a) * 31;
        String str = this.f99672b;
        int iM77244c = s571.m77244c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f99673c);
        uku ukuVar = this.f99674d;
        return Boolean.hashCode(this.f99679i) + mt60.m62800g(this.f99678h, s571.m77245d(s571.m77245d(s571.m77245d((iM77244c + (ukuVar != null ? ukuVar.hashCode() : 0)) * 31, 31, this.f99675e), 31, this.f99676f), 31, this.f99677g), 31);
    }
}
