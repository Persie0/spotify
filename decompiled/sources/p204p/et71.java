package p204p;

import java.util.List;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes8.dex */
public final class et71 {

    /* JADX INFO: renamed from: a */
    public final opc1 f62652a;

    /* JADX INFO: renamed from: b */
    public final uk91 f62653b;

    /* JADX INFO: renamed from: c */
    public final uk91 f62654c;

    /* JADX INFO: renamed from: d */
    public final koz0 f62655d;

    /* JADX INFO: renamed from: e */
    public final float f62656e;

    /* JADX INFO: renamed from: f */
    public final boolean f62657f;

    /* JADX INFO: renamed from: g */
    public final int f62658g;

    /* JADX INFO: renamed from: h */
    public final List f62659h;

    /* JADX INFO: renamed from: i */
    public final long f62660i;

    /* JADX INFO: renamed from: j */
    public final long f62661j;

    /* JADX INFO: renamed from: k */
    public final long f62662k;

    public et71(opc1 opc1Var, uk91 uk91Var, uk91 uk91Var2, koz0 koz0Var, float f, boolean z, int i, List list, long j, long j2, long j3) {
        this.f62652a = opc1Var;
        this.f62653b = uk91Var;
        this.f62654c = uk91Var2;
        this.f62655d = koz0Var;
        this.f62656e = f;
        this.f62657f = z;
        this.f62658g = i;
        this.f62659h = list;
        this.f62660i = j;
        this.f62661j = j2;
        this.f62662k = j3;
    }

    /* JADX INFO: renamed from: a */
    public static et71 m39931a(et71 et71Var, opc1 opc1Var, uk91 uk91Var, uk91 uk91Var2, koz0 koz0Var, float f, boolean z, int i, List list, long j, long j2, long j3, int i2) {
        opc1 opc1Var2 = (i2 & 1) != 0 ? et71Var.f62652a : opc1Var;
        uk91 uk91Var3 = (i2 & 2) != 0 ? et71Var.f62653b : uk91Var;
        uk91 uk91Var4 = (i2 & 4) != 0 ? et71Var.f62654c : uk91Var2;
        koz0 koz0Var2 = (i2 & 8) != 0 ? et71Var.f62655d : koz0Var;
        float f2 = (i2 & 16) != 0 ? et71Var.f62656e : f;
        boolean z2 = (i2 & 32) != 0 ? et71Var.f62657f : z;
        int i3 = (i2 & 64) != 0 ? et71Var.f62658g : i;
        List list2 = (i2 & 128) != 0 ? et71Var.f62659h : list;
        long j4 = (i2 & 256) != 0 ? et71Var.f62660i : j;
        long j5 = (i2 & 512) != 0 ? et71Var.f62661j : j2;
        long j6 = (i2 & 1024) != 0 ? et71Var.f62662k : j3;
        et71Var.getClass();
        return new et71(opc1Var2, uk91Var3, uk91Var4, koz0Var2, f2, z2, i3, list2, j4, j5, j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et71)) {
            return false;
        }
        et71 et71Var = (et71) obj;
        return wj50.m88271j(this.f62652a, et71Var.f62652a) && wj50.m88271j(this.f62653b, et71Var.f62653b) && wj50.m88271j(this.f62654c, et71Var.f62654c) && wj50.m88271j(this.f62655d, et71Var.f62655d) && Float.compare(this.f62656e, et71Var.f62656e) == 0 && this.f62657f == et71Var.f62657f && this.f62658g == et71Var.f62658g && wj50.m88271j(this.f62659h, et71Var.f62659h) && this.f62660i == et71Var.f62660i && this.f62661j == et71Var.f62661j && this.f62662k == et71Var.f62662k;
    }

    public final int hashCode() {
        return Long.hashCode(this.f62662k) + dq60.m36605e(dq60.m36605e(s571.m77244c(f710.m40938f(this.f62658g, s571.m77245d(AbstractC0000a.m8g((this.f62655d.hashCode() + ((this.f62654c.hashCode() + ((this.f62653b.hashCode() + (this.f62652a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f62656e), 31, this.f62657f), 31), 31, this.f62659h), this.f62660i, 31), this.f62661j, 31);
    }

    public et71() {
        uk91 uk91Var = new uk91(0L, 0L);
        this(opc1.f167865e, uk91Var, uk91Var, ioz0.f104315a, 0.0f, false, 4, lau.f131415a, 0L, Long.MAX_VALUE, uk91Var.f231266c);
    }
}
