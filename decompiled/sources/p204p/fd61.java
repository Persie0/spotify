package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fd61 implements oi0 {

    /* JADX INFO: renamed from: a */
    public final int f68356a;

    public fd61(int i) {
        this.f68356a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fd61) && this.f68356a == ((fd61) obj).f68356a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68356a);
    }
}
