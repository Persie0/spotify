package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qq71 extends wq71 {

    /* JADX INFO: renamed from: a */
    public final Throwable f191502a;

    /* JADX INFO: renamed from: b */
    public final int f191503b;

    public qq71(int i, Throwable th) {
        this.f191502a = th;
        this.f191503b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq71)) {
            return false;
        }
        qq71 qq71Var = (qq71) obj;
        return wj50.m88271j(this.f191502a, qq71Var.f191502a) && this.f191503b == qq71Var.f191503b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f191503b) + (this.f191502a.hashCode() * 31);
    }
}
