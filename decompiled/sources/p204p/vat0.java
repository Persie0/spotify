package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vat0 {

    /* JADX INFO: renamed from: a */
    public final boolean f239328a;

    public vat0(boolean z) {
        this.f239328a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vat0) && this.f239328a == ((vat0) obj).f239328a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239328a);
    }
}
