package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ca81 implements ea81 {

    /* JADX INFO: renamed from: a */
    public final int f35778a;

    public ca81(int i) {
        this.f35778a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca81) && this.f35778a == ((ca81) obj).f35778a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35778a);
    }
}
