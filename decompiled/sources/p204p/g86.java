package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g86 {

    /* JADX INFO: renamed from: a */
    public final String f77414a;

    /* JADX INFO: renamed from: b */
    public final String f77415b;

    /* JADX INFO: renamed from: c */
    public final boolean f77416c;

    public g86(String str, String str2, boolean z) {
        this.f77414a = str;
        this.f77415b = str2;
        this.f77416c = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m43948a() {
        return this.f77415b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m43949b() {
        return this.f77416c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g86)) {
            return false;
        }
        g86 g86Var = (g86) obj;
        return wj50.m88271j(this.f77414a, g86Var.f77414a) && wj50.m88271j(this.f77415b, g86Var.f77415b) && this.f77416c == g86Var.f77416c;
    }

    public final int hashCode() {
        int iHashCode = this.f77414a.hashCode() * 31;
        String str = this.f77415b;
        return Boolean.hashCode(this.f77416c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
