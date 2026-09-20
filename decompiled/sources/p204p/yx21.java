package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class yx21 extends zx21 {

    /* JADX INFO: renamed from: a */
    public final boolean f277117a;

    /* JADX INFO: renamed from: b */
    public final mx21 f277118b;

    public yx21(boolean z, mx21 mx21Var) {
        this.f277117a = z;
        this.f277118b = mx21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx21)) {
            return false;
        }
        yx21 yx21Var = (yx21) obj;
        return this.f277117a == yx21Var.f277117a && wj50.m88271j(this.f277118b, yx21Var.f277118b);
    }

    public final int hashCode() {
        return this.f277118b.hashCode() + (Boolean.hashCode(this.f277117a) * 31);
    }
}
