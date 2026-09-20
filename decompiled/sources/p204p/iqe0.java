package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class iqe0 implements jqe0 {

    /* JADX INFO: renamed from: a */
    public final long f104746a;

    public iqe0(long j) {
        this.f104746a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqe0) && this.f104746a == ((iqe0) obj).f104746a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104746a);
    }
}
