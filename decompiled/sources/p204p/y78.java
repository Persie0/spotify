package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class y78 {

    /* JADX INFO: renamed from: a */
    public final boolean f269989a;

    public y78(boolean z) {
        this.f269989a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y78) && this.f269989a == ((y78) obj).f269989a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269989a);
    }
}
