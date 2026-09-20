package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class p09 implements suw0 {

    /* JADX INFO: renamed from: a */
    public final tf60 f172508a;

    public /* synthetic */ p09(tf60 tf60Var) {
        this.f172508a = tf60Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p09) {
            return wj50.m88271j(this.f172508a, ((p09) obj).f172508a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f172508a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f172508a + ')';
    }
}
