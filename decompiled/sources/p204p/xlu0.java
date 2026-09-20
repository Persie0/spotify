package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xlu0 {

    /* JADX INFO: renamed from: a */
    public final boolean f263240a;

    public xlu0(boolean z) {
        this.f263240a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlu0) && this.f263240a == ((xlu0) obj).f263240a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f263240a);
    }
}
