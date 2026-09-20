package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class hwq0 {

    /* JADX INFO: renamed from: a */
    public final String f96004a;

    /* JADX INFO: renamed from: b */
    public final xvq0 f96005b;

    /* JADX INFO: renamed from: c */
    public final List f96006c;

    /* JADX INFO: renamed from: d */
    public final Object f96007d;

    /* JADX INFO: renamed from: e */
    public final Object f96008e;

    /* JADX INFO: renamed from: f */
    public final String f96009f;

    /* JADX INFO: renamed from: g */
    public final String f96010g;

    /* JADX INFO: renamed from: h */
    public final String f96011h;

    /* JADX INFO: renamed from: i */
    public final Object f96012i;

    /* JADX INFO: renamed from: j */
    public final Boolean f96013j;

    /* JADX INFO: renamed from: k */
    public final Boolean f96014k;

    /* JADX INFO: renamed from: l */
    public final boolean f96015l;

    /* JADX INFO: renamed from: m */
    public final lh90 f96016m;

    /* JADX INFO: renamed from: n */
    public final boolean f96017n;

    /* JADX INFO: renamed from: o */
    public final boolean f96018o;

    /* JADX INFO: renamed from: p */
    public final boolean f96019p;

    /* JADX INFO: renamed from: q */
    public final boolean f96020q;

    /* JADX INFO: renamed from: r */
    public final boolean f96021r;

    /* JADX INFO: renamed from: s */
    public final boolean f96022s;

    /* JADX INFO: renamed from: t */
    public final boolean f96023t;

    public hwq0(String str, xvq0 xvq0Var, List list, List list2, List list3, String str2, String str3, String str4, List list4, Boolean bool, Boolean bool2, boolean z, lh90 lh90Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f96004a = str;
        this.f96005b = xvq0Var;
        this.f96006c = list;
        this.f96007d = list2;
        this.f96008e = list3;
        this.f96009f = str2;
        this.f96010g = str3;
        this.f96011h = str4;
        this.f96012i = list4;
        this.f96013j = bool;
        this.f96014k = bool2;
        this.f96015l = z;
        this.f96016m = lh90Var;
        this.f96017n = z2;
        this.f96018o = z3;
        this.f96019p = z4;
        this.f96020q = z5;
        this.f96021r = z6;
        this.f96022s = z7;
        String str5 = xvq0Var.f266454d;
        boolean z8 = false;
        try {
            if (z050.m95042r6(str5).compareTo(z050.m95039o6()) < 0) {
                z8 = true;
            }
        } catch (Exception unused) {
        }
        this.f96023t = z8;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static hwq0 m48948a(hwq0 hwq0Var, xvq0 xvq0Var, ArrayList arrayList, Boolean bool, Boolean bool2, boolean z, int i) {
        String str = hwq0Var.f96004a;
        xvq0 xvq0Var2 = (i & 2) != 0 ? hwq0Var.f96005b : xvq0Var;
        List list = (i & 4) != 0 ? hwq0Var.f96006c : arrayList;
        ?? r5 = hwq0Var.f96007d;
        xvq0 xvq0Var3 = xvq0Var2;
        List list2 = list;
        ?? r6 = hwq0Var.f96008e;
        String str2 = hwq0Var.f96009f;
        String str3 = hwq0Var.f96010g;
        String str4 = hwq0Var.f96011h;
        ?? r9 = hwq0Var.f96012i;
        Boolean bool3 = (i & 512) != 0 ? hwq0Var.f96013j : bool;
        Boolean bool4 = (i & 1024) != 0 ? hwq0Var.f96014k : bool2;
        boolean z2 = hwq0Var.f96015l;
        Boolean bool5 = bool3;
        Boolean bool6 = bool4;
        lh90 lh90Var = hwq0Var.f96016m;
        boolean z3 = hwq0Var.f96017n;
        boolean z4 = (i & 16384) != 0 ? hwq0Var.f96018o : z;
        boolean z5 = hwq0Var.f96019p;
        boolean z6 = hwq0Var.f96020q;
        boolean z7 = hwq0Var.f96021r;
        boolean z8 = hwq0Var.f96022s;
        hwq0Var.getClass();
        return new hwq0(str, xvq0Var3, list2, r5, r6, str2, str3, str4, r9, bool5, bool6, z2, lh90Var, z3, z4, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwq0)) {
            return false;
        }
        hwq0 hwq0Var = (hwq0) obj;
        return wj50.m88271j(this.f96004a, hwq0Var.f96004a) && wj50.m88271j(this.f96005b, hwq0Var.f96005b) && wj50.m88271j(this.f96006c, hwq0Var.f96006c) && this.f96007d.equals(hwq0Var.f96007d) && this.f96008e.equals(hwq0Var.f96008e) && this.f96009f.equals(hwq0Var.f96009f) && wj50.m88271j(this.f96010g, hwq0Var.f96010g) && this.f96011h.equals(hwq0Var.f96011h) && this.f96012i.equals(hwq0Var.f96012i) && wj50.m88271j(this.f96013j, hwq0Var.f96013j) && wj50.m88271j(this.f96014k, hwq0Var.f96014k) && this.f96015l == hwq0Var.f96015l && wj50.m88271j(this.f96016m, hwq0Var.f96016m) && this.f96017n == hwq0Var.f96017n && this.f96018o == hwq0Var.f96018o && this.f96019p == hwq0Var.f96019p && this.f96020q == hwq0Var.f96020q && this.f96021r == hwq0Var.f96021r && this.f96022s == hwq0Var.f96022s;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(dq60.m36604d(dq60.m36604d(s571.m77244c((this.f96005b.hashCode() + (this.f96004a.hashCode() * 31)) * 31, 31, this.f96006c), 31, this.f96007d), 31, this.f96008e), 31, this.f96009f);
        String str = this.f96010g;
        int iM36604d = dq60.m36604d(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f96011h), 31, this.f96012i);
        Boolean bool = this.f96013j;
        int iHashCode = (iM36604d + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f96014k;
        int iM77245d = s571.m77245d((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f96015l);
        lh90 lh90Var = this.f96016m;
        return Boolean.hashCode(this.f96022s) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iM77245d + (lh90Var != null ? lh90Var.hashCode() : 0)) * 31, 31, this.f96017n), 31, this.f96018o), 31, this.f96019p), 31, this.f96020q), 31, this.f96021r);
    }
}
