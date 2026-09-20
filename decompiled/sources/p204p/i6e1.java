package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final u9z f99223a;

    public i6e1(u9z u9zVar) {
        this.f99223a = u9zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6e1) && this.f99223a == ((i6e1) obj).f99223a;
    }

    public final int hashCode() {
        return this.f99223a.hashCode();
    }
}
