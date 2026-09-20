package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class xja0 extends jka0 {

    /* JADX INFO: renamed from: a */
    public final boolean f262082a;

    public xja0(boolean z) {
        this.f262082a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xja0) && this.f262082a == ((xja0) obj).f262082a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f262082a);
    }
}
