package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class duw implements o2x {

    /* JADX INFO: renamed from: a */
    public final bj00 f53312a;

    /* JADX INFO: renamed from: b */
    public final uj00 f53313b;

    /* JADX INFO: renamed from: c */
    public final boolean f53314c;

    public duw(bj00 bj00Var, uj00 uj00Var, boolean z) {
        this.f53312a = bj00Var;
        this.f53313b = uj00Var;
        this.f53314c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof duw)) {
            return false;
        }
        duw duwVar = (duw) obj;
        return wj50.m88271j(this.f53312a, duwVar.f53312a) && this.f53313b == duwVar.f53313b && this.f53314c == duwVar.f53314c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53314c) + ((this.f53313b.hashCode() + (this.f53312a.f27582a.hashCode() * 31)) * 31);
    }
}
