package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class k9a0 implements eaa0 {

    /* JADX INFO: renamed from: a */
    public final zgv f120544a;

    public k9a0(zgv zgvVar) {
        this.f120544a = zgvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9a0) && this.f120544a.equals(((k9a0) obj).f120544a);
    }

    public final int hashCode() {
        return this.f120544a.hashCode();
    }
}
