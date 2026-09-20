package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class si61 implements ui61 {

    /* JADX INFO: renamed from: a */
    public final ndl f209364a;

    public si61(ndl ndlVar) {
        this.f209364a = ndlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si61) && this.f209364a.equals(((si61) obj).f209364a);
    }

    public final int hashCode() {
        return this.f209364a.f152799a.hashCode();
    }
}
