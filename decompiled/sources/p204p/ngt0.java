package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ngt0 implements fuk {

    /* JADX INFO: renamed from: a */
    public final float f153792a;

    public ngt0(float f) {
        this.f153792a = f;
    }

    @Override // p204p.fuk
    /* JADX INFO: renamed from: a */
    public final float mo29770a(long j, yqq yqqVar) {
        return this.f153792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngt0) && Float.compare(this.f153792a, ((ngt0) obj).f153792a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f153792a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f153792a + ".px)";
    }
}
