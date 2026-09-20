package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k4c0 {

    /* JADX INFO: renamed from: a */
    public final int f119185a;

    public k4c0(int i) {
        this.f119185a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4c0) && this.f119185a == ((k4c0) obj).f119185a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f119185a);
    }
}
