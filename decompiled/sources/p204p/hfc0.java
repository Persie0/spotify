package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hfc0 implements kfc0 {

    /* JADX INFO: renamed from: a */
    public final int f90675a;

    public hfc0(int i) {
        this.f90675a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfc0) && this.f90675a == ((hfc0) obj).f90675a;
    }

    @Override // p204p.kfc0
    public final int getCount() {
        return this.f90675a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90675a);
    }
}
