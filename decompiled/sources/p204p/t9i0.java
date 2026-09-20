package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class t9i0 {

    /* JADX INFO: renamed from: a */
    public final String f218304a;

    /* JADX INFO: renamed from: b */
    public final int f218305b;

    /* JADX INFO: renamed from: c */
    public final int f218306c;

    /* JADX INFO: renamed from: d */
    public final int f218307d;

    /* JADX INFO: renamed from: e */
    public final long f218308e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f218309f;

    /* JADX INFO: renamed from: g */
    public final int f218310g;

    /* JADX INFO: renamed from: h */
    public final String f218311h;

    /* JADX INFO: renamed from: i */
    public final String f218312i;

    /* JADX INFO: renamed from: j */
    public final x0c0 f218313j;

    /* JADX INFO: renamed from: k */
    public final boolean f218314k;

    /* JADX INFO: renamed from: l */
    public final String f218315l;

    /* JADX INFO: renamed from: m */
    public final String f218316m;

    /* JADX INFO: renamed from: n */
    public final String f218317n;

    /* JADX INFO: renamed from: o */
    public final String f218318o;

    public t9i0(String str, int i, int i2, int i3, long j, ArrayList arrayList, int i4, String str2, String str3, x0c0 x0c0Var, boolean z, String str4, String str5, String str6, String str7) {
        this.f218304a = str;
        this.f218305b = i;
        this.f218306c = i2;
        this.f218307d = i3;
        this.f218308e = j;
        this.f218309f = arrayList;
        this.f218310g = i4;
        this.f218311h = str2;
        this.f218312i = str3;
        this.f218313j = x0c0Var;
        this.f218314k = z;
        this.f218315l = str4;
        this.f218316m = str5;
        this.f218317n = str6;
        this.f218318o = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9i0)) {
            return false;
        }
        t9i0 t9i0Var = (t9i0) obj;
        return this.f218304a.equals(t9i0Var.f218304a) && this.f218305b == t9i0Var.f218305b && this.f218306c == t9i0Var.f218306c && this.f218307d == t9i0Var.f218307d && this.f218308e == t9i0Var.f218308e && this.f218309f.equals(t9i0Var.f218309f) && this.f218310g == t9i0Var.f218310g && this.f218311h.equals(t9i0Var.f218311h) && this.f218312i.equals(t9i0Var.f218312i) && this.f218313j.equals(t9i0Var.f218313j) && this.f218314k == t9i0Var.f218314k && this.f218315l.equals(t9i0Var.f218315l) && this.f218316m.equals(t9i0Var.f218316m) && this.f218317n.equals(t9i0Var.f218317n) && this.f218318o.equals(t9i0Var.f218318o);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d((this.f218313j.hashCode() + s571.m77243b(s571.m77243b(mt60.m62800g(this.f218310g, lq51.m59700f(this.f218309f, dq60.m36605e(f710.m40938f(this.f218307d, mt60.m62800g(this.f218306c, mt60.m62800g(this.f218305b, this.f218304a.hashCode() * 31, 31), 31), 31), this.f218308e, 31), 31), 31), 31, this.f218311h), 31, this.f218312i)) * 31, 31, this.f218314k), 31, this.f218315l), 31, this.f218316m), 31, this.f218317n), 31, this.f218318o);
    }
}
