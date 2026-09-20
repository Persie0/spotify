package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gro0 implements rro0 {

    /* JADX INFO: renamed from: a */
    public final fro0 f83801a;

    public gro0(fro0 fro0Var) {
        this.f83801a = fro0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gro0) && wj50.m88271j(this.f83801a, ((gro0) obj).f83801a);
    }

    public final int hashCode() {
        fro0 fro0Var = this.f83801a;
        if (fro0Var == null) {
            return 0;
        }
        return fro0Var.hashCode();
    }
}
