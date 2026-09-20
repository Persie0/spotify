package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class c0r0 {

    /* JADX INFO: renamed from: a */
    public final fw8 f32850a;

    /* JADX INFO: renamed from: b */
    public final d0r0 f32851b;

    public c0r0(fw8 fw8Var, d0r0 d0r0Var) {
        this.f32850a = fw8Var;
        this.f32851b = d0r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0r0)) {
            return false;
        }
        c0r0 c0r0Var = (c0r0) obj;
        return wj50.m88271j(this.f32850a, c0r0Var.f32850a) && wj50.m88271j(this.f32851b, c0r0Var.f32851b);
    }

    public final int hashCode() {
        return this.f32851b.hashCode() + (this.f32850a.hashCode() * 31);
    }
}
