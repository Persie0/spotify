package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class lbe1 implements nbe1 {

    /* JADX INFO: renamed from: a */
    public final boolean f131655a;

    public lbe1(boolean z) {
        this.f131655a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbe1) && this.f131655a == ((lbe1) obj).f131655a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f131655a);
    }
}
