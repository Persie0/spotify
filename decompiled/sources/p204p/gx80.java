package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class gx80 {

    /* JADX INFO: renamed from: a */
    public final i6a0 f85222a;

    /* JADX INFO: renamed from: b */
    public final hcj f85223b;

    public gx80(i6a0 i6a0Var, hcj hcjVar) {
        this.f85222a = i6a0Var;
        this.f85223b = hcjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx80)) {
            return false;
        }
        gx80 gx80Var = (gx80) obj;
        return wj50.m88271j(this.f85222a, gx80Var.f85222a) && wj50.m88271j(this.f85223b, gx80Var.f85223b);
    }

    public final int hashCode() {
        return this.f85223b.hashCode() + (this.f85222a.hashCode() * 31);
    }

    public /* synthetic */ gx80(mau mauVar) {
        this(mauVar, fcj.f68131a);
    }
}
