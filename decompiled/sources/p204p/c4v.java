package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c4v implements g4v {

    /* JADX INFO: renamed from: a */
    public final int f34014a;

    public c4v(int i) {
        this.f34014a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4v) && this.f34014a == ((c4v) obj).f34014a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f34014a);
    }
}
