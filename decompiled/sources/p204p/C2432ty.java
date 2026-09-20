package p204p;

/* JADX INFO: renamed from: p.ty */
/* JADX INFO: loaded from: classes8.dex */
public final class C2432ty implements j10 {

    /* JADX INFO: renamed from: a */
    public final float f224789a;

    public C2432ty(float f) {
        this.f224789a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2432ty) && Float.compare(this.f224789a, ((C2432ty) obj).f224789a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f224789a);
    }
}
