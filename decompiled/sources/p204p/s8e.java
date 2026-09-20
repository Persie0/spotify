package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s8e implements c9e {

    /* JADX INFO: renamed from: a */
    public final x6x0 f206631a;

    /* JADX INFO: renamed from: b */
    public final x6x0 f206632b;

    public s8e(x6x0 x6x0Var, x6x0 x6x0Var2) {
        this.f206631a = x6x0Var;
        this.f206632b = x6x0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8e)) {
            return false;
        }
        s8e s8eVar = (s8e) obj;
        return wj50.m88271j(this.f206631a, s8eVar.f206631a) && wj50.m88271j(this.f206632b, s8eVar.f206632b);
    }

    public final int hashCode() {
        return this.f206632b.hashCode() + (this.f206631a.hashCode() * 31);
    }
}
