package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j370 implements k370 {

    /* JADX INFO: renamed from: a */
    public final t480 f108301a;

    public j370(t480 t480Var) {
        this.f108301a = t480Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j370) && wj50.m88271j(this.f108301a, ((j370) obj).f108301a);
    }

    public final int hashCode() {
        return this.f108301a.hashCode();
    }
}
