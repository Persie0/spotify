package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p790 {

    /* JADX INFO: renamed from: a */
    public final i490 f174625a;

    public p790(i490 i490Var) {
        this.f174625a = i490Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p790) && wj50.m88271j(this.f174625a, ((p790) obj).f174625a);
    }

    public final int hashCode() {
        i490 i490Var = this.f174625a;
        if (i490Var == null) {
            return 0;
        }
        return i490Var.hashCode();
    }
}
