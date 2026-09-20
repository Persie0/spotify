package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class el10 implements gl10 {

    /* JADX INFO: renamed from: a */
    public final boolean f60569a;

    public el10(boolean z) {
        this.f60569a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el10) && this.f60569a == ((el10) obj).f60569a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60569a);
    }
}
