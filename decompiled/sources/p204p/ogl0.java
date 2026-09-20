package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ogl0 {

    /* JADX INFO: renamed from: a */
    public final String f165183a;

    /* JADX INFO: renamed from: b */
    public final lgl0 f165184b;

    /* JADX INFO: renamed from: c */
    public final boolean f165185c;

    public ogl0(String str, lgl0 lgl0Var, boolean z) {
        this.f165183a = str;
        this.f165184b = lgl0Var;
        this.f165185c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogl0)) {
            return false;
        }
        ogl0 ogl0Var = (ogl0) obj;
        return wj50.m88271j(this.f165183a, ogl0Var.f165183a) && wj50.m88271j(this.f165184b, ogl0Var.f165184b) && this.f165185c == ogl0Var.f165185c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165185c) + ((this.f165184b.hashCode() + (this.f165183a.hashCode() * 31)) * 31);
    }
}
