package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vim0 implements dkm0 {

    /* JADX INFO: renamed from: a */
    public final String f241746a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f241747b;

    public vim0(String str, gkm0 gkm0Var) {
        this.f241746a = str;
        this.f241747b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vim0)) {
            return false;
        }
        vim0 vim0Var = (vim0) obj;
        return wj50.m88271j(this.f241746a, vim0Var.f241746a) && wj50.m88271j(this.f241747b, vim0Var.f241747b);
    }

    public final int hashCode() {
        return this.f241747b.hashCode() + (this.f241746a.hashCode() * 31);
    }
}
