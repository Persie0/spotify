package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ept0 extends vpt0 {

    /* JADX INFO: renamed from: a */
    public final int f61708a;

    public ept0(int i) {
        this.f61708a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ept0) && this.f61708a == ((ept0) obj).f61708a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f61708a);
    }
}
