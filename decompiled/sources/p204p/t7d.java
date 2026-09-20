package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class t7d implements lad {

    /* JADX INFO: renamed from: a */
    public final boolean f217751a;

    public t7d(boolean z) {
        this.f217751a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80216a() {
        return this.f217751a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7d) && this.f217751a == ((t7d) obj).f217751a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f217751a);
    }
}
