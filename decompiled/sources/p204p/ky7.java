package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ky7 {

    /* JADX INFO: renamed from: a */
    public final int f127691a;

    /* JADX INFO: renamed from: b */
    public final Throwable f127692b;

    public ky7(int i, Throwable th) {
        this.f127691a = i;
        this.f127692b = th;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ky7) {
            ky7 ky7Var = (ky7) obj;
            Throwable th2 = ky7Var.f127692b;
            if (this.f127691a == ky7Var.f127691a && ((th = this.f127692b) != null ? th.equals(th2) : th2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f127691a ^ 1000003) * 1000003;
        Throwable th = this.f127692b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f127691a + ", cause=" + this.f127692b + "}";
    }
}
