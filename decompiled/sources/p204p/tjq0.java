package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tjq0 implements wjq0 {

    /* JADX INFO: renamed from: a */
    public final boolean f220983a;

    public tjq0(boolean z) {
        this.f220983a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjq0) && this.f220983a == ((tjq0) obj).f220983a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220983a);
    }
}
