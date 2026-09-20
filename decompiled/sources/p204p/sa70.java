package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sa70 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final p7f0 f207152a;

    public sa70(p7f0 p7f0Var) {
        this.f207152a = p7f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa70) && this.f207152a.equals(((sa70) obj).f207152a);
    }

    public final int hashCode() {
        return this.f207152a.hashCode();
    }
}
