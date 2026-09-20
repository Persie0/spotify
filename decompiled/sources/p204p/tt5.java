package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tt5 implements vt5 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2524w8 f223520a;

    public tt5(AbstractC2524w8 abstractC2524w8) {
        this.f223520a = abstractC2524w8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt5) && wj50.m88271j(this.f223520a, ((tt5) obj).f223520a);
    }

    public final int hashCode() {
        return this.f223520a.hashCode();
    }
}
