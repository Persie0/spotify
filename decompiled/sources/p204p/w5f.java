package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class w5f {

    /* JADX INFO: renamed from: a */
    public final String f248075a;

    /* JADX INFO: renamed from: b */
    public final boolean f248076b;

    public w5f(String str, boolean z) {
        this.f248075a = str;
        this.f248076b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5f)) {
            return false;
        }
        w5f w5fVar = (w5f) obj;
        return wj50.m88271j(this.f248075a, w5fVar.f248075a) && this.f248076b == w5fVar.f248076b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248076b) + (this.f248075a.hashCode() * 31);
    }
}
