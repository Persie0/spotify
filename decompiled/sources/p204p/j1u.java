package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class j1u {

    /* JADX INFO: renamed from: a */
    public final boolean f107865a;

    /* JADX INFO: renamed from: b */
    public final boolean f107866b;

    public j1u(boolean z, boolean z2) {
        this.f107865a = z;
        this.f107866b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1u)) {
            return false;
        }
        j1u j1uVar = (j1u) obj;
        return this.f107865a == j1uVar.f107865a && this.f107866b == j1uVar.f107866b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107866b) + (Boolean.hashCode(this.f107865a) * 31);
    }
}
