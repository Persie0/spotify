package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o901 implements x901 {

    /* JADX INFO: renamed from: a */
    public final int f162904a;

    public o901(int i) {
        this.f162904a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o901) && this.f162904a == ((o901) obj).f162904a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f162904a);
    }
}
