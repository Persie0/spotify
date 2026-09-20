package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tu7 implements uu7 {

    /* JADX INFO: renamed from: a */
    public final int f223779a;

    public tu7(int i) {
        this.f223779a = i;
    }

    @Override // p204p.uu7
    /* JADX INFO: renamed from: a */
    public final int mo73877a() {
        return this.f223779a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu7) && this.f223779a == ((tu7) obj).f223779a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f223779a);
    }
}
