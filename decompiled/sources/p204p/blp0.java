package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class blp0 implements clp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f28219a;

    public blp0(boolean z) {
        this.f28219a = z;
    }

    @Override // p204p.clp0
    /* JADX INFO: renamed from: a */
    public final boolean mo26353a() {
        return this.f28219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blp0) && this.f28219a == ((blp0) obj).f28219a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28219a);
    }
}
