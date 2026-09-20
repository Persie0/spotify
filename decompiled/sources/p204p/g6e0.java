package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g6e0 {

    /* JADX INFO: renamed from: a */
    public final String f77026a;

    /* JADX INFO: renamed from: b */
    public final String f77027b;

    public g6e0(String str, String str2) {
        this.f77026a = str;
        this.f77027b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6e0)) {
            return false;
        }
        g6e0 g6e0Var = (g6e0) obj;
        return wj50.m88271j(this.f77026a, g6e0Var.f77026a) && wj50.m88271j(this.f77027b, g6e0Var.f77027b);
    }

    public final int hashCode() {
        return this.f77027b.hashCode() + (this.f77026a.hashCode() * 31);
    }
}
