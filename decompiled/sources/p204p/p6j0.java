package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes8.dex */
public final class p6j0 {

    /* JADX INFO: renamed from: a */
    public final String f174410a;

    /* JADX INFO: renamed from: b */
    public final String f174411b;

    /* JADX INFO: renamed from: c */
    public final boolean f174412c;

    /* JADX INFO: renamed from: d */
    public final boolean f174413d;

    /* JADX INFO: renamed from: e */
    public final int f174414e;

    /* JADX INFO: renamed from: f */
    public final int f174415f;

    /* JADX INFO: renamed from: g */
    public final boolean f174416g;

    /* JADX INFO: renamed from: h */
    public final th50 f174417h;

    /* JADX INFO: renamed from: i */
    public final Bundle f174418i;

    /* JADX INFO: renamed from: j */
    public final o6j0 f174419j;

    public p6j0(String str, String str2, boolean z, boolean z2, int i, int i2, boolean z3, th50 th50Var, Bundle bundle, o6j0 o6j0Var) {
        this.f174410a = str;
        this.f174411b = str2;
        this.f174412c = z;
        this.f174413d = z2;
        this.f174414e = i;
        this.f174415f = i2;
        this.f174416g = z3;
        this.f174417h = th50Var;
        this.f174418i = bundle;
        this.f174419j = o6j0Var;
    }

    /* JADX INFO: renamed from: a */
    public final o6j0 m69205a() {
        return this.f174419j;
    }

    /* JADX INFO: renamed from: b */
    public final String m69206b() {
        return this.f174410a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6j0)) {
            return false;
        }
        p6j0 p6j0Var = (p6j0) obj;
        return wj50.m88271j(this.f174410a, p6j0Var.f174410a) && wj50.m88271j(this.f174411b, p6j0Var.f174411b) && this.f174412c == p6j0Var.f174412c && this.f174413d == p6j0Var.f174413d && this.f174414e == p6j0Var.f174414e && this.f174415f == p6j0Var.f174415f && this.f174416g == p6j0Var.f174416g && wj50.m88271j(this.f174417h, p6j0Var.f174417h) && wj50.m88271j(this.f174418i, p6j0Var.f174418i) && wj50.m88271j(this.f174419j, p6j0Var.f174419j);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(mt60.m62800g(this.f174415f, mt60.m62800g(this.f174414e, s571.m77245d(s571.m77245d(s571.m77243b(this.f174410a.hashCode() * 31, 961, this.f174411b), 31, this.f174412c), 31, this.f174413d), 31), 31), 961, this.f174416g);
        th50 th50Var = this.f174417h;
        int iHashCode = (iM77245d + (th50Var == null ? 0 : th50Var.f220333a.hashCode())) * 31;
        Bundle bundle = this.f174418i;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        o6j0 o6j0Var = this.f174419j;
        return iHashCode2 + (o6j0Var != null ? o6j0Var.hashCode() : 0);
    }
}
