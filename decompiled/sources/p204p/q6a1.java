package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q6a1 {

    /* JADX INFO: renamed from: a */
    public final String f185725a;

    /* JADX INFO: renamed from: b */
    public final String f185726b;

    /* JADX INFO: renamed from: c */
    public final int f185727c;

    /* JADX INFO: renamed from: d */
    public final Long f185728d;

    /* JADX INFO: renamed from: e */
    public final boolean f185729e;

    public q6a1(String str, String str2, int i, Long l, boolean z) {
        this.f185725a = str;
        this.f185726b = str2;
        this.f185727c = i;
        this.f185728d = l;
        this.f185729e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6a1)) {
            return false;
        }
        q6a1 q6a1Var = (q6a1) obj;
        return wj50.m88271j(this.f185725a, q6a1Var.f185725a) && this.f185726b.equals(q6a1Var.f185726b) && this.f185727c == q6a1Var.f185727c && this.f185728d.equals(q6a1Var.f185728d) && this.f185729e == q6a1Var.f185729e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185729e) + ((this.f185728d.hashCode() + f710.m40938f(this.f185727c, s571.m77243b(this.f185725a.hashCode() * 31, 31, this.f185726b), 31)) * 31);
    }
}
