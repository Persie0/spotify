package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jx60 implements kx60 {

    /* JADX INFO: renamed from: a */
    public final boolean f116818a;

    public jx60(boolean z) {
        this.f116818a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx60) && this.f116818a == ((jx60) obj).f116818a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116818a);
    }
}
