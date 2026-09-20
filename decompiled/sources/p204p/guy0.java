package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class guy0 implements quy0 {

    /* JADX INFO: renamed from: a */
    public final int f84573a;

    /* JADX INFO: renamed from: b */
    public final Throwable f84574b;

    public guy0(int i, Throwable th) {
        this.f84573a = i;
        this.f84574b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guy0)) {
            return false;
        }
        guy0 guy0Var = (guy0) obj;
        return this.f84573a == guy0Var.f84573a && wj50.m88271j(this.f84574b, guy0Var.f84574b);
    }

    public final int hashCode() {
        return this.f84574b.hashCode() + (Integer.hashCode(this.f84573a) * 31);
    }
}
