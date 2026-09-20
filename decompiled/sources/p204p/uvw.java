package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uvw implements u1x {

    /* JADX INFO: renamed from: a */
    public final l580 f234510a;

    /* JADX INFO: renamed from: b */
    public final boolean f234511b;

    public uvw(l580 l580Var, boolean z) {
        this.f234510a = l580Var;
        this.f234511b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvw)) {
            return false;
        }
        uvw uvwVar = (uvw) obj;
        return wj50.m88271j(this.f234510a, uvwVar.f234510a) && this.f234511b == uvwVar.f234511b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f234511b) + (this.f234510a.hashCode() * 31);
    }
}
