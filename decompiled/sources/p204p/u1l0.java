package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u1l0 {

    /* JADX INFO: renamed from: a */
    public final String f225858a;

    /* JADX INFO: renamed from: b */
    public final int f225859b;

    public u1l0(String str, int i) {
        this.f225858a = str;
        this.f225859b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1l0)) {
            return false;
        }
        u1l0 u1l0Var = (u1l0) obj;
        return this.f225858a.equals(u1l0Var.f225858a) && this.f225859b == u1l0Var.f225859b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f225859b) + (this.f225858a.hashCode() * 31);
    }
}
