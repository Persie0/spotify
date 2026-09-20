package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p8e1 extends u8e1 {

    /* JADX INFO: renamed from: a */
    public final int f174947a;

    public p8e1(int i) {
        this.f174947a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8e1) && this.f174947a == ((p8e1) obj).f174947a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f174947a);
    }
}
