package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class tbm0 extends ehg1 {

    /* JADX INFO: renamed from: e */
    public final boolean f218906e;

    public tbm0(boolean z) {
        this.f218906e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tbm0) && this.f218906e == ((tbm0) obj).f218906e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218906e);
    }
}
