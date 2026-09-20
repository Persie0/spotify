package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class t5l0 implements v5l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f217315a;

    public t5l0(boolean z) {
        this.f217315a = z;
    }

    @Override // p204p.v5l0
    /* JADX INFO: renamed from: a */
    public final boolean mo74817a() {
        return this.f217315a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t5l0) && this.f217315a == ((t5l0) obj).f217315a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217315a);
    }
}
