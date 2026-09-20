package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class afb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f15111a;

    public afb1(boolean z) {
        this.f15111a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afb1) && this.f15111a == ((afb1) obj).f15111a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15111a);
    }
}
