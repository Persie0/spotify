package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v2w0 implements w2w0 {

    /* JADX INFO: renamed from: a */
    public final v72 f236731a;

    public v2w0(v72 v72Var) {
        this.f236731a = v72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2w0) && wj50.m88271j(this.f236731a, ((v2w0) obj).f236731a);
    }

    public final int hashCode() {
        v72 v72Var = this.f236731a;
        if (v72Var == null) {
            return 0;
        }
        return v72Var.hashCode();
    }
}
