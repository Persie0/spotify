package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xxd1 {

    /* JADX INFO: renamed from: a */
    public final byd1 f266947a;

    /* JADX INFO: renamed from: b */
    public final qvd1 f266948b;

    public xxd1(byd1 byd1Var, qvd1 qvd1Var) {
        this.f266947a = byd1Var;
        this.f266948b = qvd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xxd1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xxd1 xxd1Var = (xxd1) obj;
        return wj50.m88271j(this.f266947a, xxd1Var.f266947a) && wj50.m88271j(this.f266948b, xxd1Var.f266948b);
    }

    public final int hashCode() {
        return (this.f266947a.f32166a * 31) + this.f266948b.f192984a;
    }

    public final String toString() {
        return "SizeClass { widthSizeClass: " + this.f266947a + ", heightSizeClass: " + this.f266948b + " }";
    }
}
