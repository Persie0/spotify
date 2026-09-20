package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bud {

    /* JADX INFO: renamed from: a */
    public final float f31084a;

    /* JADX INFO: renamed from: b */
    public final jsf1 f31085b;

    public bud(float f, jsf1 jsf1Var) {
        this.f31084a = f;
        this.f31085b = jsf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bud)) {
            return false;
        }
        bud budVar = (bud) obj;
        return Float.compare(this.f31084a, budVar.f31084a) == 0 && wj50.m88271j(this.f31085b, budVar.f31085b);
    }

    public final int hashCode() {
        return this.f31085b.hashCode() + (Float.hashCode(this.f31084a) * 31);
    }
}
