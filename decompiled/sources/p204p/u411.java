package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class u411 extends v411 {

    /* JADX INFO: renamed from: a */
    public final int f226560a;

    public u411(int i) {
        this.f226560a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u411) && this.f226560a == ((u411) obj).f226560a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f226560a);
    }
}
