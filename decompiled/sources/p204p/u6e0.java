package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u6e0 {

    /* JADX INFO: renamed from: a */
    public final boolean f227307a;

    public u6e0(boolean z) {
        this.f227307a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6e0) && this.f227307a == ((u6e0) obj).f227307a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d(Boolean.hashCode(this.f227307a) * 31, 31, false);
    }
}
