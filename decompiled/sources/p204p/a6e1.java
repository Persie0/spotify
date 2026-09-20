package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final boolean f12784a;

    public a6e1(boolean z) {
        this.f12784a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6e1) && this.f12784a == ((a6e1) obj).f12784a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12784a);
    }
}
