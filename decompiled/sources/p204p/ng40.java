package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ng40 {

    /* JADX INFO: renamed from: a */
    public final boolean f153549a;

    public ng40(boolean z) {
        this.f153549a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng40) && this.f153549a == ((ng40) obj).f153549a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153549a);
    }
}
