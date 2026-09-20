package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xor0 implements lpr0 {

    /* JADX INFO: renamed from: a */
    public final int f264356a;

    public xor0(int i) {
        this.f264356a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xor0) && this.f264356a == ((xor0) obj).f264356a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f264356a);
    }
}
