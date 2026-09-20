package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g200 {

    /* JADX INFO: renamed from: a */
    public final boolean f75788a;

    public g200(boolean z) {
        this.f75788a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g200) && this.f75788a == ((g200) obj).f75788a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75788a);
    }
}
