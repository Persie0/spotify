package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tq81 extends wq81 {

    /* JADX INFO: renamed from: a */
    public final long f222775a;

    public tq81(long j) {
        this.f222775a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq81) && this.f222775a == ((tq81) obj).f222775a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f222775a);
    }
}
