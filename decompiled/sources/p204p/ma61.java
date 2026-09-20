package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ma61 {

    /* JADX INFO: renamed from: a */
    public final String f141482a;

    /* JADX INFO: renamed from: b */
    public final String f141483b;

    /* JADX INFO: renamed from: c */
    public final String f141484c;

    /* JADX INFO: renamed from: d */
    public final int f141485d;

    /* JADX INFO: renamed from: e */
    public final List f141486e;

    /* JADX INFO: renamed from: f */
    public final boolean f141487f;

    public ma61(int i, String str, String str2, String str3, List list, boolean z) {
        this.f141482a = str;
        this.f141483b = str2;
        this.f141484c = str3;
        this.f141485d = i;
        this.f141486e = list;
        this.f141487f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma61)) {
            return false;
        }
        ma61 ma61Var = (ma61) obj;
        return wj50.m88271j(this.f141482a, ma61Var.f141482a) && wj50.m88271j(this.f141483b, ma61Var.f141483b) && wj50.m88271j(this.f141484c, ma61Var.f141484c) && this.f141485d == ma61Var.f141485d && wj50.m88271j(this.f141486e, ma61Var.f141486e) && this.f141487f == ma61Var.f141487f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141487f) + s571.m77244c(f710.m40938f(this.f141485d, s571.m77243b(s571.m77243b(this.f141482a.hashCode() * 31, 31, this.f141483b), 31, this.f141484c), 31), 31, this.f141486e);
    }
}
