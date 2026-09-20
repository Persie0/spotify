package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class l820 {

    /* JADX INFO: renamed from: a */
    public final boolean f130779a;

    /* JADX INFO: renamed from: b */
    public final String f130780b;

    /* JADX INFO: renamed from: c */
    public final List f130781c;

    /* JADX INFO: renamed from: d */
    public final uku f130782d;

    /* JADX INFO: renamed from: e */
    public final int f130783e;

    /* JADX INFO: renamed from: f */
    public final boolean f130784f;

    /* JADX INFO: renamed from: g */
    public final boolean f130785g;

    /* JADX INFO: renamed from: h */
    public final boolean f130786h;

    /* JADX INFO: renamed from: i */
    public final int f130787i;

    /* JADX INFO: renamed from: j */
    public final boolean f130788j;

    public l820(boolean z, String str, List list, uku ukuVar, int i, boolean z2, boolean z3, boolean z4, int i2, boolean z5) {
        this.f130779a = z;
        this.f130780b = str;
        this.f130781c = list;
        this.f130782d = ukuVar;
        this.f130783e = i;
        this.f130784f = z2;
        this.f130785g = z3;
        this.f130786h = z4;
        this.f130787i = i2;
        this.f130788j = z5;
    }

    /* JADX INFO: renamed from: a */
    public static l820 m58453a(l820 l820Var, boolean z, String str, List list, uku ukuVar, int i, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3) {
        if ((i3 & 1) != 0) {
            z = l820Var.f130779a;
        }
        boolean z6 = z;
        if ((i3 & 2) != 0) {
            str = l820Var.f130780b;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            list = l820Var.f130781c;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            ukuVar = l820Var.f130782d;
        }
        uku ukuVar2 = ukuVar;
        int i4 = (i3 & 16) != 0 ? l820Var.f130783e : i;
        boolean z7 = (i3 & 32) != 0 ? l820Var.f130784f : z2;
        boolean z8 = (i3 & 64) != 0 ? l820Var.f130785g : z3;
        boolean z9 = (i3 & 128) != 0 ? l820Var.f130786h : z4;
        int i5 = (i3 & 256) != 0 ? l820Var.f130787i : i2;
        boolean z10 = (i3 & 512) != 0 ? l820Var.f130788j : z5;
        l820Var.getClass();
        return new l820(z6, str2, list2, ukuVar2, i4, z7, z8, z9, i5, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l820)) {
            return false;
        }
        l820 l820Var = (l820) obj;
        return this.f130779a == l820Var.f130779a && wj50.m88271j(this.f130780b, l820Var.f130780b) && wj50.m88271j(this.f130781c, l820Var.f130781c) && wj50.m88271j(this.f130782d, l820Var.f130782d) && this.f130783e == l820Var.f130783e && this.f130784f == l820Var.f130784f && this.f130785g == l820Var.f130785g && this.f130786h == l820Var.f130786h && this.f130787i == l820Var.f130787i && this.f130788j == l820Var.f130788j;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f130779a) * 31;
        String str = this.f130780b;
        int iM77244c = s571.m77244c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f130781c);
        uku ukuVar = this.f130782d;
        return Boolean.hashCode(this.f130788j) + mt60.m62800g(this.f130787i, s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f130783e, (iM77244c + (ukuVar != null ? ukuVar.hashCode() : 0)) * 31, 31), 31, this.f130784f), 31, this.f130785g), 31, this.f130786h), 31);
    }
}
