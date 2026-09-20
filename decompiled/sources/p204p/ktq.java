package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ktq {

    /* JADX INFO: renamed from: a */
    public final itq f126373a;

    /* JADX INFO: renamed from: b */
    public final itq f126374b;

    /* JADX INFO: renamed from: c */
    public final itq f126375c;

    /* JADX INFO: renamed from: d */
    public final itq f126376d;

    /* JADX INFO: renamed from: e */
    public final itq f126377e;

    public ktq() {
        itq itqVar = ltq.f136842a;
        itq itqVar2 = ltq.f136843b;
        itq itqVar3 = ltq.f136844c;
        itq itqVar4 = ltq.f136845d;
        itq itqVar5 = ltq.f136846e;
        this.f126373a = itqVar;
        this.f126374b = itqVar2;
        this.f126375c = itqVar3;
        this.f126376d = itqVar4;
        this.f126377e = itqVar5;
    }

    /* JADX INFO: renamed from: a */
    public final itq m57359a() {
        return this.f126373a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktq)) {
            return false;
        }
        ktq ktqVar = (ktq) obj;
        return wj50.m88271j(this.f126373a, ktqVar.f126373a) && wj50.m88271j(this.f126374b, ktqVar.f126374b) && wj50.m88271j(this.f126375c, ktqVar.f126375c) && wj50.m88271j(this.f126376d, ktqVar.f126376d) && wj50.m88271j(this.f126377e, ktqVar.f126377e);
    }

    public final int hashCode() {
        return this.f126377e.hashCode() + ((this.f126376d.hashCode() + ((this.f126375c.hashCode() + ((this.f126374b.hashCode() + (this.f126373a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DepthEffectLevels(level1=" + this.f126373a + ", level2=" + this.f126374b + ", level3=" + this.f126375c + ", level4=" + this.f126376d + ", level5=" + this.f126377e + ")";
    }
}
