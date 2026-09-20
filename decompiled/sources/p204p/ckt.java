package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ckt implements xmt {

    /* JADX INFO: renamed from: a */
    public final String f39085a;

    public ckt(String str) {
        this.f39085a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckt) && wj50.m88271j(this.f39085a, ((ckt) obj).f39085a);
    }

    public final int hashCode() {
        return this.f39085a.hashCode();
    }
}
