package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class sg20 implements tg20 {

    /* JADX INFO: renamed from: a */
    public final int f208687a;

    public sg20(int i) {
        this.f208687a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg20) && this.f208687a == ((sg20) obj).f208687a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f208687a);
    }
}
