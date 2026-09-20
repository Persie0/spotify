package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tfo0 implements wfo0 {

    /* JADX INFO: renamed from: a */
    public final int f220030a;

    public tfo0(int i) {
        this.f220030a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfo0) && this.f220030a == ((tfo0) obj).f220030a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f220030a);
    }
}
