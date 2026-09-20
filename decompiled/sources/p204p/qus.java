package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qus {

    /* JADX INFO: renamed from: a */
    public final boolean f192801a;

    public qus(boolean z) {
        this.f192801a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qus) && this.f192801a == ((qus) obj).f192801a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f192801a);
    }
}
