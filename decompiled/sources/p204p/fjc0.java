package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fjc0 implements hjc0 {

    /* JADX INFO: renamed from: a */
    public final int f70159a;

    public fjc0(int i) {
        this.f70159a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m41798a() {
        return this.f70159a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjc0) && this.f70159a == ((fjc0) obj).f70159a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70159a);
    }
}
