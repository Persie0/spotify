package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class cmz0 {

    /* JADX INFO: renamed from: a */
    public final String f39837a;

    /* JADX INFO: renamed from: b */
    public final int f39838b;

    /* JADX INFO: renamed from: c */
    public final int f39839c;

    /* JADX INFO: renamed from: d */
    public final List f39840d;

    /* JADX INFO: renamed from: e */
    public final List f39841e;

    /* JADX INFO: renamed from: f */
    public final Set f39842f;

    /* JADX INFO: renamed from: g */
    public final int f39843g;

    /* JADX INFO: renamed from: h */
    public final int f39844h;

    /* JADX INFO: renamed from: i */
    public final int f39845i;

    public cmz0(String str, int i, int i2, List list, List list2, Set set, int i3, int i4, int i5) {
        this.f39837a = str;
        this.f39838b = i;
        this.f39839c = i2;
        this.f39840d = list;
        this.f39841e = list2;
        this.f39842f = set;
        this.f39843g = i3;
        this.f39844h = i4;
        this.f39845i = i5;
    }

    /* JADX INFO: renamed from: a */
    public static cmz0 m33415a(cmz0 cmz0Var, String str, int i, int i2, ArrayList arrayList, List list, Set set, int i3, int i4) {
        if ((i4 & 1) != 0) {
            str = cmz0Var.f39837a;
        }
        String str2 = str;
        if ((i4 & 2) != 0) {
            i = cmz0Var.f39838b;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = cmz0Var.f39839c;
        }
        int i6 = i2;
        List list2 = (i4 & 8) != 0 ? cmz0Var.f39840d : arrayList;
        List list3 = (i4 & 16) != 0 ? cmz0Var.f39841e : list;
        Set set2 = (i4 & 32) != 0 ? cmz0Var.f39842f : set;
        int i7 = (i4 & 64) != 0 ? cmz0Var.f39843g : i3;
        int i8 = (i4 & 128) != 0 ? cmz0Var.f39844h : 5;
        int i9 = (i4 & 256) != 0 ? cmz0Var.f39845i : 200;
        cmz0Var.getClass();
        return new cmz0(str2, i5, i6, list2, list3, set2, i7, i8, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmz0)) {
            return false;
        }
        cmz0 cmz0Var = (cmz0) obj;
        return wj50.m88271j(this.f39837a, cmz0Var.f39837a) && this.f39838b == cmz0Var.f39838b && this.f39839c == cmz0Var.f39839c && wj50.m88271j(this.f39840d, cmz0Var.f39840d) && wj50.m88271j(this.f39841e, cmz0Var.f39841e) && wj50.m88271j(this.f39842f, cmz0Var.f39842f) && this.f39843g == cmz0Var.f39843g && this.f39844h == cmz0Var.f39844h && this.f39845i == cmz0Var.f39845i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39845i) + mt60.m62800g(this.f39844h, mt60.m62800g(this.f39843g, klh.m56830b(s571.m77244c(s571.m77244c(mt60.m62800g(this.f39839c, mt60.m62800g(this.f39838b, this.f39837a.hashCode() * 31, 31), 31), 31, this.f39840d), 31, this.f39841e), 31, this.f39842f), 31), 31);
    }
}
