package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ll80 implements pl80 {

    /* JADX INFO: renamed from: a */
    public final int f134566a;

    public ll80(int i) {
        this.f134566a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll80) && this.f134566a == ((ll80) obj).f134566a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134566a);
    }
}
