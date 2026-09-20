package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class lm70 implements qm70 {

    /* JADX INFO: renamed from: a */
    public final String f134807a;

    public lm70(String str) {
        this.f134807a = str;
    }

    @Override // p204p.qm70
    /* JADX INFO: renamed from: a */
    public final boolean mo47932a(kmf kmfVar) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm70) && wj50.m88271j(this.f134807a, ((lm70) obj).f134807a);
    }

    public final int hashCode() {
        return this.f134807a.hashCode();
    }
}
