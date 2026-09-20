package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p330 {

    /* JADX INFO: renamed from: a */
    public final String f173548a;

    /* JADX INFO: renamed from: b */
    public final String f173549b;

    public p330(String str, String str2) {
        this.f173548a = str;
        this.f173549b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p330)) {
            return false;
        }
        p330 p330Var = (p330) obj;
        return wj50.m88271j(this.f173548a, p330Var.f173548a) && wj50.m88271j(this.f173549b, p330Var.f173549b);
    }

    public final int hashCode() {
        return this.f173549b.hashCode() + (this.f173548a.hashCode() * 31);
    }
}
