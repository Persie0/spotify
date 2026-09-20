package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class efl implements ffl {

    /* JADX INFO: renamed from: a */
    public final boolean f59065a;

    public efl(boolean z) {
        this.f59065a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efl) && this.f59065a == ((efl) obj).f59065a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59065a);
    }
}
