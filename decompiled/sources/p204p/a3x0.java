package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class a3x0 {

    /* JADX INFO: renamed from: a */
    public final String f12078a;

    /* JADX INFO: renamed from: b */
    public final String f12079b;

    public a3x0(String str, String str2) {
        this.f12078a = str;
        this.f12079b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3x0)) {
            return false;
        }
        a3x0 a3x0Var = (a3x0) obj;
        return wj50.m88271j(this.f12078a, a3x0Var.f12078a) && wj50.m88271j(this.f12079b, a3x0Var.f12079b);
    }

    public final int hashCode() {
        int iHashCode = this.f12078a.hashCode() * 31;
        String str = this.f12079b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
