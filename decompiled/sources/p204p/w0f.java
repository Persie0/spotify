package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class w0f {

    /* JADX INFO: renamed from: a */
    public final d850 f246724a;

    /* JADX INFO: renamed from: b */
    public final boolean f246725b;

    public w0f(d850 d850Var, boolean z) {
        this.f246724a = d850Var;
        this.f246725b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0f)) {
            return false;
        }
        w0f w0fVar = (w0f) obj;
        return wj50.m88271j(this.f246724a, w0fVar.f246724a) && this.f246725b == w0fVar.f246725b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246725b) + (this.f246724a.hashCode() * 31);
    }
}
