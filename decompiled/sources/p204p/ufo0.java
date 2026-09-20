package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ufo0 implements wfo0 {

    /* JADX INFO: renamed from: a */
    public final int f229851a;

    public ufo0(int i) {
        this.f229851a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufo0) && this.f229851a == ((ufo0) obj).f229851a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f229851a);
    }
}
