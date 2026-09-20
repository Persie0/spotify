package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class v4d1 extends b5d1 {

    /* JADX INFO: renamed from: a */
    public final boolean f237130a;

    public v4d1(boolean z) {
        this.f237130a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4d1) && this.f237130a == ((v4d1) obj).f237130a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237130a);
    }
}
