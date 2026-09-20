package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ifc0 implements kfc0 {

    /* JADX INFO: renamed from: a */
    public final int f101743a;

    public ifc0(int i) {
        this.f101743a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifc0) && this.f101743a == ((ifc0) obj).f101743a;
    }

    @Override // p204p.kfc0
    public final int getCount() {
        return this.f101743a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101743a);
    }
}
