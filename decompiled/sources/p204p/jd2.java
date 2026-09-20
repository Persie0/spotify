package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class jd2 extends md2 {

    /* JADX INFO: renamed from: a */
    public final int f111223a;

    public jd2(int i) {
        this.f111223a = i;
    }

    @Override // p204p.md2
    /* JADX INFO: renamed from: a */
    public final int mo50270a() {
        return this.f111223a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jd2) && this.f111223a == ((jd2) obj).f111223a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f111223a);
    }
}
