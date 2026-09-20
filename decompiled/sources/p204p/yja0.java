package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yja0 extends jka0 {

    /* JADX INFO: renamed from: a */
    public final boolean f273337a;

    public yja0(boolean z) {
        this.f273337a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yja0) && this.f273337a == ((yja0) obj).f273337a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273337a);
    }
}
