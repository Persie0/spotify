package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class s591 {

    /* JADX INFO: renamed from: a */
    public final j15 f205760a;

    /* JADX INFO: renamed from: b */
    public final g4l0 f205761b;

    public s591(j15 j15Var, g4l0 g4l0Var) {
        this.f205760a = j15Var;
        this.f205761b = g4l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s591)) {
            return false;
        }
        s591 s591Var = (s591) obj;
        return wj50.m88271j(this.f205760a, s591Var.f205760a) && wj50.m88271j(this.f205761b, s591Var.f205761b);
    }

    public final int hashCode() {
        return this.f205761b.hashCode() + (this.f205760a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f205760a) + ", offsetMapping=" + this.f205761b + ')';
    }
}
