package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tw51 implements s5f0 {

    /* JADX INFO: renamed from: a */
    public final int f224316a;

    public tw51(int i) {
        this.f224316a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tw51) && this.f224316a == ((tw51) obj).f224316a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f224316a);
    }
}
