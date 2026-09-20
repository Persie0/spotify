package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class afc0 extends iqg1 {

    /* JADX INFO: renamed from: c */
    public final int f15115c;

    public afc0(int i) {
        this.f15115c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afc0) && this.f15115c == ((afc0) obj).f15115c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15115c);
    }

    @Override // p204p.iqg1
    /* JADX INFO: renamed from: o */
    public final int mo25807o() {
        return this.f15115c;
    }
}
