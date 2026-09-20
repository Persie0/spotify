package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class id2 extends md2 {

    /* JADX INFO: renamed from: a */
    public final int f100921a;

    public id2(int i) {
        this.f100921a = i;
    }

    @Override // p204p.md2
    /* JADX INFO: renamed from: a */
    public final int mo50270a() {
        return this.f100921a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id2) && this.f100921a == ((id2) obj).f100921a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f100921a);
    }
}
