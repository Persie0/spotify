package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class inm0 implements knm0 {

    /* JADX INFO: renamed from: a */
    public final int f104033a;

    public inm0(int i) {
        this.f104033a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inm0) && this.f104033a == ((inm0) obj).f104033a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f104033a);
    }
}
