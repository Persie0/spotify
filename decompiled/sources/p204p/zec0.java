package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zec0 extends iqg1 {

    /* JADX INFO: renamed from: c */
    public final int f281997c;

    public zec0(int i) {
        this.f281997c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zec0) && this.f281997c == ((zec0) obj).f281997c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281997c);
    }

    @Override // p204p.iqg1
    /* JADX INFO: renamed from: o */
    public final int mo25807o() {
        return this.f281997c;
    }
}
