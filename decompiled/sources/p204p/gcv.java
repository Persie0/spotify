package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gcv implements jcv {

    /* JADX INFO: renamed from: a */
    public final int f78659a;

    public gcv(int i) {
        this.f78659a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcv) && this.f78659a == ((gcv) obj).f78659a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f78659a);
    }
}
