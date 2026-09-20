package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zjb implements ekb {

    /* JADX INFO: renamed from: a */
    public final pck f283408a;

    /* JADX INFO: renamed from: b */
    public final boolean f283409b;

    public zjb(pck pckVar, boolean z) {
        this.f283408a = pckVar;
        this.f283409b = z;
    }

    /* JADX INFO: renamed from: a */
    public final pck m96231a() {
        return this.f283408a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m96232b() {
        return this.f283409b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjb)) {
            return false;
        }
        zjb zjbVar = (zjb) obj;
        return wj50.m88271j(this.f283408a, zjbVar.f283408a) && this.f283409b == zjbVar.f283409b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283409b) + (this.f283408a.hashCode() * 31);
    }
}
