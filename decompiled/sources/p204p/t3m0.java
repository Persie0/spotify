package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class t3m0 implements ife {

    /* JADX INFO: renamed from: a */
    public final Class f216803a;

    public t3m0(Class cls) {
        this.f216803a = cls;
    }

    @Override // p204p.ife
    /* JADX INFO: renamed from: A */
    public final Class mo28587A() {
        return this.f216803a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t3m0) {
            return wj50.m88271j(this.f216803a, ((t3m0) obj).f216803a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f216803a.hashCode();
    }

    public final String toString() {
        return this.f216803a.toString() + " (Kotlin reflection is not available)";
    }
}
