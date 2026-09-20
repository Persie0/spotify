package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zdl implements cel {

    /* JADX INFO: renamed from: a */
    public final int f281733a;

    public zdl(int i) {
        this.f281733a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdl) && this.f281733a == ((zdl) obj).f281733a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f281733a);
    }
}
