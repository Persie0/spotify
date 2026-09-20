package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j7b0 extends t7b0 {

    /* JADX INFO: renamed from: a */
    public final boolean f109557a;

    public j7b0(boolean z) {
        this.f109557a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7b0) && this.f109557a == ((j7b0) obj).f109557a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109557a);
    }
}
