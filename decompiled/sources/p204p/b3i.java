package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class b3i {

    /* JADX INFO: renamed from: a */
    public final rzd1 f23052a;

    /* JADX INFO: renamed from: b */
    public final int f23053b;

    /* JADX INFO: renamed from: c */
    public final List f23054c;

    /* JADX INFO: renamed from: d */
    public final boolean f23055d;

    /* JADX INFO: renamed from: e */
    public final String f23056e;

    public b3i(rzd1 rzd1Var, int i, List list, boolean z, String str) {
        this.f23052a = rzd1Var;
        this.f23053b = i;
        this.f23054c = list;
        this.f23055d = z;
        this.f23056e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3i)) {
            return false;
        }
        b3i b3iVar = (b3i) obj;
        return this.f23052a.equals(b3iVar.f23052a) && this.f23053b == b3iVar.f23053b && this.f23054c.equals(b3iVar.f23054c) && this.f23055d == b3iVar.f23055d && wj50.m88271j(this.f23056e, b3iVar.f23056e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77244c(mt60.m62800g(this.f23053b, this.f23052a.hashCode() * 31, 31), 31, this.f23054c), 31, this.f23055d);
        String str = this.f23056e;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
