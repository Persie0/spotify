package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hm70 implements qm70 {

    /* JADX INFO: renamed from: a */
    public final String f92854a;

    public hm70(String str) {
        this.f92854a = str;
    }

    @Override // p204p.qm70
    /* JADX INFO: renamed from: a */
    public final boolean mo47932a(kmf kmfVar) {
        return kmfVar.m56900c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm70) && wj50.m88271j(this.f92854a, ((hm70) obj).f92854a);
    }

    public final int hashCode() {
        return this.f92854a.hashCode();
    }
}
