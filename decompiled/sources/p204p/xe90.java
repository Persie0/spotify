package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class xe90 {

    /* JADX INFO: renamed from: a */
    public final boolean f260668a;

    public xe90(boolean z) {
        this.f260668a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xe90) && this.f260668a == ((xe90) obj).f260668a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f260668a);
    }
}
