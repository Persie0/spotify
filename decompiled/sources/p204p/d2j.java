package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d2j implements e2j {

    /* JADX INFO: renamed from: a */
    public final boolean f44570a;

    public d2j(boolean z) {
        this.f44570a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2j) && this.f44570a == ((d2j) obj).f44570a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44570a);
    }
}
