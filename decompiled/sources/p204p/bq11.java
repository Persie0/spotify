package p204p;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class bq11 {
    public static final aq11 Companion = new aq11();

    /* JADX INFO: renamed from: a */
    public final ql11 f29644a;

    public /* synthetic */ bq11(int i, ql11 ql11Var) {
        if ((i & 1) == 0) {
            this.f29644a = null;
        } else {
            this.f29644a = ql11Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq11) && wj50.m88271j(this.f29644a, ((bq11) obj).f29644a);
    }

    public final int hashCode() {
        ql11 ql11Var = this.f29644a;
        if (ql11Var == null) {
            return 0;
        }
        return ql11Var.hashCode();
    }

    public bq11(ql11 ql11Var) {
        this.f29644a = ql11Var;
    }
}
