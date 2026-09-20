package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c6t implements hwf {

    /* JADX INFO: renamed from: a */
    public final List f34614a;

    /* JADX INFO: renamed from: b */
    public final boolean f34615b;

    /* JADX INFO: renamed from: c */
    public final boolean f34616c;

    /* JADX INFO: renamed from: d */
    public final boolean f34617d;

    /* JADX INFO: renamed from: e */
    public final String f34618e;

    public c6t(int i, List list) {
        list = (i & 1) != 0 ? lau.f131415a : list;
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        boolean z3 = (i & 8) != 0;
        this.f34614a = list;
        this.f34615b = z;
        this.f34616c = z2;
        this.f34617d = z3;
        this.f34618e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6t)) {
            return false;
        }
        c6t c6tVar = (c6t) obj;
        return wj50.m88271j(this.f34614a, c6tVar.f34614a) && this.f34615b == c6tVar.f34615b && this.f34616c == c6tVar.f34616c && this.f34617d == c6tVar.f34617d && wj50.m88271j(this.f34618e, c6tVar.f34618e);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(this.f34614a.hashCode() * 31, 31, this.f34615b), 31, this.f34616c), 31, this.f34617d);
        String str = this.f34618e;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
