package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gya extends vya {

    /* JADX INFO: renamed from: a */
    public final boolean f85520a;

    public gya(boolean z) {
        this.f85520a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gya) && this.f85520a == ((gya) obj).f85520a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f85520a);
    }
}
