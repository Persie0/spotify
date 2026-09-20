package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jox0 implements lox0 {

    /* JADX INFO: renamed from: a */
    public final boolean f114528a;

    public jox0(boolean z) {
        this.f114528a = z;
    }

    @Override // p204p.lox0
    /* JADX INFO: renamed from: a */
    public final boolean mo53893a() {
        return this.f114528a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jox0) && this.f114528a == ((jox0) obj).f114528a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f114528a);
    }
}
