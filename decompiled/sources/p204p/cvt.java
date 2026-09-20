package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class cvt {

    /* JADX INFO: renamed from: a */
    public final up60 f42538a;

    /* JADX INFO: renamed from: b */
    public final Object f42539b;

    public cvt(up60 up60Var, Object obj) {
        this.f42538a = up60Var;
        this.f42539b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m34068a(up60 up60Var) {
        Object obj;
        if (!wj50.m88271j(this.f42538a, up60Var) || (obj = this.f42539b) == null) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvt)) {
            return false;
        }
        cvt cvtVar = (cvt) obj;
        return wj50.m88271j(this.f42538a, cvtVar.f42538a) && wj50.m88271j(this.f42539b, cvtVar.f42539b);
    }

    public final int hashCode() {
        return this.f42539b.hashCode() + (this.f42538a.hashCode() * 31);
    }

    public final String toString() {
        return "ElementInteractionResult(key=" + this.f42538a.mo29111F() + ", value=" + this.f42539b + ")";
    }
}
