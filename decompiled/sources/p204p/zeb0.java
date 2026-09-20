package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zeb0 implements rfb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f281989a;

    public zeb0(boolean z) {
        this.f281989a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zeb0) && this.f281989a == ((zeb0) obj).f281989a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281989a);
    }
}
