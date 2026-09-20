package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y100 {

    /* JADX INFO: renamed from: a */
    public final e6x0 f268119a;

    /* JADX INFO: renamed from: b */
    public final boolean f268120b;

    public y100(e6x0 e6x0Var, boolean z) {
        this.f268119a = e6x0Var;
        this.f268120b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y100)) {
            return false;
        }
        y100 y100Var = (y100) obj;
        return wj50.m88271j(this.f268119a, y100Var.f268119a) && this.f268120b == y100Var.f268120b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f268120b) + (this.f268119a.hashCode() * 31);
    }
}
