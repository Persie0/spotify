package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bbf0 extends dbf0 {

    /* JADX INFO: renamed from: a */
    public final int f25549a;

    public bbf0(int i) {
        this.f25549a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbf0) && this.f25549a == ((bbf0) obj).f25549a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f25549a);
    }
}
