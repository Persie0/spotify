package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class r521 extends a621 {

    /* JADX INFO: renamed from: a */
    public final s4m0 f195933a;

    public r521(s4m0 s4m0Var) {
        this.f195933a = s4m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r521) && wj50.m88271j(this.f195933a, ((r521) obj).f195933a);
    }

    public final int hashCode() {
        s4m0 s4m0Var = this.f195933a;
        if (s4m0Var == null) {
            return 0;
        }
        return s4m0Var.hashCode();
    }
}
