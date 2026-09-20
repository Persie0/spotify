package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class um21 {

    /* JADX INFO: renamed from: a */
    public final boolean f231710a;

    public um21(boolean z) {
        this.f231710a = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m83419a() {
        return this.f231710a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um21) && this.f231710a == ((um21) obj).f231710a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f231710a);
    }
}
