package p204p;

/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class pd40 {
    public static final od40 Companion = new od40();

    /* JADX INFO: renamed from: a */
    public final String f176349a;

    public pd40() {
        this.f176349a = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd40) && wj50.m88271j(this.f176349a, ((pd40) obj).f176349a);
    }

    public final int hashCode() {
        return this.f176349a.hashCode();
    }

    public /* synthetic */ pd40(int i, String str) {
        if (1 == (i & 1)) {
            this.f176349a = str;
        } else {
            edo.m38617p(i, 1, nd40.f152651a.getDescriptor());
            throw null;
        }
    }
}
