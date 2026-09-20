package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nka0 extends pka0 {

    /* JADX INFO: renamed from: a */
    public final String f154845a;

    public nka0(String str) {
        this.f154845a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nka0) && wj50.m88271j(this.f154845a, ((nka0) obj).f154845a);
    }

    public final int hashCode() {
        return this.f154845a.hashCode();
    }
}
