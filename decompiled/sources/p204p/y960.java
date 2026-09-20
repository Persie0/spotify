package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class y960 implements ca60 {

    /* JADX INFO: renamed from: a */
    public final boolean f270517a;

    public y960(boolean z) {
        this.f270517a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y960) && this.f270517a == ((y960) obj).f270517a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f270517a);
    }
}
