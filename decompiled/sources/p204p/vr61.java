package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vr61 extends xr61 {

    /* JADX INFO: renamed from: a */
    public final int f244082a;

    public vr61(int i) {
        this.f244082a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr61) && this.f244082a == ((vr61) obj).f244082a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f244082a);
    }
}
