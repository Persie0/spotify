package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ixz {

    /* JADX INFO: renamed from: a */
    public final boolean f106802a;

    /* JADX INFO: renamed from: b */
    public final boolean f106803b;

    /* JADX INFO: renamed from: c */
    public final boolean f106804c;

    public ixz(boolean z, boolean z2, boolean z3) {
        this.f106802a = z;
        this.f106803b = z2;
        this.f106804c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixz)) {
            return false;
        }
        ixz ixzVar = (ixz) obj;
        return this.f106802a == ixzVar.f106802a && this.f106803b == ixzVar.f106803b && this.f106804c == ixzVar.f106804c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106804c) + s571.m77245d(Boolean.hashCode(this.f106802a) * 31, 31, this.f106803b);
    }
}
