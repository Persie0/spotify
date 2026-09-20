package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h31 {

    /* JADX INFO: renamed from: a */
    public final kzw0 f87109a;

    /* JADX INFO: renamed from: b */
    public final boolean f87110b;

    public /* synthetic */ h31() {
        this(null, false);
    }

    /* JADX INFO: renamed from: a */
    public final kzw0 m46505a() {
        return this.f87109a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h31)) {
            return false;
        }
        h31 h31Var = (h31) obj;
        return wj50.m88271j(this.f87109a, h31Var.f87109a) && this.f87110b == h31Var.f87110b;
    }

    public final int hashCode() {
        kzw0 kzw0Var = this.f87109a;
        return Boolean.hashCode(this.f87110b) + ((kzw0Var == null ? 0 : kzw0Var.hashCode()) * 31);
    }

    public h31(kzw0 kzw0Var, boolean z) {
        this.f87109a = kzw0Var;
        this.f87110b = z;
    }
}
