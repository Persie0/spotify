package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class zer0 implements dfr0 {

    /* JADX INFO: renamed from: a */
    public final boolean f282100a;

    public zer0(boolean z) {
        this.f282100a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zer0) && this.f282100a == ((zer0) obj).f282100a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f282100a);
    }
}
