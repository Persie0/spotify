package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class gg41 {

    /* JADX INFO: renamed from: a */
    public final boolean f79534a;

    public gg41(boolean z) {
        this.f79534a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gg41) && this.f79534a == ((gg41) obj).f79534a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79534a);
    }
}
