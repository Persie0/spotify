package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class szu0 implements e4z0 {

    /* JADX INFO: renamed from: a */
    public final rcm0 f215677a;

    public szu0(rcm0 rcm0Var) {
        this.f215677a = rcm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szu0) && this.f215677a.equals(((szu0) obj).f215677a);
    }

    @Override // p204p.e4z0
    public final String getId() {
        return "clear";
    }

    public final int hashCode() {
        return this.f215677a.hashCode() - 1357835437;
    }
}
