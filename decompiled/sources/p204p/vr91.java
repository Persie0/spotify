package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vr91 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f244116a;

    public /* synthetic */ vr91(int i) {
        this.f244116a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ vr91 m86278a(int i) {
        return new vr91(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return wj50.m88282u(this.f244116a ^ Integer.MIN_VALUE, ((vr91) obj).f244116a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vr91) {
            return this.f244116a == ((vr91) obj).f244116a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f244116a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f244116a) & 4294967295L);
    }
}
