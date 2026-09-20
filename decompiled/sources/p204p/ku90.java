package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ku90 extends mu90 {

    /* JADX INFO: renamed from: a */
    public final int f126489a;

    public ku90(int i) {
        this.f126489a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku90) && this.f126489a == ((ku90) obj).f126489a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f126489a);
    }
}
