package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c3w0 {

    /* JADX INFO: renamed from: a */
    public final String f33769a;

    /* JADX INFO: renamed from: b */
    public final boolean f33770b;

    /* JADX INFO: renamed from: c */
    public final String f33771c;

    public c3w0(String str, String str2, boolean z) {
        this.f33769a = str;
        this.f33770b = z;
        this.f33771c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3w0)) {
            return false;
        }
        c3w0 c3w0Var = (c3w0) obj;
        return wj50.m88271j(this.f33769a, c3w0Var.f33769a) && this.f33770b == c3w0Var.f33770b && wj50.m88271j(this.f33771c, c3w0Var.f33771c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f33769a.hashCode() * 31, 31, this.f33770b);
        String str = this.f33771c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
