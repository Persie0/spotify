package p204p;

import java.util.ArrayList;

/* JADX INFO: renamed from: p.ck */
/* JADX INFO: loaded from: classes9.dex */
public final class C1744ck {

    /* JADX INFO: renamed from: a */
    public final int f38717a;

    /* JADX INFO: renamed from: b */
    public final String f38718b;

    /* JADX INFO: renamed from: c */
    public final boolean f38719c;

    /* JADX INFO: renamed from: d */
    public final boolean f38720d;

    /* JADX INFO: renamed from: e */
    public final long f38721e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f38722f;

    /* JADX INFO: renamed from: g */
    public final int f38723g;

    /* JADX INFO: renamed from: h */
    public final C2576xl f38724h;

    /* JADX INFO: renamed from: i */
    public final int f38725i;

    /* JADX INFO: renamed from: j */
    public final int f38726j;

    /* JADX INFO: renamed from: k */
    public final String f38727k;

    /* JADX INFO: renamed from: l */
    public final int f38728l;

    public C1744ck(int i, String str, boolean z, boolean z2, long j, ArrayList arrayList, int i2, C2576xl c2576xl, int i3, int i4, String str2, int i5) {
        this.f38717a = i;
        this.f38718b = str;
        this.f38719c = z;
        this.f38720d = z2;
        this.f38721e = j;
        this.f38722f = arrayList;
        this.f38723g = i2;
        this.f38724h = c2576xl;
        this.f38725i = i3;
        this.f38726j = i4;
        this.f38727k = str2;
        this.f38728l = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1744ck)) {
            return false;
        }
        C1744ck c1744ck = (C1744ck) obj;
        return this.f38717a == c1744ck.f38717a && this.f38718b.equals(c1744ck.f38718b) && this.f38719c == c1744ck.f38719c && this.f38720d == c1744ck.f38720d && this.f38721e == c1744ck.f38721e && this.f38722f.equals(c1744ck.f38722f) && this.f38723g == c1744ck.f38723g && this.f38724h.equals(c1744ck.f38724h) && this.f38725i == c1744ck.f38725i && this.f38726j == c1744ck.f38726j && wj50.m88271j(this.f38727k, c1744ck.f38727k) && this.f38728l == c1744ck.f38728l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38728l) + s571.m77243b(f710.m40938f(this.f38726j, mt60.m62800g(this.f38725i, (this.f38724h.hashCode() + mt60.m62800g(this.f38723g, lq51.m59700f(this.f38722f, dq60.m36605e(s571.m77245d(s571.m77245d(s571.m77243b(edb.m38547C(this.f38717a) * 31, 31, this.f38718b), 31, this.f38719c), 31, this.f38720d), this.f38721e, 31), 31), 31)) * 31, 31), 31), 31, this.f38727k);
    }
}
