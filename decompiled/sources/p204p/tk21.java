package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tk21 {

    /* JADX INFO: renamed from: a */
    public final boolean f221074a;

    public tk21(boolean z) {
        this.f221074a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk21) && this.f221074a == ((tk21) obj).f221074a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221074a);
    }
}
