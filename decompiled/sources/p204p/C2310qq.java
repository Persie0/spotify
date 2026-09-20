package p204p;

/* JADX INFO: renamed from: p.qq */
/* JADX INFO: loaded from: classes4.dex */
public final class C2310qq {

    /* JADX INFO: renamed from: a */
    public final boolean f191404a;

    public C2310qq(boolean z) {
        this.f191404a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2310qq) && this.f191404a == ((C2310qq) obj).f191404a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191404a);
    }
}
