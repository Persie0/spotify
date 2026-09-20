package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tou0 implements uou0 {

    /* JADX INFO: renamed from: a */
    public final int f222322a;

    public tou0(int i) {
        this.f222322a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tou0) && this.f222322a == ((tou0) obj).f222322a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f222322a);
    }
}
