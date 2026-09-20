package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class im70 implements qm70 {

    /* JADX INFO: renamed from: a */
    public final String f103637a;

    public im70(String str) {
        this.f103637a = str;
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
        return (obj instanceof im70) && wj50.m88271j(this.f103637a, ((im70) obj).f103637a);
    }

    public final int hashCode() {
        return this.f103637a.hashCode();
    }
}
