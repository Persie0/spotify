package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sce implements uce {

    /* JADX INFO: renamed from: a */
    public final int f207691a;

    public sce(int i) {
        this.f207691a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m77766a() {
        return this.f207691a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sce) && this.f207691a == ((sce) obj).f207691a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f207691a);
    }
}
