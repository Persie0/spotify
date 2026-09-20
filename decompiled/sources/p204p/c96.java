package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c96 {

    /* JADX INFO: renamed from: a */
    public final String f35408a;

    /* JADX INFO: renamed from: b */
    public final boolean f35409b;

    public c96(String str, boolean z) {
        this.f35408a = str;
        this.f35409b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c96)) {
            return false;
        }
        c96 c96Var = (c96) obj;
        return wj50.m88271j(this.f35408a, c96Var.f35408a) && this.f35409b == c96Var.f35409b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35409b) + (this.f35408a.hashCode() * 31);
    }
}
