package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class fl31 {

    /* JADX INFO: renamed from: a */
    public final String f70678a;

    /* JADX INFO: renamed from: b */
    public final String f70679b;

    /* JADX INFO: renamed from: c */
    public final gl31 f70680c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f70681d;

    /* JADX INFO: renamed from: e */
    public final boolean f70682e;

    public fl31(String str, String str2, gl31 gl31Var, ArrayList arrayList, boolean z) {
        this.f70678a = str;
        this.f70679b = str2;
        this.f70680c = gl31Var;
        this.f70681d = arrayList;
        this.f70682e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl31)) {
            return false;
        }
        fl31 fl31Var = (fl31) obj;
        return wj50.m88271j(this.f70678a, fl31Var.f70678a) && wj50.m88271j(this.f70679b, fl31Var.f70679b) && this.f70680c.equals(fl31Var.f70680c) && this.f70681d.equals(fl31Var.f70681d) && this.f70682e == fl31Var.f70682e;
    }

    public final int hashCode() {
        String str = this.f70678a;
        return Boolean.hashCode(this.f70682e) + lq51.m59700f(this.f70681d, (this.f70680c.hashCode() + s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f70679b)) * 31, 31);
    }
}
