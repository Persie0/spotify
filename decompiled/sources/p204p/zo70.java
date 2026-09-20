package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zo70 implements ap70 {

    /* JADX INFO: renamed from: a */
    public final int f284720a;

    public zo70(int i) {
        this.f284720a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zo70) && this.f284720a == ((zo70) obj).f284720a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f284720a);
    }
}
