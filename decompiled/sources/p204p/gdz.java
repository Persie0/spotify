package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gdz {

    /* JADX INFO: renamed from: a */
    public final boolean f78965a;

    /* JADX INFO: renamed from: b */
    public final boolean f78966b;

    public gdz(boolean z, boolean z2) {
        this.f78965a = z;
        this.f78966b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdz)) {
            return false;
        }
        gdz gdzVar = (gdz) obj;
        return this.f78965a == gdzVar.f78965a && this.f78966b == gdzVar.f78966b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78966b) + (Boolean.hashCode(this.f78965a) * 31);
    }
}
