package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class os91 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final short f168780a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return wj50.m88282u(this.f168780a & 65535, ((os91) obj).f168780a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof os91) {
            return this.f168780a == ((os91) obj).f168780a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f168780a);
    }

    public final String toString() {
        return String.valueOf(this.f168780a & 65535);
    }
}
