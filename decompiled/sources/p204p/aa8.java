package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aa8 {

    /* JADX INFO: renamed from: a */
    public final String f13782a;

    /* JADX INFO: renamed from: b */
    public final String f13783b;

    public aa8(String str, String str2) {
        this.f13782a = str;
        this.f13783b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa8)) {
            return false;
        }
        aa8 aa8Var = (aa8) obj;
        return wj50.m88271j(this.f13782a, aa8Var.f13782a) && wj50.m88271j(this.f13783b, aa8Var.f13783b);
    }

    public final int hashCode() {
        return this.f13783b.hashCode() + (this.f13782a.hashCode() * 31);
    }
}
