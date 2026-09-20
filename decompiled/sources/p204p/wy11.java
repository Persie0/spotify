package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wy11 implements yy11 {

    /* JADX INFO: renamed from: a */
    public final os01 f256175a;

    public wy11(os01 os01Var) {
        this.f256175a = os01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy11) && this.f256175a.equals(((wy11) obj).f256175a);
    }

    public final int hashCode() {
        return this.f256175a.hashCode();
    }
}
