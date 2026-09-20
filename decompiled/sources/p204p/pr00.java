package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pr00 implements xr00 {

    /* JADX INFO: renamed from: a */
    public final boolean f180460a;

    public pr00(boolean z) {
        this.f180460a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr00) && this.f180460a == ((pr00) obj).f180460a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f180460a);
    }
}
