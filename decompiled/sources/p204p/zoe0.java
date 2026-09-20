package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class zoe0 extends ape0 {

    /* JADX INFO: renamed from: a */
    public final boolean f284775a;

    public zoe0(boolean z) {
        this.f284775a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoe0) && this.f284775a == ((zoe0) obj).f284775a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284775a);
    }
}
