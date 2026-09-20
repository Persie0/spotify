package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bf1 implements cf1 {

    /* JADX INFO: renamed from: a */
    public final int f26512a;

    public bf1(int i) {
        this.f26512a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf1) && this.f26512a == ((bf1) obj).f26512a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26512a);
    }
}
