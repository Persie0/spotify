package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u141 implements a241 {

    /* JADX INFO: renamed from: a */
    public final boolean f225680a;

    public u141(boolean z) {
        this.f225680a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u141) && this.f225680a == ((u141) obj).f225680a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225680a);
    }
}
