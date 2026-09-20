package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class oq61 extends rq61 {

    /* JADX INFO: renamed from: a */
    public final int f168124a;

    public oq61(int i) {
        this.f168124a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq61) && this.f168124a == ((oq61) obj).f168124a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f168124a);
    }
}
