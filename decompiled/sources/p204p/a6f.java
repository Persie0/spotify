package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class a6f {

    /* JADX INFO: renamed from: a */
    public final boolean f12785a;

    /* JADX INFO: renamed from: b */
    public final boolean f12786b;

    public a6f(boolean z, boolean z2) {
        this.f12785a = z;
        this.f12786b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6f)) {
            return false;
        }
        a6f a6fVar = (a6f) obj;
        return this.f12785a == a6fVar.f12785a && this.f12786b == a6fVar.f12786b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12786b) + (Boolean.hashCode(this.f12785a) * 31);
    }
}
