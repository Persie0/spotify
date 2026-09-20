package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bm1 implements dm1 {

    /* JADX INFO: renamed from: a */
    public final boolean f28346a;

    public bm1(boolean z) {
        this.f28346a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29790a() {
        return this.f28346a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm1) && this.f28346a == ((bm1) obj).f28346a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28346a);
    }
}
