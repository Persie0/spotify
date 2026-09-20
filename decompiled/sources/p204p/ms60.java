package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ms60 {

    /* JADX INFO: renamed from: a */
    public final v140 f146704a;

    public ms60(v140 v140Var) {
        this.f146704a = v140Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ms60) && wj50.m88271j(this.f146704a, ((ms60) obj).f146704a);
    }

    public final int hashCode() {
        v140 v140Var = this.f146704a;
        if (v140Var == null) {
            return 0;
        }
        return v140Var.hashCode();
    }
}
