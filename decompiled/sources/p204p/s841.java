package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s841 {

    /* JADX INFO: renamed from: a */
    public final String f206545a;

    /* JADX INFO: renamed from: b */
    public final String f206546b;

    /* JADX INFO: renamed from: c */
    public final boolean f206547c;

    public s841(String str, String str2, boolean z) {
        this.f206545a = str;
        this.f206546b = str2;
        this.f206547c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s841)) {
            return false;
        }
        s841 s841Var = (s841) obj;
        return wj50.m88271j(this.f206545a, s841Var.f206545a) && wj50.m88271j(this.f206546b, s841Var.f206546b) && this.f206547c == s841Var.f206547c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f206547c) + s571.m77243b(this.f206545a.hashCode() * 31, 31, this.f206546b);
    }
}
