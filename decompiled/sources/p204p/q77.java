package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q77 extends s77 {

    /* JADX INFO: renamed from: a */
    public final int f186041a;

    public q77(int i) {
        this.f186041a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q77) && this.f186041a == ((q77) obj).f186041a;
    }

    public final int hashCode() {
        int i = this.f186041a;
        if (i == 0) {
            return 0;
        }
        return edb.m38547C(i);
    }
}
