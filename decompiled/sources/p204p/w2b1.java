package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class w2b1 implements a3b1 {

    /* JADX INFO: renamed from: a */
    public final int f247316a;

    public w2b1(int i) {
        this.f247316a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2b1) && this.f247316a == ((w2b1) obj).f247316a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f247316a);
    }
}
