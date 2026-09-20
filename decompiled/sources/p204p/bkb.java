package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class bkb implements ekb {

    /* JADX INFO: renamed from: a */
    public final pck f27889a;

    /* JADX INFO: renamed from: b */
    public final pck f27890b;

    /* JADX INFO: renamed from: c */
    public final boolean f27891c;

    public bkb(pck pckVar, pck pckVar2, boolean z) {
        this.f27889a = pckVar;
        this.f27890b = pckVar2;
        this.f27891c = z;
    }

    /* JADX INFO: renamed from: a */
    public final pck m29672a() {
        return this.f27889a;
    }

    /* JADX INFO: renamed from: b */
    public final pck m29673b() {
        return this.f27890b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m29674c() {
        return this.f27891c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkb)) {
            return false;
        }
        bkb bkbVar = (bkb) obj;
        return wj50.m88271j(this.f27889a, bkbVar.f27889a) && wj50.m88271j(this.f27890b, bkbVar.f27890b) && this.f27891c == bkbVar.f27891c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27891c) + ((this.f27890b.hashCode() + (this.f27889a.hashCode() * 31)) * 31);
    }
}
