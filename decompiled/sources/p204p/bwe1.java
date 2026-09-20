package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class bwe1 extends nwe1 {

    /* JADX INFO: renamed from: a */
    public final boolean f31642a;

    public bwe1(boolean z) {
        this.f31642a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwe1) && this.f31642a == ((bwe1) obj).f31642a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31642a);
    }
}
