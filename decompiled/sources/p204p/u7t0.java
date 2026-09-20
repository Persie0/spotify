package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class u7t0 implements x7t0 {

    /* JADX INFO: renamed from: a */
    public final int f227751a;

    public u7t0(int i) {
        this.f227751a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7t0) && this.f227751a == ((u7t0) obj).f227751a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f227751a);
    }
}
