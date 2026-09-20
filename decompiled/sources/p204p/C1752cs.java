package p204p;

/* JADX INFO: renamed from: p.cs */
/* JADX INFO: loaded from: classes4.dex */
public final class C1752cs {

    /* JADX INFO: renamed from: a */
    public final boolean f41426a;

    public C1752cs(boolean z) {
        this.f41426a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1752cs) && this.f41426a == ((C1752cs) obj).f41426a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41426a);
    }
}
