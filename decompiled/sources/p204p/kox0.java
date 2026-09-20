package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kox0 implements lox0 {

    /* JADX INFO: renamed from: a */
    public final boolean f124922a;

    public kox0(boolean z) {
        this.f124922a = z;
    }

    @Override // p204p.lox0
    /* JADX INFO: renamed from: a */
    public final boolean mo53893a() {
        return this.f124922a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kox0) && this.f124922a == ((kox0) obj).f124922a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124922a);
    }
}
