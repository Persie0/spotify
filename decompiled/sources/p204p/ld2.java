package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ld2 extends md2 {

    /* JADX INFO: renamed from: a */
    public final int f132029a;

    public ld2(int i) {
        this.f132029a = i;
    }

    @Override // p204p.md2
    /* JADX INFO: renamed from: a */
    public final int mo50270a() {
        return this.f132029a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld2) && this.f132029a == ((ld2) obj).f132029a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f132029a);
    }
}
