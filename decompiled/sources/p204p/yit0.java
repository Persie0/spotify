package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yit0 implements ajt0 {

    /* JADX INFO: renamed from: a */
    public final boolean f273200a;

    public yit0(boolean z) {
        this.f273200a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yit0) && this.f273200a == ((yit0) obj).f273200a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273200a);
    }
}
