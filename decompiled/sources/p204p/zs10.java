package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zs10 {

    /* JADX INFO: renamed from: a */
    public final int f285820a;

    public zs10(int i) {
        this.f285820a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs10) && this.f285820a == ((zs10) obj).f285820a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f285820a);
    }
}
