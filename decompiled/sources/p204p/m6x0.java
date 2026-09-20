package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m6x0 implements a7x0 {

    /* JADX INFO: renamed from: a */
    public final boolean f140597a;

    public m6x0(boolean z) {
        this.f140597a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6x0) && this.f140597a == ((m6x0) obj).f140597a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140597a);
    }
}
