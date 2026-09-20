package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t72 implements v72 {

    /* JADX INFO: renamed from: a */
    public final boolean f217662a;

    /* JADX INFO: renamed from: b */
    public final int f217663b;

    public t72(boolean z, int i) {
        this.f217662a = z;
        this.f217663b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t72)) {
            return false;
        }
        t72 t72Var = (t72) obj;
        return this.f217662a == t72Var.f217662a && this.f217663b == t72Var.f217663b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f217663b) + (Boolean.hashCode(this.f217662a) * 31);
    }
}
