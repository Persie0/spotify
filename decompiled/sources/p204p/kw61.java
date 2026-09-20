package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kw61 implements mw61 {

    /* JADX INFO: renamed from: a */
    public final String f127015a;

    /* JADX INFO: renamed from: b */
    public final String f127016b;

    /* JADX INFO: renamed from: c */
    public final long f127017c;

    /* JADX INFO: renamed from: d */
    public final boolean f127018d;

    public kw61(String str, String str2, long j, boolean z) {
        this.f127015a = str;
        this.f127016b = str2;
        this.f127017c = j;
        this.f127018d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw61)) {
            return false;
        }
        kw61 kw61Var = (kw61) obj;
        return wj50.m88271j(this.f127015a, kw61Var.f127015a) && wj50.m88271j(this.f127016b, kw61Var.f127016b) && this.f127017c == kw61Var.f127017c && this.f127018d == kw61Var.f127018d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127018d) + dq60.m36605e(s571.m77243b(this.f127015a.hashCode() * 31, 31, this.f127016b), this.f127017c, 31);
    }
}
