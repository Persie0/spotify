package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class wgo0 implements aho0 {

    /* JADX INFO: renamed from: a */
    public final String f251118a;

    /* JADX INFO: renamed from: b */
    public final String f251119b;

    public wgo0(String str, String str2) {
        this.f251118a = str;
        this.f251119b = str2;
    }

    @Override // p204p.aho0
    /* JADX INFO: renamed from: a */
    public final String mo25991a() {
        return this.f251119b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgo0)) {
            return false;
        }
        wgo0 wgo0Var = (wgo0) obj;
        return wj50.m88271j(this.f251118a, wgo0Var.f251118a) && wj50.m88271j(this.f251119b, wgo0Var.f251119b);
    }

    @Override // p204p.aho0
    public final String getContextUri() {
        return this.f251118a;
    }

    public final int hashCode() {
        return this.f251119b.hashCode() + (this.f251118a.hashCode() * 31);
    }
}
