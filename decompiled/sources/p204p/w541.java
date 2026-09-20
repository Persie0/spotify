package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class w541 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f247994a;

    public w541(boolean z) {
        this.f247994a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w541) && this.f247994a == ((w541) obj).f247994a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247994a);
    }
}
