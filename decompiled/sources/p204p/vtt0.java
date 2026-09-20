package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vtt0 {

    /* JADX INFO: renamed from: a */
    public final ptt0 f244775a;

    public vtt0(ptt0 ptt0Var) {
        this.f244775a = ptt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtt0) && wj50.m88271j(this.f244775a, ((vtt0) obj).f244775a);
    }

    public final int hashCode() {
        ptt0 ptt0Var = this.f244775a;
        if (ptt0Var == null) {
            return 0;
        }
        return ptt0Var.hashCode();
    }
}
