package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i1s0 extends m1s0 {

    /* JADX INFO: renamed from: a */
    public final String f97582a;

    /* JADX INFO: renamed from: b */
    public final int f97583b;

    /* JADX INFO: renamed from: c */
    public final String f97584c;

    /* JADX INFO: renamed from: d */
    public final String f97585d;

    /* JADX INFO: renamed from: e */
    public final String f97586e;

    public i1s0(int i, String str, String str2, String str3, String str4) {
        this.f97582a = str;
        this.f97583b = i;
        this.f97584c = str2;
        this.f97585d = str3;
        this.f97586e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1s0)) {
            return false;
        }
        i1s0 i1s0Var = (i1s0) obj;
        return wj50.m88271j(this.f97582a, i1s0Var.f97582a) && this.f97583b == i1s0Var.f97583b && wj50.m88271j(this.f97584c, i1s0Var.f97584c) && wj50.m88271j(this.f97585d, i1s0Var.f97585d) && wj50.m88271j(this.f97586e, i1s0Var.f97586e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.f97583b, this.f97582a.hashCode() * 31, 31), 31, this.f97584c), 31, this.f97585d);
        String str = this.f97586e;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }
}
