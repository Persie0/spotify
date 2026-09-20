package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bfc0 extends iqg1 {

    /* JADX INFO: renamed from: c */
    public final int f26662c;

    public bfc0(int i) {
        this.f26662c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfc0) && this.f26662c == ((bfc0) obj).f26662c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26662c);
    }

    @Override // p204p.iqg1
    /* JADX INFO: renamed from: o */
    public final int mo25807o() {
        return this.f26662c;
    }
}
