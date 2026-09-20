package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jxb0 {

    /* JADX INFO: renamed from: a */
    public final ixn f117090a;

    /* JADX INFO: renamed from: b */
    public final efk0 f117091b;

    /* JADX INFO: renamed from: c */
    public final boolean f117092c;

    public jxb0(ixn ixnVar, efk0 efk0Var, boolean z) {
        this.f117090a = ixnVar;
        this.f117091b = efk0Var;
        this.f117092c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxb0)) {
            return false;
        }
        jxb0 jxb0Var = (jxb0) obj;
        return wj50.m88271j(this.f117090a, jxb0Var.f117090a) && wj50.m88271j(this.f117091b, jxb0Var.f117091b) && this.f117092c == jxb0Var.f117092c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117092c) + ((this.f117091b.hashCode() + (this.f117090a.hashCode() * 31)) * 31);
    }
}
