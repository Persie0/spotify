package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class eh80 implements jh80 {

    /* JADX INFO: renamed from: a */
    public final boolean f59517a;

    public eh80(boolean z) {
        this.f59517a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh80) && this.f59517a == ((eh80) obj).f59517a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59517a);
    }
}
