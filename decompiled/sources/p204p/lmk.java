package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lmk implements mmk {

    /* JADX INFO: renamed from: a */
    public final csc1 f134986a;

    public lmk(csc1 csc1Var) {
        this.f134986a = csc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmk) && this.f134986a == ((lmk) obj).f134986a;
    }

    public final int hashCode() {
        return this.f134986a.hashCode();
    }
}
