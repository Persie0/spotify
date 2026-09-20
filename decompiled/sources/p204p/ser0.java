package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ser0 implements hes0 {

    /* JADX INFO: renamed from: a */
    public final boolean f208381a;

    public ser0(boolean z) {
        this.f208381a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ser0) && this.f208381a == ((ser0) obj).f208381a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208381a);
    }
}
