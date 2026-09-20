package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kyb1 {

    /* JADX INFO: renamed from: a */
    public final boolean f127780a;

    public kyb1(boolean z) {
        this.f127780a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyb1) && this.f127780a == ((kyb1) obj).f127780a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127780a);
    }
}
