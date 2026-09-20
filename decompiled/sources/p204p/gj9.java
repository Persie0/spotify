package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gj9 {

    /* JADX INFO: renamed from: a */
    public final w9r f80400a;

    /* JADX INFO: renamed from: b */
    public final uud1 f80401b;

    public gj9(w9r w9rVar, uud1 uud1Var) {
        this.f80400a = w9rVar;
        this.f80401b = uud1Var;
    }

    /* JADX INFO: renamed from: a */
    public final w9r m44868a() {
        return this.f80400a;
    }

    /* JADX INFO: renamed from: b */
    public final uud1 m44869b() {
        return this.f80401b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj9)) {
            return false;
        }
        gj9 gj9Var = (gj9) obj;
        return wj50.m88271j(this.f80400a, gj9Var.f80400a) && wj50.m88271j(this.f80401b, gj9Var.f80401b);
    }

    public final int hashCode() {
        return this.f80401b.hashCode() + (this.f80400a.hashCode() * 31);
    }
}
