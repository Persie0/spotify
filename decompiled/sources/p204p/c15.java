package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c15 {

    /* JADX INFO: renamed from: a */
    public final awb0 f32979a;

    /* JADX INFO: renamed from: b */
    public final yvb0 f32980b;

    public c15(awb0 awb0Var, yvb0 yvb0Var) {
        this.f32979a = awb0Var;
        this.f32980b = yvb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c15)) {
            return false;
        }
        c15 c15Var = (c15) obj;
        return wj50.m88271j(this.f32979a, c15Var.f32979a) && wj50.m88271j(this.f32980b, c15Var.f32980b);
    }

    public final int hashCode() {
        return this.f32980b.hashCode() + (this.f32979a.hashCode() * 31);
    }
}
