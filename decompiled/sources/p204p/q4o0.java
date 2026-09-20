package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class q4o0 implements r4o0 {

    /* JADX INFO: renamed from: a */
    public final String f185322a;

    /* JADX INFO: renamed from: b */
    public final String f185323b;

    /* JADX INFO: renamed from: c */
    public final String f185324c;

    /* JADX INFO: renamed from: d */
    public final String f185325d;

    /* JADX INFO: renamed from: e */
    public final int f185326e;

    public q4o0(int i, String str, String str2, String str3, String str4) {
        this.f185322a = str;
        this.f185323b = str2;
        this.f185324c = str3;
        this.f185325d = str4;
        this.f185326e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4o0)) {
            return false;
        }
        q4o0 q4o0Var = (q4o0) obj;
        return wj50.m88271j(this.f185322a, q4o0Var.f185322a) && wj50.m88271j(this.f185323b, q4o0Var.f185323b) && wj50.m88271j(this.f185324c, q4o0Var.f185324c) && wj50.m88271j(this.f185325d, q4o0Var.f185325d) && this.f185326e == q4o0Var.f185326e;
    }

    public final int hashCode() {
        return edb.m38547C(this.f185326e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f185322a.hashCode() * 31, 31, this.f185323b), 31, this.f185324c), 31, this.f185325d);
    }
}
