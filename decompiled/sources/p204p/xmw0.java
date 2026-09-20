package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xmw0 implements ymw0 {

    /* JADX INFO: renamed from: a */
    public final boolean f263457a;

    public xmw0(boolean z) {
        this.f263457a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xmw0) && this.f263457a == ((xmw0) obj).f263457a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263457a);
    }
}
