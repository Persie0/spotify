package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bxt implements cxt {

    /* JADX INFO: renamed from: a */
    public final int f31981a;

    public bxt(int i) {
        this.f31981a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxt) && this.f31981a == ((bxt) obj).f31981a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31981a);
    }
}
