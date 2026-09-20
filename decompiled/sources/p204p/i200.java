package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class i200 implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final int f97687a;

    public i200(int i) {
        this.f97687a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i200) && this.f97687a == ((i200) obj).f97687a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f97687a);
    }
}
