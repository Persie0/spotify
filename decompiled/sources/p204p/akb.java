package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class akb implements ekb {

    /* JADX INFO: renamed from: a */
    public final pck f16479a;

    /* JADX INFO: renamed from: b */
    public final pck f16480b;

    /* JADX INFO: renamed from: c */
    public final boolean f16481c;

    public akb(pck pckVar, pck pckVar2, boolean z) {
        this.f16479a = pckVar;
        this.f16480b = pckVar2;
        this.f16481c = z;
    }

    /* JADX INFO: renamed from: a */
    public final pck m26207a() {
        return this.f16479a;
    }

    /* JADX INFO: renamed from: b */
    public final pck m26208b() {
        return this.f16480b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m26209c() {
        return this.f16481c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akb)) {
            return false;
        }
        akb akbVar = (akb) obj;
        return wj50.m88271j(this.f16479a, akbVar.f16479a) && wj50.m88271j(this.f16480b, akbVar.f16480b) && this.f16481c == akbVar.f16481c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16481c) + ((this.f16480b.hashCode() + (this.f16479a.hashCode() * 31)) * 31);
    }
}
