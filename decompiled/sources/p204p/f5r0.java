package p204p;

import com.google.protobuf.Duration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f5r0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f66141a;

    /* JADX INFO: renamed from: b */
    public final String f66142b;

    /* JADX INFO: renamed from: c */
    public final String f66143c;

    /* JADX INFO: renamed from: d */
    public final String f66144d;

    /* JADX INFO: renamed from: e */
    public final String f66145e;

    /* JADX INFO: renamed from: f */
    public final String f66146f;

    /* JADX INFO: renamed from: g */
    public final String f66147g;

    /* JADX INFO: renamed from: h */
    public final Duration f66148h;

    /* JADX INFO: renamed from: i */
    public final long f66149i;

    /* JADX INFO: renamed from: j */
    public final String f66150j;

    /* JADX INFO: renamed from: k */
    public final String f66151k;

    /* JADX INFO: renamed from: l */
    public final int f66152l;

    /* JADX INFO: renamed from: m */
    public final pe70 f66153m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f66154n;

    /* JADX INFO: renamed from: o */
    public final qr50 f66155o;

    /* JADX INFO: renamed from: p */
    public final wmj f66156p;

    /* JADX INFO: renamed from: q */
    public final int f66157q;

    public f5r0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Duration duration, long j, String str8, String str9, int i, pe70 pe70Var, ArrayList arrayList, qr50 qr50Var, wmj wmjVar, int i2) {
        this.f66141a = str;
        this.f66142b = str2;
        this.f66143c = str3;
        this.f66144d = str4;
        this.f66145e = str5;
        this.f66146f = str6;
        this.f66147g = str7;
        this.f66148h = duration;
        this.f66149i = j;
        this.f66150j = str8;
        this.f66151k = str9;
        this.f66152l = i;
        this.f66153m = pe70Var;
        this.f66154n = arrayList;
        this.f66155o = qr50Var;
        this.f66156p = wmjVar;
        this.f66157q = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5r0)) {
            return false;
        }
        f5r0 f5r0Var = (f5r0) obj;
        return wj50.m88271j(this.f66141a, f5r0Var.f66141a) && wj50.m88271j(this.f66142b, f5r0Var.f66142b) && wj50.m88271j(this.f66143c, f5r0Var.f66143c) && wj50.m88271j(this.f66144d, f5r0Var.f66144d) && wj50.m88271j(this.f66145e, f5r0Var.f66145e) && wj50.m88271j(this.f66146f, f5r0Var.f66146f) && wj50.m88271j(this.f66147g, f5r0Var.f66147g) && wj50.m88271j(this.f66148h, f5r0Var.f66148h) && this.f66149i == f5r0Var.f66149i && wj50.m88271j(this.f66150j, f5r0Var.f66150j) && wj50.m88271j(this.f66151k, f5r0Var.f66151k) && this.f66152l == f5r0Var.f66152l && this.f66153m.equals(f5r0Var.f66153m) && this.f66154n.equals(f5r0Var.f66154n) && this.f66155o.equals(f5r0Var.f66155o) && this.f66156p.equals(f5r0Var.f66156p) && this.f66157q == f5r0Var.f66157q;
    }

    public final int hashCode() {
        return edb.m38547C(this.f66157q) + ((this.f66156p.hashCode() + ((this.f66155o.hashCode() + lq51.m59700f(this.f66154n, (this.f66153m.hashCode() + f710.m40938f(this.f66152l, s571.m77243b(s571.m77243b(dq60.m36605e((this.f66148h.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f66141a.hashCode() * 31, 31, this.f66142b), 31, this.f66143c), 31, this.f66144d), 31, this.f66145e), 31, this.f66146f), 31, this.f66147g)) * 31, this.f66149i, 31), 31, this.f66150j), 31, this.f66151k), 31)) * 31, 31)) * 31)) * 31);
    }
}
