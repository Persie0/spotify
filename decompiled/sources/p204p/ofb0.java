package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ofb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final String f164696a;

    /* JADX INFO: renamed from: b */
    public final s7f f164697b;

    /* JADX INFO: renamed from: c */
    public final String f164698c;

    public ofb0(String str, s7f s7fVar, String str2) {
        this.f164696a = str;
        this.f164697b = s7fVar;
        this.f164698c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofb0)) {
            return false;
        }
        ofb0 ofb0Var = (ofb0) obj;
        return wj50.m88271j(this.f164696a, ofb0Var.f164696a) && wj50.m88271j(this.f164697b, ofb0Var.f164697b) && wj50.m88271j(this.f164698c, ofb0Var.f164698c);
    }

    public final int hashCode() {
        return this.f164698c.hashCode() + ((this.f164697b.hashCode() + (this.f164696a.hashCode() * 31)) * 31);
    }
}
