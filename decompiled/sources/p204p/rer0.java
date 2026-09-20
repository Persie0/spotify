package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class rer0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f198424a;

    public rer0(boolean z) {
        this.f198424a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rer0) && this.f198424a == ((rer0) obj).f198424a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198424a);
    }
}
