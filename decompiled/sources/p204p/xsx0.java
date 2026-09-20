package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class xsx0 implements i040 {

    /* JADX INFO: renamed from: a */
    public final String f265686a;

    public xsx0(String str) {
        this.f265686a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsx0) && wj50.m88271j(this.f265686a, ((xsx0) obj).f265686a);
    }

    @Override // p204p.i040
    public final String getId() {
        return this.f265686a;
    }

    public final int hashCode() {
        return this.f265686a.hashCode();
    }
}
