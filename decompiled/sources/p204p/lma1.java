package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lma1 implements nma1 {

    /* JADX INFO: renamed from: a */
    public final String f134841a;

    public lma1(String str) {
        this.f134841a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lma1) && wj50.m88271j(this.f134841a, ((lma1) obj).f134841a);
    }

    @Override // p204p.nma1
    public final String getUri() {
        return this.f134841a;
    }

    public final int hashCode() {
        return this.f134841a.hashCode();
    }
}
