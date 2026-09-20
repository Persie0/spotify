package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class e5d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f56353a;

    /* JADX INFO: renamed from: b */
    public final boolean f56354b;

    public e5d(String str, boolean z) {
        this.f56353a = str;
        this.f56354b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5d)) {
            return false;
        }
        e5d e5dVar = (e5d) obj;
        return wj50.m88271j(this.f56353a, e5dVar.f56353a) && this.f56354b == e5dVar.f56354b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56354b) + (this.f56353a.hashCode() * 31);
    }
}
