package p204p;

/* JADX INFO: renamed from: p.vq */
/* JADX INFO: loaded from: classes4.dex */
public final class C2505vq implements InterfaceC2622yq {

    /* JADX INFO: renamed from: a */
    public final boolean f243818a;

    public C2505vq(boolean z) {
        this.f243818a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2505vq) && this.f243818a == ((C2505vq) obj).f243818a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f243818a);
    }
}
