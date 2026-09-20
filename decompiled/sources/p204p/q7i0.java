package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class q7i0 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final int f186138a;

    /* JADX INFO: renamed from: b */
    public final boolean f186139b;

    public /* synthetic */ q7i0() {
        this(1, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7i0)) {
            return false;
        }
        q7i0 q7i0Var = (q7i0) obj;
        return this.f186138a == q7i0Var.f186138a && this.f186139b == q7i0Var.f186139b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186139b) + (Integer.hashCode(this.f186138a) * 31);
    }

    public q7i0(int i, boolean z) {
        this.f186138a = i;
        this.f186139b = z;
    }
}
