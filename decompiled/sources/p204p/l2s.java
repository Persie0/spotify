package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class l2s {

    /* JADX INFO: renamed from: a */
    public final boolean f129069a;

    /* JADX INFO: renamed from: b */
    public final boolean f129070b;

    public /* synthetic */ l2s(boolean z, int i) {
        this(false, (i & 2) != 0 ? false : z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2s)) {
            return false;
        }
        l2s l2sVar = (l2s) obj;
        return this.f129069a == l2sVar.f129069a && this.f129070b == l2sVar.f129070b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129070b) + (Boolean.hashCode(this.f129069a) * 31);
    }

    public l2s(boolean z, boolean z2) {
        this.f129069a = z;
        this.f129070b = z2;
    }
}
