package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wyh0 implements xyh0 {

    /* JADX INFO: renamed from: a */
    public final String f256295a;

    /* JADX INFO: renamed from: b */
    public final int f256296b;

    public wyh0(String str, int i) {
        this.f256295a = str;
        this.f256296b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyh0)) {
            return false;
        }
        wyh0 wyh0Var = (wyh0) obj;
        return wj50.m88271j(this.f256295a, wyh0Var.f256295a) && this.f256296b == wyh0Var.f256296b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f256296b) + (this.f256295a.hashCode() * 31);
    }
}
