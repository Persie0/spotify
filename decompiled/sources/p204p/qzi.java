package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qzi implements tzi {

    /* JADX INFO: renamed from: a */
    public final int f194209a;

    public qzi(int i) {
        this.f194209a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzi) && this.f194209a == ((qzi) obj).f194209a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f194209a);
    }
}
