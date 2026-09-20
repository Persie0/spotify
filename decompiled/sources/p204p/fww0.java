package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fww0 implements gww0 {

    /* JADX INFO: renamed from: a */
    public final Class f74188a;

    public fww0(Class cls) {
        this.f74188a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fww0) && this.f74188a.equals(((fww0) obj).f74188a);
    }

    @Override // p204p.gww0
    public final Object getKey() {
        return this.f74188a;
    }

    public final int hashCode() {
        return this.f74188a.hashCode();
    }
}
