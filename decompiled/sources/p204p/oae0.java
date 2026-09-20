package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class oae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f163316a;

    public oae0(boolean z) {
        this.f163316a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oae0) && this.f163316a == ((oae0) obj).f163316a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163316a);
    }
}
