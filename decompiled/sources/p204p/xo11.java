package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xo11 {

    /* JADX INFO: renamed from: a */
    public final boolean f263746a;

    public xo11(boolean z) {
        this.f263746a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo11) && this.f263746a == ((xo11) obj).f263746a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263746a);
    }
}
