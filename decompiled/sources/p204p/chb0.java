package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class chb0 implements fhb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f37982a;

    public chb0(boolean z) {
        this.f37982a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chb0) && this.f37982a == ((chb0) obj).f37982a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37982a);
    }
}
