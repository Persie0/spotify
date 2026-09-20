package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u821 implements b921 {

    /* JADX INFO: renamed from: a */
    public final boolean f227795a;

    public u821(boolean z) {
        this.f227795a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u821) && this.f227795a == ((u821) obj).f227795a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227795a);
    }
}
