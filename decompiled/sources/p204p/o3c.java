package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class o3c {

    /* JADX INFO: renamed from: a */
    public final boolean f161337a;

    /* JADX INFO: renamed from: b */
    public final boolean f161338b;

    public o3c(boolean z, boolean z2) {
        this.f161337a = z;
        this.f161338b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3c)) {
            return false;
        }
        o3c o3cVar = (o3c) obj;
        return this.f161337a == o3cVar.f161337a && this.f161338b == o3cVar.f161338b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161338b) + (Boolean.hashCode(this.f161337a) * 31);
    }
}
