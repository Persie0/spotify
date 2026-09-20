package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class owd implements rwd {

    /* JADX INFO: renamed from: a */
    public final pla1 f170695a;

    /* JADX INFO: renamed from: b */
    public final boolean f170696b;

    /* JADX INFO: renamed from: c */
    public final boolean f170697c;

    public owd(pla1 pla1Var, boolean z, boolean z2) {
        this.f170695a = pla1Var;
        this.f170696b = z;
        this.f170697c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owd)) {
            return false;
        }
        owd owdVar = (owd) obj;
        return wj50.m88271j(this.f170695a, owdVar.f170695a) && this.f170696b == owdVar.f170696b && this.f170697c == owdVar.f170697c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170697c) + s571.m77245d(this.f170695a.hashCode() * 31, 31, this.f170696b);
    }
}
