package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c3k0 extends h3k0 {

    /* JADX INFO: renamed from: a */
    public final boolean f33698a;

    public c3k0(boolean z) {
        this.f33698a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3k0) && this.f33698a == ((c3k0) obj).f33698a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33698a);
    }
}
