package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dkb implements ekb {

    /* JADX INFO: renamed from: a */
    public final pck f49948a;

    /* JADX INFO: renamed from: b */
    public final boolean f49949b;

    public dkb(pck pckVar, boolean z) {
        this.f49948a = pckVar;
        this.f49949b = z;
    }

    /* JADX INFO: renamed from: a */
    public final pck m36263a() {
        return this.f49948a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m36264b() {
        return this.f49949b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkb)) {
            return false;
        }
        dkb dkbVar = (dkb) obj;
        return wj50.m88271j(this.f49948a, dkbVar.f49948a) && this.f49949b == dkbVar.f49949b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49949b) + (this.f49948a.hashCode() * 31);
    }
}
