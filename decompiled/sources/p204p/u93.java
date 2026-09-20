package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class u93 implements w93 {

    /* JADX INFO: renamed from: a */
    public final int f228063a;

    public u93(int i) {
        this.f228063a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u93) && this.f228063a == ((u93) obj).f228063a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f228063a);
    }
}
