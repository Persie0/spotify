package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xyb0 {

    /* JADX INFO: renamed from: a */
    public final skm0 f267269a;

    /* JADX INFO: renamed from: b */
    public final boolean f267270b;

    public xyb0(skm0 skm0Var, boolean z) {
        this.f267269a = skm0Var;
        this.f267270b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyb0)) {
            return false;
        }
        xyb0 xyb0Var = (xyb0) obj;
        return wj50.m88271j(this.f267269a, xyb0Var.f267269a) && this.f267270b == xyb0Var.f267270b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267270b) + (this.f267269a.hashCode() * 31);
    }
}
