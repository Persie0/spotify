package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nhv {

    /* JADX INFO: renamed from: a */
    public final String f154087a;

    /* JADX INFO: renamed from: b */
    public final boolean f154088b;

    public nhv(String str, boolean z) {
        this.f154087a = str;
        this.f154088b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhv)) {
            return false;
        }
        nhv nhvVar = (nhv) obj;
        return wj50.m88271j(this.f154087a, nhvVar.f154087a) && this.f154088b == nhvVar.f154088b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154088b) + (this.f154087a.hashCode() * 31);
    }
}
