package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class iz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final int f107120a;

    public iz21(int i) {
        this.f107120a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz21) && this.f107120a == ((iz21) obj).f107120a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f107120a);
    }
}
