package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ye61 implements af61 {

    /* JADX INFO: renamed from: a */
    public final boolean f271927a;

    public ye61(boolean z) {
        this.f271927a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye61) && this.f271927a == ((ye61) obj).f271927a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271927a);
    }
}
