package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class gu10 implements iu10 {

    /* JADX INFO: renamed from: a */
    public final boolean f84334a;

    public gu10(boolean z) {
        this.f84334a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gu10) && this.f84334a == ((gu10) obj).f84334a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84334a);
    }
}
