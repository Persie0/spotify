package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class sei {

    /* JADX INFO: renamed from: a */
    public final boolean f208302a;

    /* JADX INFO: renamed from: b */
    public final boolean f208303b;

    /* JADX INFO: renamed from: c */
    public final boolean f208304c;

    /* JADX INFO: renamed from: d */
    public final String f208305d;

    /* JADX INFO: renamed from: e */
    public final List f208306e;

    /* JADX INFO: renamed from: f */
    public final List f208307f;

    public sei(boolean z, boolean z2, String str, List list, ro80 ro80Var, int i) {
        boolean z3 = (i & 2) == 0;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        str = (i & 32) != 0 ? null : str;
        int i2 = i & 64;
        lau lauVar = lau.f131415a;
        list = i2 != 0 ? lauVar : list;
        List list2 = (i & 128) != 0 ? lauVar : ro80Var;
        this.f208302a = z3;
        this.f208303b = z;
        this.f208304c = z2;
        this.f208305d = str;
        this.f208306e = list;
        this.f208307f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sei)) {
            return false;
        }
        sei seiVar = (sei) obj;
        return this.f208302a == seiVar.f208302a && this.f208303b == seiVar.f208303b && this.f208304c == seiVar.f208304c && wj50.m88271j(this.f208305d, seiVar.f208305d) && wj50.m88271j(this.f208306e, seiVar.f208306e) && wj50.m88271j(this.f208307f, seiVar.f208307f);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(true) * 31, 31, this.f208302a), 31, true), 31, this.f208303b), 31, this.f208304c);
        String str = this.f208305d;
        return this.f208307f.hashCode() + s571.m77244c((iM77245d + (str == null ? 0 : str.hashCode())) * 31, 31, this.f208306e);
    }
}
