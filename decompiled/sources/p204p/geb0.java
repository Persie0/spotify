package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class geb0 implements heb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f79074a;

    public geb0(boolean z) {
        this.f79074a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof geb0) && this.f79074a == ((geb0) obj).f79074a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f79074a);
    }
}
