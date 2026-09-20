package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class inr extends pnr {

    /* JADX INFO: renamed from: a */
    public final boolean f104047a;

    public inr(boolean z) {
        this.f104047a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inr) && this.f104047a == ((inr) obj).f104047a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104047a);
    }
}
