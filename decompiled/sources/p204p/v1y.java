package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v1y {

    /* JADX INFO: renamed from: a */
    public final boolean f236491a;

    /* JADX INFO: renamed from: b */
    public final boolean f236492b;

    public v1y(boolean z, boolean z2) {
        this.f236491a = z;
        this.f236492b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1y)) {
            return false;
        }
        v1y v1yVar = (v1y) obj;
        return this.f236491a == v1yVar.f236491a && this.f236492b == v1yVar.f236492b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f236492b) + (Boolean.hashCode(this.f236491a) * 31);
    }
}
