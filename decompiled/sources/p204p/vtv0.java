package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vtv0 extends buv0 {

    /* JADX INFO: renamed from: a */
    public final boolean f244780a;

    public vtv0(boolean z) {
        this.f244780a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vtv0) && this.f244780a == ((vtv0) obj).f244780a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f244780a);
    }
}
