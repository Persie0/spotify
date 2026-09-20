package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class t58 extends v58 {

    /* JADX INFO: renamed from: a */
    public final lhw f217240a;

    public t58(lhw lhwVar) {
        this.f217240a = lhwVar;
    }

    @Override // p204p.v58
    /* JADX INFO: renamed from: a */
    public final boolean mo74810a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t58) && this.f217240a.equals(((t58) obj).f217240a);
    }

    public final int hashCode() {
        return this.f217240a.hashCode() + (Boolean.hashCode(false) * 31);
    }
}
