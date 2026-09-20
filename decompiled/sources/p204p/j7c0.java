package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f109560a;

    public j7c0(boolean z) {
        this.f109560a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7c0) && this.f109560a == ((j7c0) obj).f109560a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109560a);
    }
}
