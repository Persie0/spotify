package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class dx5 implements ktx {

    /* JADX INFO: renamed from: a */
    public final boolean f53853a;

    public dx5(boolean z) {
        this.f53853a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx5) && this.f53853a == ((dx5) obj).f53853a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53853a);
    }
}
