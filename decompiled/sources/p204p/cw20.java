package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cw20 {

    /* JADX INFO: renamed from: a */
    public final int f42606a;

    public cw20(int i) {
        this.f42606a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cw20) && this.f42606a == ((cw20) obj).f42606a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42606a);
    }
}
