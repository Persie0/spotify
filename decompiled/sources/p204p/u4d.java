package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f226647a;

    /* JADX INFO: renamed from: b */
    public final String f226648b;

    /* JADX INFO: renamed from: c */
    public final pck f226649c;

    /* JADX INFO: renamed from: d */
    public final boolean f226650d;

    public u4d(String str, String str2, pck pckVar, boolean z) {
        this.f226647a = str;
        this.f226648b = str2;
        this.f226649c = pckVar;
        this.f226650d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4d)) {
            return false;
        }
        u4d u4dVar = (u4d) obj;
        return wj50.m88271j(this.f226647a, u4dVar.f226647a) && wj50.m88271j(this.f226648b, u4dVar.f226648b) && wj50.m88271j(this.f226649c, u4dVar.f226649c) && this.f226650d == u4dVar.f226650d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f226650d) + ((this.f226649c.hashCode() + s571.m77243b(this.f226647a.hashCode() * 31, 31, this.f226648b)) * 31);
    }
}
