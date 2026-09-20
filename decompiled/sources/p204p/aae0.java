package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class aae0 extends gae0 {

    /* JADX INFO: renamed from: a */
    public final boolean f13830a;

    public aae0(boolean z) {
        this.f13830a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aae0) && this.f13830a == ((aae0) obj).f13830a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13830a);
    }
}
