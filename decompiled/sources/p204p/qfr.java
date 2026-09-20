package p204p;

/* JADX INFO: loaded from: classes6.dex */
@rtz0
public final class qfr {
    public static final pfr Companion = new pfr();

    /* JADX INFO: renamed from: a */
    public final m061 f188284a;

    public /* synthetic */ qfr(int i, m061 m061Var) {
        if ((i & 1) == 0) {
            this.f188284a = null;
        } else {
            this.f188284a = m061Var;
        }
    }

    /* JADX INFO: renamed from: a */
    public final m061 m72722a() {
        return this.f188284a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qfr) && wj50.m88271j(this.f188284a, ((qfr) obj).f188284a);
    }

    public final int hashCode() {
        m061 m061Var = this.f188284a;
        if (m061Var == null) {
            return 0;
        }
        return m061Var.hashCode();
    }
}
