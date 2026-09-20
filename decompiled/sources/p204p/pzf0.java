package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pzf0 implements qzf0 {

    /* JADX INFO: renamed from: a */
    public final boolean f183687a;

    public pzf0(boolean z) {
        this.f183687a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzf0) && this.f183687a == ((pzf0) obj).f183687a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183687a);
    }
}
