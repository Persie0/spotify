package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wf90 {

    /* JADX INFO: renamed from: a */
    public final mb90 f250768a;

    public wf90(mb90 mb90Var) {
        this.f250768a = mb90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf90) && wj50.m88271j(this.f250768a, ((wf90) obj).f250768a);
    }

    public final int hashCode() {
        mb90 mb90Var = this.f250768a;
        if (mb90Var == null) {
            return 0;
        }
        return mb90Var.hashCode();
    }
}
