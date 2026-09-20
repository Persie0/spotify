package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class x530 implements z530 {

    /* JADX INFO: renamed from: a */
    public final int f258267a;

    public x530(int i) {
        this.f258267a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m89961a() {
        return this.f258267a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x530) && this.f258267a == ((x530) obj).f258267a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f258267a);
    }
}
