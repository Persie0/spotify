package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s5l0 implements v5l0 {

    /* JADX INFO: renamed from: a */
    public final boolean f205856a;

    public s5l0(boolean z) {
        this.f205856a = z;
    }

    @Override // p204p.v5l0
    /* JADX INFO: renamed from: a */
    public final boolean mo74817a() {
        return this.f205856a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5l0) && this.f205856a == ((s5l0) obj).f205856a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205856a);
    }
}
