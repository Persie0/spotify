package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u4e1 implements a5e1 {

    /* JADX INFO: renamed from: a */
    public final int f226678a;

    public u4e1(int i) {
        this.f226678a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4e1) && this.f226678a == ((u4e1) obj).f226678a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f226678a);
    }
}
