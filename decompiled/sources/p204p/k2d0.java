package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k2d0 {

    /* JADX INFO: renamed from: a */
    public final ie7 f118601a;

    public k2d0(ie7 ie7Var) {
        this.f118601a = ie7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2d0) && wj50.m88271j(this.f118601a, ((k2d0) obj).f118601a);
    }

    public final int hashCode() {
        ie7 ie7Var = this.f118601a;
        if (ie7Var == null) {
            return 0;
        }
        return ie7Var.f101336a.hashCode();
    }
}
