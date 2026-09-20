package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class el5 {

    /* JADX INFO: renamed from: a */
    public final String f60586a;

    /* JADX INFO: renamed from: b */
    public final boolean f60587b;

    public el5(String str, boolean z) {
        this.f60586a = str;
        this.f60587b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el5)) {
            return false;
        }
        el5 el5Var = (el5) obj;
        return wj50.m88271j(this.f60586a, el5Var.f60586a) && this.f60587b == el5Var.f60587b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60587b) + (this.f60586a.hashCode() * 31);
    }
}
