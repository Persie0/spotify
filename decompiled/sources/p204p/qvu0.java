package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qvu0 implements ri21 {

    /* JADX INFO: renamed from: a */
    public final ci21 f193103a;

    public qvu0(ci21 ci21Var) {
        this.f193103a = ci21Var;
    }

    @Override // p204p.ri21
    /* JADX INFO: renamed from: b */
    public final Object mo40114b(fbk fbkVar) {
        return this.f193103a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvu0) && wj50.m88271j(this.f193103a, ((qvu0) obj).f193103a);
    }

    public final int hashCode() {
        return this.f193103a.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.f193103a + ')';
    }
}
