package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lg3 implements ng3 {

    /* JADX INFO: renamed from: a */
    public final boolean f133062a;

    public lg3(boolean z) {
        this.f133062a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg3) && this.f133062a == ((lg3) obj).f133062a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133062a);
    }
}
