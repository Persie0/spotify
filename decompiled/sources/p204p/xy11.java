package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xy11 implements yy11 {

    /* JADX INFO: renamed from: a */
    public final os01 f267180a;

    public xy11(os01 os01Var) {
        this.f267180a = os01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xy11) && this.f267180a.equals(((xy11) obj).f267180a);
    }

    public final int hashCode() {
        return this.f267180a.hashCode();
    }
}
