package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m240 {

    /* JADX INFO: renamed from: a */
    public final boolean f139216a;

    public m240(boolean z) {
        this.f139216a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m240) && this.f139216a == ((m240) obj).f139216a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139216a);
    }
}
