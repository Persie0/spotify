package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t2k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final int f216581a;

    public t2k0(int i) {
        this.f216581a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2k0) && this.f216581a == ((t2k0) obj).f216581a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f216581a);
    }
}
