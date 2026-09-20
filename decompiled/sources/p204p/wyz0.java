package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class wyz0 {

    /* JADX INFO: renamed from: a */
    public final String f256414a;

    /* JADX INFO: renamed from: b */
    public final String f256415b;

    /* JADX INFO: renamed from: c */
    public final syz0 f256416c;

    /* JADX INFO: renamed from: d */
    public final String f256417d;

    /* JADX INFO: renamed from: e */
    public final String f256418e;

    /* JADX INFO: renamed from: f */
    public final int f256419f;

    /* JADX INFO: renamed from: g */
    public final Set f256420g;

    /* JADX INFO: renamed from: h */
    public final String f256421h;

    /* JADX INFO: renamed from: i */
    public final wwu f256422i;

    public wyz0(String str, String str2, syz0 syz0Var, String str3, String str4, int i, Set set, String str5, wwu wwuVar) {
        this.f256414a = str;
        this.f256415b = str2;
        this.f256416c = syz0Var;
        this.f256417d = str3;
        this.f256418e = str4;
        this.f256419f = i;
        this.f256420g = set;
        this.f256421h = str5;
        this.f256422i = wwuVar;
    }

    /* JADX INFO: renamed from: a */
    public static wyz0 m89389a(wyz0 wyz0Var, Set set, String str, int i) {
        String str2 = wyz0Var.f256414a;
        String str3 = wyz0Var.f256415b;
        syz0 syz0Var = (i & 4) != 0 ? wyz0Var.f256416c : syz0.f215349a;
        String str4 = wyz0Var.f256417d;
        String str5 = wyz0Var.f256418e;
        int i2 = wyz0Var.f256419f;
        if ((i & 64) != 0) {
            set = wyz0Var.f256420g;
        }
        Set set2 = set;
        if ((i & 128) != 0) {
            str = wyz0Var.f256421h;
        }
        wwu wwuVar = wyz0Var.f256422i;
        wyz0Var.getClass();
        return new wyz0(str2, str3, syz0Var, str4, str5, i2, set2, str, wwuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyz0)) {
            return false;
        }
        wyz0 wyz0Var = (wyz0) obj;
        return wj50.m88271j(this.f256414a, wyz0Var.f256414a) && this.f256415b.equals(wyz0Var.f256415b) && this.f256416c == wyz0Var.f256416c && this.f256417d.equals(wyz0Var.f256417d) && wj50.m88271j(this.f256418e, wyz0Var.f256418e) && this.f256419f == wyz0Var.f256419f && wj50.m88271j(this.f256420g, wyz0Var.f256420g) && wj50.m88271j(this.f256421h, wyz0Var.f256421h) && wj50.m88271j(this.f256422i, wyz0Var.f256422i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(klh.m56830b(f710.m40938f(this.f256419f, s571.m77243b(s571.m77243b((this.f256416c.hashCode() + s571.m77243b(this.f256414a.hashCode() * 31, 31, this.f256415b)) * 31, 31, this.f256417d), 31, this.f256418e), 31), 31, this.f256420g), 31, this.f256421h);
        wwu wwuVar = this.f256422i;
        return iM77243b + (wwuVar == null ? 0 : wwuVar.hashCode());
    }
}
