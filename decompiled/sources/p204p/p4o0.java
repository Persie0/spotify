package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class p4o0 implements r4o0 {

    /* JADX INFO: renamed from: a */
    public final String f173990a;

    /* JADX INFO: renamed from: b */
    public final String f173991b;

    /* JADX INFO: renamed from: c */
    public final String f173992c;

    /* JADX INFO: renamed from: d */
    public final String f173993d;

    public p4o0(String str, String str2, String str3, String str4) {
        this.f173990a = str;
        this.f173991b = str2;
        this.f173992c = str3;
        this.f173993d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4o0)) {
            return false;
        }
        p4o0 p4o0Var = (p4o0) obj;
        return wj50.m88271j(this.f173990a, p4o0Var.f173990a) && wj50.m88271j(this.f173991b, p4o0Var.f173991b) && wj50.m88271j(this.f173992c, p4o0Var.f173992c) && wj50.m88271j(this.f173993d, p4o0Var.f173993d);
    }

    public final int hashCode() {
        return this.f173993d.hashCode() + s571.m77243b(s571.m77243b(this.f173990a.hashCode() * 31, 31, this.f173991b), 31, this.f173992c);
    }
}
