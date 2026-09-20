package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lai extends nai {

    /* JADX INFO: renamed from: a */
    public final boolean f131346a;

    public lai(boolean z) {
        this.f131346a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lai) && this.f131346a == ((lai) obj).f131346a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131346a);
    }
}
