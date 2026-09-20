package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j351 {

    /* JADX INFO: renamed from: a */
    public final String f108289a;

    /* JADX INFO: renamed from: b */
    public final boolean f108290b;

    public j351(String str, boolean z) {
        this.f108289a = str;
        this.f108290b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j351)) {
            return false;
        }
        j351 j351Var = (j351) obj;
        return wj50.m88271j(this.f108289a, j351Var.f108289a) && this.f108290b == j351Var.f108290b;
    }

    public final int hashCode() {
        String str = this.f108289a;
        return Boolean.hashCode(this.f108290b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
