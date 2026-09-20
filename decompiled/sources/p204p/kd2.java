package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kd2 extends md2 {

    /* JADX INFO: renamed from: a */
    public final int f121587a;

    public kd2(int i) {
        this.f121587a = i;
    }

    @Override // p204p.md2
    /* JADX INFO: renamed from: a */
    public final int mo50270a() {
        return this.f121587a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd2) && this.f121587a == ((kd2) obj).f121587a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f121587a);
    }
}
