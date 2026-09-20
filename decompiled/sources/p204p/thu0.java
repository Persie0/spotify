package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class thu0 implements vhu0 {

    /* JADX INFO: renamed from: a */
    public final whu0 f220505a;

    /* JADX INFO: renamed from: b */
    public final int f220506b;

    public thu0(whu0 whu0Var, int i) {
        this.f220505a = whu0Var;
        this.f220506b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thu0)) {
            return false;
        }
        thu0 thu0Var = (thu0) obj;
        return wj50.m88271j(this.f220505a, thu0Var.f220505a) && this.f220506b == thu0Var.f220506b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f220506b) + (this.f220505a.f251445a.hashCode() * 31);
    }
}
