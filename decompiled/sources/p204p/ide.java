package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ide {

    /* JADX INFO: renamed from: a */
    public final zce f101085a;

    /* JADX INFO: renamed from: b */
    public final boolean f101086b;

    public ide(zce zceVar, boolean z) {
        this.f101085a = zceVar;
        this.f101086b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ide)) {
            return false;
        }
        ide ideVar = (ide) obj;
        return wj50.m88271j(this.f101085a, ideVar.f101085a) && this.f101086b == ideVar.f101086b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101086b) + (this.f101085a.hashCode() * 31);
    }
}
