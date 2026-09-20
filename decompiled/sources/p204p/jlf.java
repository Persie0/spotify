package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jlf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f113611a;

    /* JADX INFO: renamed from: b */
    public final enw0 f113612b;

    public jlf(String str, enw0 enw0Var) {
        this.f113611a = str;
        this.f113612b = enw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlf)) {
            return false;
        }
        jlf jlfVar = (jlf) obj;
        return wj50.m88271j(this.f113611a, jlfVar.f113611a) && wj50.m88271j(this.f113612b, jlfVar.f113612b);
    }

    public final int hashCode() {
        return this.f113612b.hashCode() + (this.f113611a.hashCode() * 31);
    }
}
