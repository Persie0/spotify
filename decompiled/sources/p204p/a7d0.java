package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a7d0 {

    /* JADX INFO: renamed from: a */
    public final String f13024a;

    /* JADX INFO: renamed from: b */
    public final String f13025b;

    public a7d0(String str, String str2) {
        this.f13024a = str;
        this.f13025b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7d0)) {
            return false;
        }
        a7d0 a7d0Var = (a7d0) obj;
        return wj50.m88271j(this.f13024a, a7d0Var.f13024a) && wj50.m88271j(this.f13025b, a7d0Var.f13025b);
    }

    public final int hashCode() {
        return this.f13025b.hashCode() + (this.f13024a.hashCode() * 31);
    }
}
