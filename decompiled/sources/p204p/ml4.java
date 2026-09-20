package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ml4 {

    /* JADX INFO: renamed from: a */
    public final boolean f144751a;

    public ml4(boolean z) {
        this.f144751a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml4) && this.f144751a == ((ml4) obj).f144751a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f144751a);
    }
}
