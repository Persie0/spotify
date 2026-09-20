package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c6c {

    /* JADX INFO: renamed from: a */
    public final boolean f34482a;

    public c6c(boolean z) {
        this.f34482a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6c) && this.f34482a == ((c6c) obj).f34482a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34482a);
    }
}
