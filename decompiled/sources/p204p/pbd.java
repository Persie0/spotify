package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pbd {

    /* JADX INFO: renamed from: a */
    public final boolean f175777a;

    /* JADX INFO: renamed from: b */
    public final uvb f175778b;

    /* JADX INFO: renamed from: c */
    public final zx9 f175779c;

    public pbd(boolean z, uvb uvbVar, zx9 zx9Var) {
        this.f175777a = z;
        this.f175778b = uvbVar;
        this.f175779c = zx9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbd)) {
            return false;
        }
        pbd pbdVar = (pbd) obj;
        return this.f175777a == pbdVar.f175777a && this.f175778b.equals(pbdVar.f175778b) && this.f175779c.equals(pbdVar.f175779c);
    }

    public final int hashCode() {
        return this.f175779c.hashCode() + ((this.f175778b.hashCode() + (Boolean.hashCode(this.f175777a) * 31)) * 31);
    }
}
