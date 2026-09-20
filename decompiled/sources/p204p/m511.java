package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m511 {

    /* JADX INFO: renamed from: a */
    public final boolean f140078a;

    public m511(boolean z) {
        this.f140078a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m511) && this.f140078a == ((m511) obj).f140078a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140078a);
    }
}
