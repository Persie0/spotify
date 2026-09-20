package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cfc0 extends iqg1 {

    /* JADX INFO: renamed from: c */
    public final int f37321c;

    public cfc0(int i) {
        this.f37321c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfc0) && this.f37321c == ((cfc0) obj).f37321c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37321c);
    }

    @Override // p204p.iqg1
    /* JADX INFO: renamed from: o */
    public final int mo25807o() {
        return this.f37321c;
    }
}
