package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class op21 {

    /* JADX INFO: renamed from: a */
    public final boolean f167741a;

    /* JADX INFO: renamed from: b */
    public final zo21 f167742b;

    public op21(boolean z, zo21 zo21Var) {
        this.f167741a = z;
        this.f167742b = zo21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op21)) {
            return false;
        }
        op21 op21Var = (op21) obj;
        return this.f167741a == op21Var.f167741a && this.f167742b == op21Var.f167742b;
    }

    public final int hashCode() {
        return this.f167742b.hashCode() + (Boolean.hashCode(this.f167741a) * 31);
    }
}
