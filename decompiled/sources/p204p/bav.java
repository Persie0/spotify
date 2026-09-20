package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bav implements iav {

    /* JADX INFO: renamed from: a */
    public final int f25350a;

    public bav(int i) {
        this.f25350a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bav) && this.f25350a == ((bav) obj).f25350a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25350a);
    }
}
