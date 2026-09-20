package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wgf {

    /* JADX INFO: renamed from: a */
    public final String f251053a;

    /* JADX INFO: renamed from: b */
    public final String f251054b;

    public wgf(String str, String str2) {
        this.f251053a = str;
        this.f251054b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgf)) {
            return false;
        }
        wgf wgfVar = (wgf) obj;
        return wj50.m88271j(this.f251053a, wgfVar.f251053a) && wj50.m88271j(this.f251054b, wgfVar.f251054b);
    }

    public final int hashCode() {
        return this.f251054b.hashCode() + (this.f251053a.hashCode() * 31);
    }
}
