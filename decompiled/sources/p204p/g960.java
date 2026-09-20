package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g960 implements m960 {

    /* JADX INFO: renamed from: a */
    public final boolean f77680a;

    public g960(boolean z) {
        this.f77680a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g960) && this.f77680a == ((g960) obj).f77680a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77680a);
    }
}
