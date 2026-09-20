package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class v830 extends l930 {

    /* JADX INFO: renamed from: a */
    public final String f238364a;

    /* JADX INFO: renamed from: b */
    public final qi60 f238365b;

    /* JADX INFO: renamed from: c */
    public final String f238366c;

    /* JADX INFO: renamed from: d */
    public final vj60 f238367d;

    /* JADX INFO: renamed from: e */
    public final boolean f238368e;

    /* JADX INFO: renamed from: f */
    public final Set f238369f;

    public v830(String str, qi60 qi60Var, String str2, vj60 vj60Var, boolean z, Set set) {
        this.f238364a = str;
        this.f238365b = qi60Var;
        this.f238366c = str2;
        this.f238367d = vj60Var;
        this.f238368e = z;
        this.f238369f = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v830)) {
            return false;
        }
        v830 v830Var = (v830) obj;
        return wj50.m88271j(this.f238364a, v830Var.f238364a) && this.f238365b == v830Var.f238365b && wj50.m88271j(this.f238366c, v830Var.f238366c) && wj50.m88271j(this.f238367d, v830Var.f238367d) && this.f238368e == v830Var.f238368e && wj50.m88271j(this.f238369f, v830Var.f238369f);
    }

    public final int hashCode() {
        return this.f238369f.hashCode() + s571.m77245d((this.f238367d.hashCode() + s571.m77243b((this.f238365b.hashCode() + (this.f238364a.hashCode() * 31)) * 31, 31, this.f238366c)) * 31, 31, this.f238368e);
    }
}
