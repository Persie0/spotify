package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rnf0 implements lpf0 {

    /* JADX INFO: renamed from: a */
    public final mzc1 f200906a;

    public rnf0(mzc1 mzc1Var) {
        this.f200906a = mzc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rnf0) && this.f200906a == ((rnf0) obj).f200906a;
    }

    public final int hashCode() {
        return this.f200906a.hashCode();
    }
}
