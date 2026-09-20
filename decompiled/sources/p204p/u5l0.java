package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u5l0 implements v5l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f227067a;

    public u5l0(boolean z) {
        this.f227067a = z;
    }

    @Override // p204p.v5l0
    /* JADX INFO: renamed from: a */
    public final boolean mo74817a() {
        return this.f227067a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5l0) && this.f227067a == ((u5l0) obj).f227067a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227067a);
    }
}
