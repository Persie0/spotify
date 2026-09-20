package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u7c0 extends x7c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f227571a;

    public u7c0(boolean z) {
        this.f227571a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7c0) && this.f227571a == ((u7c0) obj).f227571a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f227571a);
    }
}
