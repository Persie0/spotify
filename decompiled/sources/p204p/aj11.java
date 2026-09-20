package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class aj11 extends cj11 {

    /* JADX INFO: renamed from: a */
    public final int f16134a;

    public aj11(int i) {
        this.f16134a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj11) && this.f16134a == ((aj11) obj).f16134a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f16134a);
    }
}
