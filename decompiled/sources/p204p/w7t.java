package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w7t {

    /* JADX INFO: renamed from: a */
    public final String f248779a;

    /* JADX INFO: renamed from: b */
    public final String f248780b;

    public w7t(String str, String str2) {
        this.f248779a = str;
        this.f248780b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7t)) {
            return false;
        }
        w7t w7tVar = (w7t) obj;
        return wj50.m88271j(this.f248779a, w7tVar.f248779a) && wj50.m88271j(this.f248780b, w7tVar.f248780b);
    }

    public final int hashCode() {
        return this.f248780b.hashCode() + (this.f248779a.hashCode() * 31);
    }
}
