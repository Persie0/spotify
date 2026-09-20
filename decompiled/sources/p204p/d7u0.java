package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class d7u0 implements e7u0 {

    /* JADX INFO: renamed from: a */
    public final boolean f46275a;

    public d7u0(boolean z) {
        this.f46275a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7u0) && this.f46275a == ((d7u0) obj).f46275a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f46275a);
    }
}
