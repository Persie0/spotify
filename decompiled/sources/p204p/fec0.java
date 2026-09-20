package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fec0 extends iec0 {

    /* JADX INFO: renamed from: a */
    public final lhw f68741a;

    public fec0(lhw lhwVar) {
        this.f68741a = lhwVar;
    }

    @Override // p204p.iec0
    /* JADX INFO: renamed from: a */
    public final boolean mo35773a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fec0) && this.f68741a.equals(((fec0) obj).f68741a);
    }

    public final int hashCode() {
        return this.f68741a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
