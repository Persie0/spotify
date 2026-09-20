package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uox0 implements yox0 {

    /* JADX INFO: renamed from: a */
    public final int f232538a;

    public uox0(int i) {
        this.f232538a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uox0) && this.f232538a == ((uox0) obj).f232538a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f232538a);
    }
}
