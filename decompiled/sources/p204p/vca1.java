package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vca1 implements wca1 {

    /* JADX INFO: renamed from: a */
    public final boolean f240098a;

    public vca1(boolean z) {
        this.f240098a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vca1) && this.f240098a == ((vca1) obj).f240098a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f240098a);
    }
}
