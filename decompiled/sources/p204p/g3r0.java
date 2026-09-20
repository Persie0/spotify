package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g3r0 {

    /* JADX INFO: renamed from: a */
    public final String f76269a;

    /* JADX INFO: renamed from: b */
    public final String f76270b;

    /* JADX INFO: renamed from: c */
    public final boolean f76271c;

    public g3r0(String str, String str2, boolean z) {
        this.f76269a = str;
        this.f76270b = str2;
        this.f76271c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3r0)) {
            return false;
        }
        g3r0 g3r0Var = (g3r0) obj;
        return wj50.m88271j(this.f76269a, g3r0Var.f76269a) && wj50.m88271j(this.f76270b, g3r0Var.f76270b) && this.f76271c == g3r0Var.f76271c;
    }

    public final int hashCode() {
        int iHashCode = this.f76269a.hashCode() * 31;
        String str = this.f76270b;
        return Boolean.hashCode(this.f76271c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
