package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class kgw0 {

    /* JADX INFO: renamed from: a */
    public final String f122476a;

    /* JADX INFO: renamed from: b */
    public final String f122477b;

    /* JADX INFO: renamed from: c */
    public final String f122478c;

    /* JADX INFO: renamed from: d */
    public final int f122479d;

    /* JADX INFO: renamed from: e */
    public final boolean f122480e;

    public kgw0(int i, String str, String str2, boolean z, String str3) {
        this.f122476a = str;
        this.f122477b = str2;
        this.f122478c = str3;
        this.f122479d = i;
        this.f122480e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgw0)) {
            return false;
        }
        kgw0 kgw0Var = (kgw0) obj;
        return wj50.m88271j(this.f122476a, kgw0Var.f122476a) && wj50.m88271j(this.f122477b, kgw0Var.f122477b) && wj50.m88271j(this.f122478c, kgw0Var.f122478c) && this.f122479d == kgw0Var.f122479d && this.f122480e == kgw0Var.f122480e;
    }

    public final int hashCode() {
        return k8j0.f120378c.hashCode() + s571.m77245d(f710.m40938f(this.f122479d, s571.m77243b(s571.m77243b(this.f122476a.hashCode() * 31, 31, this.f122477b), 31, this.f122478c), 31), 31, this.f122480e);
    }
}
