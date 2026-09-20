package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class bai0 {

    /* JADX INFO: renamed from: a */
    public final String f25205a;

    /* JADX INFO: renamed from: b */
    public final int f25206b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f25207c;

    /* JADX INFO: renamed from: d */
    public final int f25208d;

    /* JADX INFO: renamed from: e */
    public final String f25209e;

    /* JADX INFO: renamed from: f */
    public final String f25210f;

    /* JADX INFO: renamed from: g */
    public final x0c0 f25211g;

    /* JADX INFO: renamed from: h */
    public final boolean f25212h;

    /* JADX INFO: renamed from: i */
    public final String f25213i;

    /* JADX INFO: renamed from: j */
    public final String f25214j;

    /* JADX INFO: renamed from: k */
    public final String f25215k;

    /* JADX INFO: renamed from: l */
    public final String f25216l;

    /* JADX INFO: renamed from: m */
    public final String f25217m;

    public bai0(String str, int i, ArrayList arrayList, int i2, String str2, String str3, x0c0 x0c0Var, boolean z, String str4, String str5, String str6, String str7, String str8) {
        this.f25205a = str;
        this.f25206b = i;
        this.f25207c = arrayList;
        this.f25208d = i2;
        this.f25209e = str2;
        this.f25210f = str3;
        this.f25211g = x0c0Var;
        this.f25212h = z;
        this.f25213i = str4;
        this.f25214j = str5;
        this.f25215k = str6;
        this.f25216l = str7;
        this.f25217m = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bai0)) {
            return false;
        }
        bai0 bai0Var = (bai0) obj;
        return this.f25205a.equals(bai0Var.f25205a) && this.f25206b == bai0Var.f25206b && this.f25207c.equals(bai0Var.f25207c) && this.f25208d == bai0Var.f25208d && this.f25209e.equals(bai0Var.f25209e) && this.f25210f.equals(bai0Var.f25210f) && this.f25211g.equals(bai0Var.f25211g) && this.f25212h == bai0Var.f25212h && this.f25213i.equals(bai0Var.f25213i) && this.f25214j.equals(bai0Var.f25214j) && this.f25215k.equals(bai0Var.f25215k) && this.f25216l.equals(bai0Var.f25216l) && this.f25217m.equals(bai0Var.f25217m);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77245d((this.f25211g.hashCode() + s571.m77243b(s571.m77243b(mt60.m62800g(this.f25208d, lq51.m59700f(this.f25207c, dq60.m36605e(dq60.m36605e(mt60.m62800g(this.f25206b, this.f25205a.hashCode() * 31, 31), 0L, 961), 0L, 31), 31), 31), 31, this.f25209e), 31, this.f25210f)) * 31, 31, this.f25212h), 31, this.f25213i), 31, this.f25214j), 31, this.f25215k), 31, this.f25216l), 31, this.f25217m);
    }
}
