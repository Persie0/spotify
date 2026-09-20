package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xo21 {

    /* JADX INFO: renamed from: a */
    public final boolean f263749a;

    public xo21(boolean z) {
        this.f263749a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xo21) && this.f263749a == ((xo21) obj).f263749a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263749a);
    }
}
