package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ooi0 {

    /* JADX INFO: renamed from: a */
    public final Integer f167631a;

    /* JADX INFO: renamed from: b */
    public final boolean f167632b;

    /* JADX INFO: renamed from: c */
    public final boolean f167633c;

    /* JADX INFO: renamed from: d */
    public final boolean f167634d;

    /* JADX INFO: renamed from: e */
    public final boolean f167635e;

    /* JADX INFO: renamed from: f */
    public final boolean f167636f;

    /* JADX INFO: renamed from: g */
    public final List f167637g;

    /* JADX INFO: renamed from: h */
    public final int f167638h;

    /* JADX INFO: renamed from: i */
    public final int f167639i;

    /* JADX INFO: renamed from: j */
    public final int f167640j;

    /* JADX INFO: renamed from: k */
    public final int f167641k;

    /* JADX INFO: renamed from: l */
    public final boolean f167642l;

    /* JADX INFO: renamed from: m */
    public final Set f167643m;

    public ooi0(Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, int i, int i2, int i3, int i4, boolean z6, Set set) {
        this.f167631a = num;
        this.f167632b = z;
        this.f167633c = z2;
        this.f167634d = z3;
        this.f167635e = z4;
        this.f167636f = z5;
        this.f167637g = list;
        this.f167638h = i;
        this.f167639i = i2;
        this.f167640j = i3;
        this.f167641k = i4;
        this.f167642l = z6;
        this.f167643m = set;
    }

    /* JADX INFO: renamed from: a */
    public static ooi0 m67506a(ooi0 ooi0Var, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList, int i, int i2, int i3, int i4, boolean z6, Set set, int i5) {
        ooi0Var.getClass();
        if ((i5 & 2) != 0) {
            num = ooi0Var.f167631a;
        }
        Integer num2 = num;
        boolean z7 = (i5 & 4) != 0 ? ooi0Var.f167632b : z;
        boolean z8 = (i5 & 8) != 0 ? ooi0Var.f167633c : z2;
        boolean z9 = (i5 & 16) != 0 ? ooi0Var.f167634d : z3;
        boolean z10 = (i5 & 32) != 0 ? ooi0Var.f167635e : z4;
        boolean z11 = (i5 & 64) != 0 ? ooi0Var.f167636f : z5;
        List list = (i5 & 128) != 0 ? ooi0Var.f167637g : arrayList;
        int i6 = (i5 & 256) != 0 ? ooi0Var.f167638h : i;
        int i7 = (i5 & 512) != 0 ? ooi0Var.f167639i : i2;
        int i8 = (i5 & 1024) != 0 ? ooi0Var.f167640j : i3;
        int i9 = (i5 & 2048) != 0 ? ooi0Var.f167641k : i4;
        boolean z12 = (i5 & 4096) != 0 ? ooi0Var.f167642l : z6;
        Set set2 = (i5 & 8192) != 0 ? ooi0Var.f167643m : set;
        ooi0Var.getClass();
        return new ooi0(num2, z7, z8, z9, z10, z11, list, i6, i7, i8, i9, z12, set2);
    }

    /* JADX INFO: renamed from: b */
    public static Integer m67507b(Integer num) {
        int iIntValue;
        if (num == null || 1 > (iIntValue = num.intValue()) || iIntValue >= 3601) {
            return null;
        }
        return num;
    }

    /* JADX INFO: renamed from: c */
    public boolean m67508c() {
        return this.f167638h > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooi0)) {
            return false;
        }
        ooi0 ooi0Var = (ooi0) obj;
        return wj50.m88271j(this.f167631a, ooi0Var.f167631a) && this.f167632b == ooi0Var.f167632b && this.f167633c == ooi0Var.f167633c && this.f167634d == ooi0Var.f167634d && this.f167635e == ooi0Var.f167635e && this.f167636f == ooi0Var.f167636f && wj50.m88271j(this.f167637g, ooi0Var.f167637g) && this.f167638h == ooi0Var.f167638h && this.f167639i == ooi0Var.f167639i && this.f167640j == ooi0Var.f167640j && this.f167641k == ooi0Var.f167641k && this.f167642l == ooi0Var.f167642l && wj50.m88271j(this.f167643m, ooi0Var.f167643m);
    }

    public final int hashCode() {
        Integer num = this.f167631a;
        return this.f167643m.hashCode() + s571.m77245d(mt60.m62800g(this.f167641k, mt60.m62800g(this.f167640j, mt60.m62800g(this.f167639i, mt60.m62800g(this.f167638h, s571.m77244c(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((num == null ? 0 : num.hashCode()) * 31, 31, this.f167632b), 31, this.f167633c), 31, this.f167634d), 31, this.f167635e), 31, this.f167636f), 31, this.f167637g), 31), 31), 31), 31), 31, this.f167642l);
    }
}
