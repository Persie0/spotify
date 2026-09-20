package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yrx implements xrx {

    /* JADX INFO: renamed from: a */
    public final String f275607a;

    public yrx(String str) {
        this.f275607a = str;
    }

    @Override // p204p.xrx
    /* JADX INFO: renamed from: a */
    public final String mo88871a() {
        return this.f275607a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrx) && wj50.m88271j(this.f275607a, ((yrx) obj).f275607a);
    }

    public final int hashCode() {
        return this.f275607a.hashCode();
    }
}
