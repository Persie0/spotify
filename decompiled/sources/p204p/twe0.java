package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class twe0 {

    /* JADX INFO: renamed from: a */
    public final boolean f224432a;

    public twe0(boolean z) {
        this.f224432a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twe0) && this.f224432a == ((twe0) obj).f224432a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224432a);
    }
}
