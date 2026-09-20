package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class rg20 implements tg20 {

    /* JADX INFO: renamed from: a */
    public final boolean f198802a;

    public rg20(boolean z) {
        this.f198802a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg20) && this.f198802a == ((rg20) obj).f198802a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198802a);
    }
}
