package p204p;

/* JADX INFO: loaded from: classes8.dex */
@rtz0
public final class pya1 {
    public static final oya1 Companion = new oya1();

    /* JADX INFO: renamed from: a */
    public final String f183382a;

    public /* synthetic */ pya1(int i, String str) {
        if (1 == (i & 1)) {
            this.f183382a = str;
        } else {
            edo.m38617p(i, 1, nya1.f159758a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pya1) && wj50.m88271j(this.f183382a, ((pya1) obj).f183382a);
    }

    public final int hashCode() {
        return this.f183382a.hashCode();
    }

    public pya1(String str) {
        this.f183382a = str;
    }
}
