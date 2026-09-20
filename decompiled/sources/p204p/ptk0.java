package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ptk0 {

    /* JADX INFO: renamed from: a */
    public final qtk0 f181191a;

    /* JADX INFO: renamed from: b */
    public final int f181192b;

    public ptk0(qtk0 qtk0Var, int i) {
        this.f181191a = qtk0Var;
        this.f181192b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptk0)) {
            return false;
        }
        ptk0 ptk0Var = (ptk0) obj;
        return wj50.m88271j(this.f181191a, ptk0Var.f181191a) && this.f181192b == ptk0Var.f181192b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f181192b) + (this.f181191a.hashCode() * 31);
    }
}
