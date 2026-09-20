package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f370 {

    /* JADX INFO: renamed from: a */
    public final h891 f65406a;

    /* JADX INFO: renamed from: b */
    public final b370 f65407b;

    /* JADX INFO: renamed from: c */
    public final d850 f65408c;

    public f370(h891 h891Var, b370 b370Var, d850 d850Var) {
        this.f65406a = h891Var;
        this.f65407b = b370Var;
        this.f65408c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f370)) {
            return false;
        }
        f370 f370Var = (f370) obj;
        return wj50.m88271j(this.f65406a, f370Var.f65406a) && wj50.m88271j(this.f65407b, f370Var.f65407b) && wj50.m88271j(this.f65408c, f370Var.f65408c);
    }

    public final int hashCode() {
        return this.f65408c.hashCode() + ((this.f65407b.hashCode() + (this.f65406a.hashCode() * 31)) * 31);
    }
}
