package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ivo0 extends kvo0 {

    /* JADX INFO: renamed from: a */
    public final String f106251a;

    /* JADX INFO: renamed from: b */
    public final String f106252b;

    /* JADX INFO: renamed from: c */
    public final String f106253c;

    /* JADX INFO: renamed from: d */
    public final String f106254d;

    /* JADX INFO: renamed from: e */
    public final boolean f106255e;

    /* JADX INFO: renamed from: f */
    public final boolean f106256f;

    public ivo0(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f106251a = str;
        this.f106252b = str2;
        this.f106253c = str3;
        this.f106254d = str4;
        this.f106255e = z;
        this.f106256f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivo0)) {
            return false;
        }
        ivo0 ivo0Var = (ivo0) obj;
        return wj50.m88271j(this.f106251a, ivo0Var.f106251a) && wj50.m88271j(this.f106252b, ivo0Var.f106252b) && wj50.m88271j(this.f106253c, ivo0Var.f106253c) && wj50.m88271j(this.f106254d, ivo0Var.f106254d) && this.f106255e == ivo0Var.f106255e && this.f106256f == ivo0Var.f106256f;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f106251a.hashCode() * 31, 31, this.f106252b);
        String str = this.f106253c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106254d;
        return Boolean.hashCode(this.f106256f) + s571.m77245d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f106255e);
    }
}
