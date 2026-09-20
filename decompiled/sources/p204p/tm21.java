package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tm21 {

    /* JADX INFO: renamed from: a */
    public final fn21 f221579a;

    /* JADX INFO: renamed from: b */
    public final boolean f221580b;

    public tm21(fn21 fn21Var, boolean z) {
        this.f221579a = fn21Var;
        this.f221580b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm21)) {
            return false;
        }
        tm21 tm21Var = (tm21) obj;
        return wj50.m88271j(this.f221579a, tm21Var.f221579a) && this.f221580b == tm21Var.f221580b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221580b) + (this.f221579a.hashCode() * 31);
    }
}
