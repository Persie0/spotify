package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u1y {

    /* JADX INFO: renamed from: a */
    public final boolean f225934a;

    /* JADX INFO: renamed from: b */
    public final boolean f225935b;

    public u1y(boolean z, boolean z2) {
        this.f225934a = z;
        this.f225935b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1y)) {
            return false;
        }
        u1y u1yVar = (u1y) obj;
        return this.f225934a == u1yVar.f225934a && this.f225935b == u1yVar.f225935b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225935b) + (Boolean.hashCode(this.f225934a) * 31);
    }
}
