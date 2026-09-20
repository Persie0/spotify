package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class yo2 {
    public static final xo2 Companion = new xo2();

    /* JADX INFO: renamed from: a */
    public final gk2 f274538a;

    public /* synthetic */ yo2(int i, gk2 gk2Var) {
        if ((i & 1) == 0) {
            this.f274538a = null;
        } else {
            this.f274538a = gk2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo2) && wj50.m88271j(this.f274538a, ((yo2) obj).f274538a);
    }

    public final int hashCode() {
        gk2 gk2Var = this.f274538a;
        if (gk2Var == null) {
            return 0;
        }
        return gk2Var.hashCode();
    }
}
