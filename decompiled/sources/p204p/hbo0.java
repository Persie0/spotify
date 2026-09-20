package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hbo0 implements nbo0 {

    /* JADX INFO: renamed from: a */
    public final tbo0 f89566a;

    public hbo0(tbo0 tbo0Var) {
        this.f89566a = tbo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbo0) && wj50.m88271j(this.f89566a, ((hbo0) obj).f89566a);
    }

    public final int hashCode() {
        return this.f89566a.hashCode();
    }
}
